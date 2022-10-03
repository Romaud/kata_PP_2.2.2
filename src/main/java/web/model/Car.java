package web.model;

public class Car {
    private String brand;

    private String model;

    private int cost;

    public Car(String brand, String model, int cost) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
