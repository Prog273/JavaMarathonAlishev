package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.getCountPickedOrders());
        System.out.println(warehouse.getCountDeliveredOrders());
        System.out.println(picker);
        System.out.println(courier);
    }
    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
