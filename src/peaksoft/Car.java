package peaksoft;

public class Car {
    private String id;
    private int number;


    public Car() {

    }

    public Car(String id, int number) {
        this.id = id;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "id: " + id  +
                ", number: " + number;
    }
}

