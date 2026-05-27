package by.lessons.practices.class4;

public class Building {
    protected String street;
    protected String wallMaterial;
    protected int year;

    public Building(String street, String wallMaterial, int year) {
        this.street = street;
        this.year = year;
        this.wallMaterial = wallMaterial;
    }

    public String toString() {
        String result = street + ", материал стен: " + wallMaterial + ", год постройки: " + year;
        return result;
    }
}
