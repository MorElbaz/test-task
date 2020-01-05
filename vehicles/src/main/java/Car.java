package main.java;

public class Car extends Vehicle {
    String Type;

    public Car(long id, String type) {
        super(id);
        Type = type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
