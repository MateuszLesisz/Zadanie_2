package pl.infoshare;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Task task1 = new Task("Ex1 ", "Podaj datę Bitwy pod Grunwaldem", 5);
        Task task2 = new Task("Ex2 ", "Podaj datę Bitwy pod Płowcami", 2);
        Task task3 = new Task("Ex3 ", "Podaj datę Bitwy pod Wiedniem", 3);
        Task task4 = new Task("Ex4 ", "Podaj datę Bitwy pod Cieszynem", 4);
        Task task5 = new Task("Ex5 ", "Podaj datę Bitwy pod Stalingradem", 5);


        Student student1 = new Student("Kamil", "Jeziorski", "www.Github.com/KamilJeziorski");
        Student student2 = new Student("Tomek", "Klimaczak", "www.Github.com/TomekKlimczak");
        Student student3 = new Student("Andrzej", "Fafara", "www.Github.com/Andrzej fąfara");
        Student student4 = new Student("Jakub", "Gambis", "www.Github.com/JakubGambis");
        Student student5 = new Student("Aleksander", "Jabłonowski", "www.Github.com/Aleksander Jabłonowski");

        MarkForEx markForEx1 = new MarkForEx(task1.getNumberOfEx(), student1.getName(),3, "Fantastyczna robota!");
        MarkForEx markForEx2 = new MarkForEx(task2.getNumberOfEx(), student2.getName(),2, "Fantastyczna robota!");
        MarkForEx markForEx3 = new MarkForEx(task3.getNumberOfEx(), student3.getName(),1, "Fantastyczna robota!");
        MarkForEx markForEx4 = new MarkForEx(task3.getNumberOfEx(), student3.getName(),4, "Fantastyczna robota!");
        MarkForEx markForEx5 = new MarkForEx(task3.getNumberOfEx(), student3.getName(),2, "Fantastyczna robota!");



        System.out.println(student1.getName() + " " +  student1.getLastName() + " za zadanie " + task1.getNumberOfEx() + "otrzymał " + markForEx1.getSumPoints() + " pkt.");
        System.out.println(student2.getName() + " " +  student2.getLastName() + " za zadanie " + task2.getNumberOfEx() + "otrzymał " + markForEx2.getSumPoints() + " pkt.");
        System.out.println(student3.getName() + " " +  student3.getLastName() + " za zadanie " + task3.getNumberOfEx() + "otrzymał " + markForEx3.getSumPoints() + " pkt.");
        System.out.println(student4.getName() + " " +  student4.getLastName() + " za zadanie " + task4.getNumberOfEx() + "otrzymał " + markForEx4.getSumPoints() + " pkt.");
        System.out.println(student5.getName() + " " +  student5.getLastName() + " za zadanie " + task5.getNumberOfEx() + "otrzymał " + markForEx5.getSumPoints() + " pkt.");


    }
}
