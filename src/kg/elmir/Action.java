package kg.elmir;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Action {
    public static void doAction() {
        Truck[] trucks = JSONFIleHandler.getTrucks();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(Arrays.toString(trucks));
            System.out.println("Введите идентификатор водителя (или -1 для выхода):");
            int id = sc.nextInt();

            if (id == -1) {
                System.out.println("Выход из программы...");
                break;
            }

            if (id < 0 || id >= trucks.length) {
                System.out.println("Ошибка: Грузовик с таким id не найден.");
                continue;
            }

            Truck truck = trucks[id];

            System.out.println(truck.toString());

            truck.setTruckState();

            System.out.println("Введите действие для грузовика:");
            System.out.println("1 - Сменить водителя, 2 - Отправить на СТО, 3 - Двинуться в путь");
            int toDo = sc.nextInt();

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

        sc.close();
    }
}
