package by.lessons.practices.class5.task1;

public class Coffemachine implements ElectricalAppliances {
    private String name;
    private String function;
    private double cost;
    private Boolean isOn;

    public Coffemachine(String name, String function, double cost, Boolean isOn) {
        this.name = name;
        this.function = function;
        this.cost = cost;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    @Override
    public void work() {
        System.out.println(name + " варит");
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
            System.out.println("Кофемашина выключена");
            return;
        }
        System.out.println("Кофемашина уже выключена");
    }

    public void start() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Кофемашина включена");
            return;
        }
        System.out.println("Кофемашина уже включена");
    }

}
