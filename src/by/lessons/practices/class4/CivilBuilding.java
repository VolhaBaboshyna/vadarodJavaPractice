package by.lessons.practices.class4;

public class CivilBuilding extends Building {
    protected String purpose;
    protected int floorCount;


    public CivilBuilding(String street, String wallMaterial, int year, String purpose, int floorCount) {
        super(street, wallMaterial, year);
        this.purpose = purpose;
        this.floorCount = floorCount;
    }

    public String toString() {
        String result = street + ", материал стен: " + wallMaterial + ", год постройки: " + year + ", назначение: " + purpose +
                ", количество этаэей: " + floorCount;
        return result;
    }
}
