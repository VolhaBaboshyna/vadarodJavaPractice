package by.lessons.practices.class5.task1;

public class Fridge implements ElectricalAppliances, KitchenAppliances {
    private String name;
    private String mark;
    private double cost;
    private boolean isOn;

    public Fridge(String name, String mark, double cost, boolean isOn) {
        this.name = name;
        this.mark = mark;
        this.cost = cost;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
        System.out.println(name + " морозит");
    }
}
