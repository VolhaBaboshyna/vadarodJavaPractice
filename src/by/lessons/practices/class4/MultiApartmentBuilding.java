package by.lessons.practices.class4;

public class MultiApartmentBuilding extends CivilBuilding {
    private int apartmentQuantity;

    public MultiApartmentBuilding(String street, String wallMaterial, int year, String purpose, int floorCount, int apartmentQuantity) {
        super(street, wallMaterial, year, purpose, floorCount);
        this.apartmentQuantity = apartmentQuantity;
    }

    public String toString() {
        String result = street + ", материал стен: " + wallMaterial + ", год постройки: " + year + ", назначение: " + purpose +
                ", количество этаэей: " + floorCount + ", количетсов квартир: " + apartmentQuantity;
        return result;
    }
}
