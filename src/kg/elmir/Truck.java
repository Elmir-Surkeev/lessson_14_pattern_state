package kg.elmir;

public class Truck {
    private int id;
    private String name;
    private Driver driver;
    private String state;
    private transient State truckState;

    public void changeDriver(){
        try{
            this.truckState.changeDriver(this);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void startDriving(){
        try{
            this.truckState.startDriving(this);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void startRepair(){
        try{
            this.truckState.startRepair(this);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setTruckState(){
        switch (this.state){
            case "base" -> this.truckState = new onBaseState();
            case "repair" -> this.truckState = new onRepairState();
            case "route" -> this.truckState = new onRouteState();
        }
    }
    public State getTruckState() {
        return this.truckState;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  " id = " + (id+1) + "\n" +
                " CarName = " + name  + "\n" +
                " driverName = " + driver.getName() + "\n" +
                " driverId = " + driver.getId() + "\n" +
                " driver Free? = " + driver.isIfFree() + "\n" +
                " state = " + state;
    }
}
