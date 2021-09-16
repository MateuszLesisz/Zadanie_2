package pl.infoshare;

public class Task {
    private String numberOfEx;
    private String taskDescription;
    private  int maxPoints;

    public String getNumberOfEx() {
        return numberOfEx;
    }
    public Task(String numberOfEx, String taskDescription, int maxPoints) {
        this.numberOfEx = numberOfEx;
        this.taskDescription = taskDescription;
        this.maxPoints = maxPoints;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public int getMaxPoints() {
        return maxPoints;
    }


}
