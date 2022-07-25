package src.day11;

public class Task1 {
    static void businessProcess(Worker worker){
        for(int i=0; i<10000; i++){
            worker.doWork();                      //данный метод обращается к интерфейсу         1
        }
        worker.bonus();

    }
    public static void main(String [] args){

        Warehouse warehouse = new Warehouse();   //2
        Picker picker = new Picker(warehouse);   //3
        Courier courier = new Courier(warehouse); //3

        Warehouse warehouse1 = new Warehouse();             //второй склад
        Picker picker1 = new Picker(warehouse1);            //второй сотрдник привязанный ко второму складу


        businessProcess(picker);                 //4
        System.out.println(picker.toString() +" Первый");   //4

        businessProcess(courier);                 //5
        System.out.println(courier.toString());   //5


        businessProcess(picker1);
        System.out.println(picker1.toString() + " второй");

                         //4
        System.out.println(picker.toString() + " Первый ");   //4



    }
}
