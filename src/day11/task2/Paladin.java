package src.day11.task2;

public class Paladin extends Hero implements interfacePhysAttack, interfaceHealer{
    Paladin(){
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    public double getPhysDef(){
        return physDef;
    }


    /*
    @Override
    public void physicalAttack(Hero hero) {
    }*/

    @Override
    public void healHimself(){
        setHealth(super.getHealth() +25 ); //Увеличивает жизнь на 25
    }

    @Override
    public void healTeammate(Hero hero) {
      hero.setHealth(  + (super.getHealth()+10)); //увеличивает жизнь герою на 10%
        //health = health +10;
    }

    public String toString(){
        return "Paladin {health= " + super.getHealth()+ " }";
    }

}
