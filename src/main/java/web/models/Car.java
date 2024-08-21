package web.models;

public class Car {

    private String name;
    private int velocity;
    private int capacity;

    public Car(String name, int velocity, int capacity) {
        this.name = name;
        this.velocity = velocity;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", velocity=" + velocity +
                ", capacity=" + capacity +
                '}';
    }
}
