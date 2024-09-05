package kg.elmir;

public class onBaseState extends State{

    @Override
    public void changeDriver(Truck truck) throws Exception{
        try {
            Driver[] drivers = JSONFIleHandler.getDriver();
            for (Driver driver: drivers){
                truck.setDriver(driver);
                driver.setIfFree(false);

                JSONFIleHandler.writeDriver(drivers);
                System.out.println("Теперь грузовик " + truck.getName() + " ведёт водитель " + driver.getName());
                return;
            }
        } catch (Exception e) {
            throw new Exception("Нет свободных водителей");
        }
    }
    public void startDriving(Truck truck) throws Exception{
        if(truck.getDriver() == null){
            throw new Exception("Ехать невозможно нет водителя");
        }
        System.out.println("Состояние грузовика изменилось, грузовик в пути");
        truck.setState("route");
    }
    public void startRepair(Truck truck) throws Exception{
        System.out.println("Грузовик отправился на ремонт");
        truck.setState("repair");
    }
}
