package by.lessons.practices.class4;

public class IndustrialBuilding extends Building {
    protected String industry;

    public IndustrialBuilding(String street, String wallMaterial, int year, String industry) {
        super(street, wallMaterial, year);
        this.industry = industry;
    }

    public String toString() {
        String result = street + ", материал стен: " + wallMaterial + ", год постройки: " + year + ", отрасль: " + industry;
        return result;
    }
}
