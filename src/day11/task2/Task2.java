package src.day11.task2;

import java.sql.PseudoColumnUsage;

public class Task2 {
    public static void main(String[] args){

       Warrior warrior = new Warrior();
       Magician magician = new Magician();
       Paladin paladin = new Paladin();
       Shaman shaman = new Shaman();

       warrior.physicalAttack(paladin); // Воин атакует Паладина
       System.out.println(paladin.toString());

       paladin.physicalAttack(magician);
       System.out.println(magician.toString());

       shaman.healTeammate(magician);
       System.out.println(magician.toString());

       magician.magicalAttack(paladin);
       System.out.println(paladin.toString());

       shaman.physicalAttack(warrior);
       System.out.println(warrior.toString()+ " Обрати внимание Сергей тут результат не сходится с рузультатом из задания");       //не идет

       paladin.healHimself();
       System.out.println(paladin.toString());

       warrior.physicalAttack(magician);
       System.out.println(magician.toString());

       warrior.physicalAttack(magician);
       System.out.println(magician.toString());

       warrior.physicalAttack(magician);
       System.out.println(magician.toString());

       warrior.physicalAttack(magician);
       System.out.println(magician.toString());

       warrior.physicalAttack(magician);
       System.out.println(magician.toString());









    }
}
