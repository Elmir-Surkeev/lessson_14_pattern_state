package kg.elmir;

import java.util.Scanner;

public abstract class FindFreeDriver {
    public static void changeDrivers(Truck truck) throws Exception {
        try {
            Driver[] drivers = JSONFIleHandler.getDriver();
            boolean hasFreeDriver = false;


            System.out.println("Список свободных водителей:");
            for (Driver driver : drivers) {
                System.out.println("Водитель: " + driver.getName() + " (ID: " + driver.getId() + "), Свободен: " + driver.isIfFree());
                if (driver.isIfFree()) {
                    System.out.println("Свободный водитель -> ID: " + driver.getId() + ", Имя: " + driver.getName());
                    hasFreeDriver = true;
                }
            }

            if (!hasFreeDriver) {
                throw new Exception("Нет свободных водителей");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ID водителя, которого хотите выбрать: ");
            String selectedDriverId = scanner.nextLine();


            for (Driver driver : drivers) {
                if (driver.getId().equals(selectedDriverId)) {
                    truck.setDriver(driver);
                    driver.setIfFree(false);
                    JSONFIleHandler.writeDriver(drivers);
                    System.out.println("Теперь грузовик " + truck.getName() + " ведёт водитель " + driver.getName());
                    return;
                }
            }

            throw new Exception("Водитель с таким ID не найден, возможно он еще не зарегистрировался в ОБЛАКЕ");

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
