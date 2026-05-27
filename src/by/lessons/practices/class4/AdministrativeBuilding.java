package by.lessons.practices.class4;

public class AdministrativeBuilding extends CivilBuilding {
    protected String admPurpose;
    protected int peopleQuantity;

    public AdministrativeBuilding(String street, String wallMaterial, int year, String purpose, int floorCount,
                                  String admPurpose, int peopleQuantity) {
        super(street, wallMaterial, year, purpose, floorCount);
        this.admPurpose = admPurpose;
        this.peopleQuantity = peopleQuantity;
    }

    public String getPeopleQuantity() {
        String result = "Число людей, на которое рассчитано здание: " + peopleQuantity;
        return result;
    }

    public int setPeopleQuantity(int peopleQuantity) {
        this.peopleQuantity=peopleQuantity;
        return peopleQuantity;
    }

    public String toString() {
        String result = street + ", материал стен: " + wallMaterial + ", год постройки: " + year + ", назначение: " + purpose +
                ", количество этаэей: " + floorCount + ", назначение административного здания: " + admPurpose +
                ", число людей, на которое рассчитано здание: " + peopleQuantity;
        return result;
    }
}
