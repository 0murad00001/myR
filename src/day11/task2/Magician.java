package src.day11.task2;

public class Magician extends Hero implements interfacePhysAttack, interfaceMagicAttack{
    public Magician(){
        physAtt =5;
        physDef = 1;
        magicAtt=20;
        magicDef=0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double x = hero.getHealth();
        x= x- (magicAtt-(magicAtt*hero.magicDef));
        hero.setHealth(x);
    }

    public String toString(){
        return "Magician {health= " + super.getHealth()+ " }";
    }
}
