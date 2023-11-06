package day11.task1;

public class Courier implements Worker{
    Warehouse warehouse;
    int salary;
    boolean isPayed;
    private static final int COURIER_SALARY = 100;


    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean isPayed() {
        return this.isPayed;
    }

    public String toString() {
        return "Курьеру заплатили: " + getSalary() + " рублей; выплачен бонус: " + isPayed();
    }

    public void doWork() {
        salary += COURIER_SALARY;
        warehouse.raiseDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }
}



