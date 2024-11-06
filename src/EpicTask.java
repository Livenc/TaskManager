import java.util.ArrayList;

public class EpicTask extends Task{
ArrayList<SubTask> subTasks = new ArrayList<>();

public EpicTask (String taskName, String taskDescription, Integer taskID, Task.Status taskStatus){
    super(taskName, taskDescription, taskID, taskStatus);
}
public void AddSubTask(SubTask subTask){
    subTasks.add(subTask);
}
void Status(){
    for(SubTask s : subTasks){
        
    }
}
}
