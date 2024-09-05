package kg.elmir;

public class onRouteState extends State{


    @Override
    public void changeDriver(Truck truck) throws Exception{
        throw new Exception("Мы не можем сменить водителя, водитель уже в пути");
    }
    public void startDriving(Truck truck) throws Exception{
        throw new Exception("Грузовик и так уже в пути");
    }
    public void startRepair(Truck truck) throws Exception{
        System.out.println("Грузовик отправляется на ремонт");
        truck.setState("repair");
    }
}
