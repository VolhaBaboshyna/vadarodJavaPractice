package by.lessons.practices.class9;

public class Avto {
    private int id;
    private String mark;
    private int run;
    private int year;
    private float maxSpeed;
    private double price;

    public Avto(int id, String mark, int run, int year, float maxSpeed, double price) {
        this.id = id;
        this.mark = mark;
        this.run = run;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "id: " + id + ", mark: " + mark + ", run: " + run + ", year: " + year + ", max speed: " + maxSpeed + ", price: " + price;
    }
}
