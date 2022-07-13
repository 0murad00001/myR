package src.day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        Player player1 = new Player(random.nextInt(90,100));
        Player player2 = new Player(random.nextInt(90,100));
        Player player3 = new Player(random.nextInt(90,100));
        Player player4 = new Player(random.nextInt(90,100));
        Player player5 = new Player(random.nextInt(90,100));
        Player player6 = new Player(random.nextInt(90,100));



        Player.info();

        //System.out.println("Выносливость игрока изначальная  " + player1.getStamima());
        //System.out.println();

        for(int i =0; i<10; i++){
            player1.run();
        }


        System.out.println("efeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        for(int x =0; x<10; x++){
            player2.run();
        }



        Player.info();
        Player.info();






    }
}
