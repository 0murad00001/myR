import java.sql.SQLOutput;
import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args){
        //1
      /* Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>=1 && x<=4){
            System.out.println("Малоэтажный дом");
        } else if (x>=5 && x<=8){
            System.out.println("Среднеэтажный дом");
        } else if( x>9 ){
            System.out.println("Многоэтажный дом");
        } else if(x <= 0){
            System.out.println("Ошибка ввода");
        }

        //2

        Scanner scanner1 = new Scanner(System.in);

        int a = scanner1.nextInt(); //7         8
        int b = scanner1.nextInt(); //78        true

        for (int i= a +1; i<b; i++){
            if(i%5==0 && i%10 !=0){
                System.out.println(i+ " ");
            }
        }

        //3

        Scanner scanner2 = new Scanner(System.in);
        int a1 = scanner2.nextInt(); // 8
        int b1 = scanner2.nextInt(); //78
        int counter=a1+1;
        while(counter<b1) {
            if (counter % 5 == 0 && counter % 10 != 0) {
                System.out.println(counter);


            }
            counter++;
        }*/

        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        double y;
        if(d>-3 && d< 5){
            y = (d+3)*(d*d-2);
        } else if(d>=5){
            y = (Math.pow(d,2)-10)/(d+7);
        } else{
            y = 420;
        }
        System.out.println(y);

    }
}
