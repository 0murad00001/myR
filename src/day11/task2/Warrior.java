package src.day11.task2;

public class Warrior extends Hero implements interfacePhysAttack {

    public Warrior(){
        physAtt = 30;
        physDef = 0.8;
    }


    public String toString(){
        return "Warrior {health= " + super.getHealth()+ " }";
    }

}

