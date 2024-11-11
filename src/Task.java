enum Status {
    NEW, 
    IN_PROGRESS,
    DONE,
}
public class Task {
    
private String taskName; //Имя задачи
private String taskDescription; // Описание задачи
private Integer taskID;  // Ид задачи


private Status taskStatus;  // Cтатус  задачи






public Task(String taskName, String taskDescription, Status taskStatus) {
    this.taskName = taskName;
    this.taskDescription = taskDescription;

    this.taskStatus = taskStatus;
}

public Task(String taskName, String taskDescription) {
    this.taskName = taskName;
    this.taskDescription = taskDescription;

    
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

@Override 
public String toString(){
    return String.valueOf(taskID) + " " + taskName + " " + taskStatus;
}


}