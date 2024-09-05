package kg.elmir;

import java.io.IOException;
import java.util.Arrays;

public class Action {
    public static void doAction(int id, int toDo) {
        Truck[] trucks = JSONFIleHandler.getTrucks();

        if (id < 0 || id >= trucks.length) {
            System.out.println("Ошибка: Грузовик с таким id не найден.");
            return;
        }

        Truck truck = trucks[id];

        System.out.println(truck.toString());

        truck.setTruckState();

        switch (toDo) {
            case 1:
                try {
                    truck.getTruckState().changeDriver(truck);
                } catch (Exception e) {
                    System.out.println("Ошибка при смене водителя: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    truck.getTruckState().startRepair(truck);
                } catch (Exception e) {
                    System.out.println("Ошибка при отправке на ремонт: " + e.getMessage());
                }
                break;
            case 3:
                try {
                    truck.getTruckState().startDriving(truck);
                } catch (Exception e) {
                    System.out.println("Ошибка при отправке в путь: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Ошибка: Неверное действие.");
        }

        JSONFIleHandler.writeTrucks(trucks);
    }
}
