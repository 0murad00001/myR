package src.day6;

public class Task3 {
    public static void main(String[] args){
        Teacher teacher = new Teacher(" Александр Петрович", "Математика");
        Student student = new Student("Коля");
        teacher.evalate(student);
    }
}
