package by.lessons.practices.class5.task1;

public class VacuumCleaner implements ElectricalAppliances {
    private String name;
    private String brand;
    private double cost;
    private boolean isOn;

    public VacuumCleaner(String name, String brand, double cost, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void work() {
        System.out.println(name + " убирает");
    }
}
