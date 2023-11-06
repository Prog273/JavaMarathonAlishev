package day11.task1;

public class Picker implements Worker {
    private Warehouse warehouse;
    private int salary;
    private static final int PICKER_SALARY = 80;
    private boolean isPayed;


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Сборщику заплатили: " + getSalary() + " рублей; выплачен бонус: " + isPayed();
    }

    public void doWork() {
        salary += PICKER_SALARY;
        warehouse.raisePickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }


}
