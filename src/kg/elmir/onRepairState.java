package kg.elmir;

import java.util.Random;

public class onRepairState extends State{
    @Override
    public void changeDriver(Truck truck) throws Exception {
        System.out.println("Вы не можете сменить водителя, грузовик находится в ремонте");
    }

    @Override
    public void startDriving(Truck truck) throws Exception {
        if(truck.getDriver() == null){
            throw new Exception("Ехать невозможно нет водителя");
        }
    }

    @Override
    public void startRepair(Truck truck) throws Exception {
        System.out.println("Уже в ремонте");
        truck.setState("repair");
    }
}
