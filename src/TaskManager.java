
import java.util.HashMap;


public class TaskManager {
Integer id = 0;  // Ид задачи(начальное значение)
HashMap <Integer,Task> taskHashMap = new HashMap<>();  //Колекция задач
HashMap <Integer, SubTask> subTaskHashMap = new HashMap<>();  //Колекция подзадач
HashMap <Integer, EpicTask> epicTaskHashMap = new HashMap<>();  // Колекция епических задач

HashMap<Integer, Task> allTaskHashMap = new HashMap<>();

public void AddEpicTask(EpicTask epicTask){
   
    id++;
    epicTask.setTaskStatus(Status.NEW);
    epicTask.setTaskID(id);
    epicTaskHashMap.put(id, epicTask);
    allTaskHashMap.put(id, epicTask);
    
}

public void AddSubTask(SubTask subTask){
  
  if(epicTaskHashMap.containsKey(subTask.getEpicTaskId())){
    id++;
    subTask.setTaskID(id);
    subTaskHashMap.put(id, subTask);
    allTaskHashMap.put(id, subTask);
    ChekEpicStatus(subTask.getEpicTaskId());
  }
  else{
    System.out.println("Not epic task");
  }

}

public void AddTask(Task task){
    id++;
    task.setTaskID(id);
    taskHashMap.put(id, task);
    allTaskHashMap.put(id, task);
}

public void ViewAllEpicTask(){
    for(Integer iD: epicTaskHashMap.keySet()){
       System.out.println(epicTaskHashMap.get(iD).toString()); 
    }
}
public void ViewAllTask(){
    for(Integer iD : taskHashMap.keySet()){
        System.out.println(taskHashMap.get(iD).toString()); 
     }
}
public void ViewAllAllTask(){
    for(Integer iD : allTaskHashMap.keySet()){
        System.out.println(allTaskHashMap.get(iD).toString()); 
     }
}

public void ViewAllSubTask(){
    for(Integer iD : subTaskHashMap.keySet()){
        System.out.println(subTaskHashMap.get(iD).toString());
    }
}
public void ViewEpicTask(Integer iD){
    if(epicTaskHashMap.containsKey(iD)){
        System.out.println(epicTaskHashMap.get(iD).toString());
    }else{
        System.out.println("Not have id");
    }
}
public void ViewTask(Integer iD){
    if(taskHashMap.containsKey(iD)){
        System.out.println(taskHashMap.get(iD).toString());
    }else{
        System.out.println("Not have id");
    }
}
public void ViewSupTask(Integer iD){
    if(subTaskHashMap.containsKey(iD)){
        System.out.println(subTaskHashMap.get(iD).toString());
    }else{
        System.out.println("Not have id");
    }
}
public void UpdateEpicTask(Integer iD, EpicTask epicTask){
    if(epicTaskHashMap.containsKey(iD)){
        epicTaskHashMap.put(iD,epicTask);
    }else{
        System.out.println("Not epic id");
    }
}
public void UpdateTask(Integer iD, Task Task){
    if(taskHashMap.containsKey(iD)){
        taskHashMap.put(iD,Task);
    }else{
        System.out.println("Not task id");
    }
}
public void UpdateSubTask(Integer iD, SubTask subTask){
    if(subTaskHashMap.containsKey(iD)){
        subTask.setTaskID(iD);
        subTaskHashMap.put(iD,subTask);
        ChekEpicStatus(subTask.getEpicTaskId());
    }else{
        System.out.println("Not epic id");
    }
}
public void DeleteEpicTask(Integer iD){
    if(epicTaskHashMap.containsKey(iD)){
        for(Integer subID : subTaskHashMap.keySet()){
        SubTask sub = subTaskHashMap.get(subID);
            if(sub.getEpicTaskId().equals(iD)){
                subTaskHashMap.remove(subID);
            }   
        }
        epicTaskHashMap.remove(iD);
        allTaskHashMap.remove(iD);
    }
}
public void DeleteTask(Integer iD){
    if(taskHashMap.containsKey(iD)){
        taskHashMap.remove(iD);
    }
}
public void DeleteSubTask(Integer iD){
    if(subTaskHashMap.containsKey(iD)){
        subTaskHashMap.remove(iD);
    }
}
 public void ViewAllSubTaskInEpicTask(Integer iD){
    if(epicTaskHashMap.containsKey(iD)){
        System.out.println(epicTaskHashMap.get(iD).toString());
        System.out.println("--------------------");
        for(Integer iDSub : subTaskHashMap.keySet()){
            if(subTaskHashMap.get(iDSub).getEpicTaskId().equals(iD)){
                System.out.println(subTaskHashMap.get(iDSub).toString());
            }
        }
    }
 }
 void ChekEpicStatus(Integer iDEpic){
    Integer countNew=0;
    Integer countInProgress = 0;
    Integer countDone = 0;
    for(Integer idSub : subTaskHashMap.keySet()){
        if(subTaskHashMap.get(idSub).getEpicTaskId().equals(iDEpic)){
            if(subTaskHashMap.get(idSub).getTaskStatus().equals(Status.NEW)){
                countNew++;
            }else if(subTaskHashMap.get(idSub).getTaskStatus().equals(Status.IN_PROGRESS)){
                countInProgress++;
            }else{
                countDone++;
            }
        }
    }
    if(countInProgress>0){
        epicTaskHashMap.get(iDEpic).setTaskStatus(Status.IN_PROGRESS);
    }else if (countNew>=0 | countDone==0){
        epicTaskHashMap.get(iDEpic).setTaskStatus(Status.NEW);
    }else{
        epicTaskHashMap.get(iDEpic).setTaskStatus(Status.DONE);
    }
 }
}