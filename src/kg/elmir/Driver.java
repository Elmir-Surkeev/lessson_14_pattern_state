package kg.elmir;

public class Driver {
    private String id;
    private String name;
    private boolean ifFree;
//    private transient Driver driverName;
//    public void setDriverName(){
//        switch (this.name){
//            case "" -> this.setDriverName = new onBaseState();
//            case "repair" -> this.setDriverName = new onRepairState();
//            case "route" -> this.setDriverName = new onRouteState();
//        }
//    }
    public void setDriver(String driver) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ifFree=" + ifFree +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIfFree() {
        return ifFree;
    }

    public void setIfFree(boolean ifFree) {
        this.ifFree = ifFree;
    }
}
