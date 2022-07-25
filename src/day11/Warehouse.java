package src.day11;

public class Warehouse {
    private static int countPickedOrders;
    private static int countDeliveredOrders;

    int getCountPickedOrders(){
        return countPickedOrders;
    }

    int getCountDeliveredOrders(){
        return countDeliveredOrders;
    }



    public String toString(){
        return "Количество собранных товаров " + countPickedOrders + " Количество доставленных товаров " + countDeliveredOrders;
    }

    public  void inkrimentCountPickedOrders(){
     countPickedOrders++;
    }
    public void inkrimentCountDeliveredOrders(){
        countDeliveredOrders++;
    }






}
