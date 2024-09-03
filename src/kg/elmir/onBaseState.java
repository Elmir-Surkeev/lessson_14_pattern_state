package kg.elmir;

public class onBaseState extends State{
    @Override
    public void changeDriver(Truck truck) throws Exception{

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
