package kg.elmir;

public class Driver {
    private String id;
    private String name;
    private boolean ifFree;

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
