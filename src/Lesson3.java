package src;

import java.util.Scanner;
public class Lesson3 {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);

       //////////////////////Задание1/////////////////////
        System.out.println("                 Задание 1");
       while(true){
           System.out.println();
           System.out.println("Введите наименование города");
           String city = scanner.nextLine();
           System.out.println();
           System.out.println();
           if(city.equals("Stop")) {
               System.out.println("Программа завершила работу");
               break;
           }
               switch (city) {
                   case "Москва":
                   case "Владивотсток":
                   case "Ростов":
                       System.out.println("Россия");
                       break;
                   case "Рим":
                   case "Милан":
                   case "Турин":
                       System.out.println("Италия");
                       break;
                   case "Ливерпуль":
                   case "Манчестер":
                   case "Лондон":
                       System.out.println("Англия");
                       break;
                   case "Берлин":
                   case "Мюнхен":
                   case "Кельн":
                       System.out.println("Германия");
                       break;
                   default:
                       System.out.println("Неизвестная страна");
                       break;
           }

       }

        System.out.println();
        System.out.println("                 Задание 2");
/////////////Задание 2//////////////////////

        double c;

        while(true){

            double a= scanner.nextDouble();
            double b =scanner.nextDouble();
            while(b!=0) {
                c = a / b;
                System.out.println(c);
                break;
            }
            if(b==0){
                break;
            }
        }


/////////////////Задание 3//////////////////
        System.out.println();
        System.out.println("                 Задание 3");
        while(true){
            for(int i =0; i<5; i++ ){
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double d ;
                d=a/b;
                if (b==0){
                    System.out.println("Деление на 0");
                    continue;

                }
                System.out.println(d);
            }
break;
        }


    }
}

