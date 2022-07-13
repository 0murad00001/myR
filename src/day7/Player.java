package src.day7;

public class Player {
    private int stamima;
    private final  int MAX_STAMINA =100;
    private final  int MIN_STAMINA =0;
    static int countPlayers =0;

    Player(int stamima){     //выносливасть разная у каждого игрока, инициализция идет тут через конструктор
        this.stamima =stamima;

        countPlayers++;
        if(countPlayers>6){
            countPlayers=6;
        }
        if(stamima==0 && stamima<0){
            countPlayers--;
        }
    }

    public int getStamima(){
        return this.stamima;
    }
    public int getCountPlayers(){
        return this.countPlayers;
    }

    void run(){
        System.out.println("Игрок бежит и его выносливость равна " + getStamima());
        stamima = stamima-10;
        System.out.println("Игрок бежит и теперь его выносливость равна " + getStamima());
        if(stamima==0 || stamima<0){
            System.out.println("Игрок покидает поле "+ (countPlayers--));
        }
    }

    static void info(){
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле есть еще " + (6-countPlayers)+ " Свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }

    }



}
