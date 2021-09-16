package pl.infoshare;

public class MarkForEx {
    private Task task;
    private Student student;
    private int sumPoints;
    private String feedback;

    public MarkForEx(String numberOfEx, String name, int sumPoints, String feedback) {
        this.task = task;
        this.student = student;
        this.sumPoints = sumPoints;
        this.feedback = feedback;
    }

    public Task getTask() {
        return task;
    }

    public Student getStudent() {
        return student;
    }

    public String getFeedback() {
        return feedback;
    }

    public int getSumPoints() {
        return sumPoints;
    }

    }

