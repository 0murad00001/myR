package src.day11.task2;

public class Shaman extends Hero implements interfaceMagicAttack, interfacePhysAttack, interfaceHealer{
    public Shaman(){
        physAtt =10;
        magicAtt =15;
        physDef = 0.2;
        magicDef =0.2;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double x = hero.getHealth();
        x=x-15;
        hero.setHealth(x);
    }

    @Override
    public void healHimself(){
        setHealth(super.getHealth() +50 ); //Увеличивает жизнь на 25
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth()<100){
        hero.setHealth(  + (hero.getHealth()+30)); //увеличивает жизнь герою на 10%
        } if (hero.getHealth()>100){
            hero.setHealth(100);
        }
    }

    public String toString(){
        return "Shaman {health= " + super.getHealth()+ " }";
    }
}
