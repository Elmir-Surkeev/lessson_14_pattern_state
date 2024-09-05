package kg.elmir;

import java.util.Random;

public class onRepairState extends State{
    @Override
    public void changeDriver(Truck truck) throws Exception {
        System.out.println("Вы не можете сменить водителя, грузовик находится в ремонте");
        if(truck.getState().equals("base")){
            throw new Exception("Ехать невозможно нет водителя");
        }
    }

    @Override
    public void startDriving(Truck truck) throws Exception {
        if(truck.getDriver() == null){
            throw new Exception("Ехать невозможно нет водителя");
        }
        Random random = new Random();
        int qwe = random.nextInt(2);
        switch (qwe){
            case 1:
                System.out.println("Грузовик в пути");
                truck.setState("route");
            break;
            case 2:
                truck.setState("base");
                System.out.println("Грузик находится  на базе");
            break;
            default:
                System.out.println("Error");
                break;
        }
    }

    @Override
    public void startRepair(Truck truck) throws Exception {
        System.out.println("Уже в ремонте");
        truck.setState("repair");
    }
}
