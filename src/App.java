




public class App {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
    EpicTask epicTask = new EpicTask("-1 Epic Task","TestFerst");
    EpicTask epicTask1 = new EpicTask("-2 Epic Task","TestFerst");
    SubTask subTask = new SubTask("-1 Subtask 3 Super", "3Sup", Status.IN_PROGRESS, 3);
    EpicTask epicTask2 = new EpicTask("-3 Epic Task","TestFerst");
       // taskManager.AddEpicTask(epicTask);
    taskManager.AddEpicTask(epicTask);
    taskManager.AddEpicTask(epicTask1);
    taskManager.AddEpicTask(epicTask2);
taskManager.ViewAllEpicTask();
    taskManager.AddSubTask(subTask);

    taskManager.ViewAllEpicTask();
    taskManager.ViewAllSubTaskInEpicTask(3);
    SubTask subTask1 = new SubTask("-1 Subtask 3 Super", "3Sup", Status.DONE,3);
    taskManager.UpdateSubTask(4, subTask1);
    taskManager.ViewAllSubTaskInEpicTask(3);
    taskManager.DeleteEpicTask(1);
        System.out.println("Hello, World!");
        taskManager.ViewAllAllTask();
    }

}
