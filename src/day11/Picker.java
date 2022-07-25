package src.day11;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse w;

    int getSalary(){
        return salary;
    }
    boolean getIsPayed(){
        return isPayed;
    }

    Picker(Warehouse w){
        this.w = w;

    }

    @Override
    public void doWork() {
    salary = salary +80;
    w.inkrimentCountPickedOrders();

    }

    @Override
    public void bonus() {
        if(w.getCountPickedOrders()==10000){
            salary = salary + 70000;
        }
        if(w.getCountPickedOrders()<10000){
            System.out.println("Бонус пока не доступе");
        }
        if(w.getCountPickedOrders()>=10001){
            System.out.println("Бонус уже был выплачен");
        }


    }

    public String toString(){
        return " Количество собранных заказав  " +w.getCountPickedOrders()+  " Зарплата сотрудника " + salary;
    }


}
