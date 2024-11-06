public class Task {
private String taskName;
private String taskDescription;
private Integer taskID;
private Status taskStatus;


public enum Status {
    NEW, 
    IN_PROGRESS,
    DONE
}



public Task(String taskName, String taskDescription, Integer taskID, Task.Status taskStatus) {
    this.taskName = taskName;
    this.taskDescription = taskDescription;
    this.taskID = taskID;
    this.taskStatus = taskStatus;
}



public String getTaskName() {
    return taskName;
}



public String getTaskDescription() {
    return taskDescription;
}



public Integer getTaskID() {
    return taskID;
}



public Status getTaskStatus() {
    return taskStatus;
}



public void setTaskName(String taskNamr) {
    this.taskName = taskNamr;
}



public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
}



public void setTaskID(Integer taskID) {
    this.taskID = taskID;
}



public void setTaskStatus(Status taskStatus) {
    this.taskStatus = taskStatus;
}

}