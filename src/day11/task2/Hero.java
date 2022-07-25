package src.day11.task2;

public abstract class Hero implements interfacePhysAttack{
    private double health =100;
    double physDef;
    double magicDef;
    double physAtt;
    double magicAtt;
    private final double MAX_HEALTH=100;
    private final double MIN_HEALTH = 0;
    String name;


    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth(){
        return health;
    }


    public double getPhysDef(){
        return physDef;

    }
    public void setPhysDef(double physDef){
        this.physDef =physDef;

    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health>1) {
           //System.out.println(hero.health +" воин");
          // System.out.println(physAtt +" воин");
          // System.out.println(hero.physDef +" воин");

            //hero.health = hero.health - (physAtt-((physAtt * hero.physDef)));
            hero.health = hero.health - (physAtt * hero.physDef);

        } if(hero.health<0) {
            hero.health = 0;
    }
    }

}
