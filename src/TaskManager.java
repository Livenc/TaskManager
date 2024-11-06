import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
Integer id = 0;
HashMap <Integer,Task> taskHashMap = new HashMap<>();//
HashMap <Integer, SubTask> subTaskHashMap = new HashMap<>();
HashMap <Integer, EpicTask> epicTaskHashMap = new HashMap<>();
ArrayList<HashMap<Integer,SubTask>> subTaskArrayList = new ArrayList<>();
HashMap <Integer, ArrayList<HashMap<Integer,SubTask>>> firstEpicTaskHashMap = new HashMap<>();
// HashMap <Integer, HashMap<EpicTask, HashMap<Integer,SubTask>>> epicTaskHashMap = new HashMap<>();


public void AddSubTaskToEpicTask(EpicTask epicTask){
    id++;
    epicTaskHashMap.put(id, epicTask);
}

public void AddSubTask(Integer idEpicTask,SubTask subTask){

if(epicTaskHashMap.containsKey(idEpicTask)){
    id++;
    subTaskHashMap.put(id,subTask);
    subTaskArrayList.add(subTaskHashMap);
    firstEpicTaskHashMap.put(idEpicTask,subTaskArrayList);
}

}
public void AddTask(Task task){
    id++;
    taskHashMap.put(id, task);
}

}
