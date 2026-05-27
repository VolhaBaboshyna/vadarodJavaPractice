package by.lessons.practices.class4;

public class Fabric extends IndustrialBuilding {
    private int numberOfEmployees;
    private String manufacturedProducts;

    public Fabric(String street, String wallMaterial, int year, String industry, int numberOfEmployees, String manufacturedProducts) {
        super(street, wallMaterial, year, industry);
        this.numberOfEmployees = numberOfEmployees;
        this.manufacturedProducts = manufacturedProducts;
    }

    public String toString() {
        String result = street + ", материал стен: " + wallMaterial + ", год постройки: " + year + ", отрасль: " + industry +
                ", количество работников: " + ", выпускаемая продукция: " + manufacturedProducts;
        return result;
    }
}
