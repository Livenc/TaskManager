public class SubTask extends Task{
private Integer epicTaskId;
public Integer getEpicTaskId() {
    return epicTaskId;
}
public void setEpicTaskId(Integer epicTaskId) {
    this.epicTaskId = epicTaskId;
}
public SubTask (String taskName, String taskDescription,  Status taskStatus, Integer epicTaskId){
    super(taskName, taskDescription, taskStatus);
    this.epicTaskId = epicTaskId;
}


}
