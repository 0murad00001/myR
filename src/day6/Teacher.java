package src.day6;
import java.util.Random;

public class Teacher {
    Random random = new Random();
    String name;
    String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evalate(Student student){
        int ocenka = random.nextInt(4)+2;
        String result=null;

        switch(ocenka){
            case(2):{result ="неудовлетворительно";}break;
            case(3):{ result ="удовлетворительно";}break;
            case(4):{ result ="хорошо";}break;
            case(5):{ result ="отлично";}break;
        }

        System.out.println("Преподаватель - " +name+ " , оценил студента с именем: "+  student.getName() +" , по предмету- "+ subject+ " , на оценку- "+ result);

    }
}
