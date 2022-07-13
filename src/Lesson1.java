package src;

public class Lesson1 {
public static void main(String[] args){
   //1
    int i = 0;
    while (i<10){
        System.out.print("JAVA ");
        i++;
    }
    System.out.println(" - Это цикл WHILE");


    //2
    for(int x = 0; x<10; ++x){
        System.out.print("JAVA ");
    }
    System.out.println(" - Это цикл FOR");
    System.out.println();
    //3
    for(int z = 0; z<10; ++z){
        System.out.println("JAVA ");
    }
    System.out.println(" - Это цикл FOR в столбик");

    //4
int year = 1980;
    while (year<=2020){
        System.out.println("Олимпиада" + year+ "года");
        year+=4;
    }
    System.out.println();

    //5
    for(int year2=1980; year2<=2020; year2+=4){
        System.out.println("Олимпиада" + year2+ "года");
    }

    //6
    System.out.println();
    int k = 5;

    for(int x =1; x<10; x++){
        System.out.println(x+ " * " + k +" = " + x*k);

    }



}
}
