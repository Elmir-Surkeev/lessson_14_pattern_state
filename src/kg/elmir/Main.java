package kg.elmir;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Truck[] trucks = JSONFIleHandler.getTrucks();
        trucks[0].setTruckState();
        trucks[0].startDriving();
        JSONFIleHandler.writeTrucks(trucks);


    }
}