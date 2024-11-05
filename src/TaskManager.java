import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
int id = 0;
HashMap <Integer,Task> taskHashMap = new HashMap<>();//
HashMap <Integer, SubTask> subTaskHashMap = new HashMap<>();
HashMap <Integer, SubTask> subTaskHashMap = new HashMap<>();
HashMap <EpicTask, HashMap<Integer,SubTask>> firstEpicTaskHashMap = new HashMap<>();
// HashMap <Integer, HashMap<EpicTask, HashMap<Integer,SubTask>>> epicTaskHashMap = new HashMap<>();
ArrayList<Task> tasks = new ArrayList<>();

public void AddSubTaskToEpicTask(int idEpicTask, SubTask subTask){
    
}

public void AddSubTask(int idSubTask,SubTask subTask){

for (EpicTask epicTask : firstEpicTaskHashMap.keySet()){
    if(epicTask.getTaskID() == idSubTask){
        id++;
        subTaskHashMap.put(id, subTask);
        firstEpicTaskHashMap.put(epicTask)
    }
}
}
public void AddTask(Task task){
    id++;
    taskHashMap.put(id, task);
}

}
