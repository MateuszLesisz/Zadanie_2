package pl.infoshare;

public class Student {
    private String name;
    private String lastName;
    private String loginGitHub;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getLoginGitHub() {
        return loginGitHub;
    }
    public Student(String name, String lasName, String loginGitHub) {
        this.name = name;
        this.lastName = lasName;
        this.loginGitHub = loginGitHub;
    }
}

