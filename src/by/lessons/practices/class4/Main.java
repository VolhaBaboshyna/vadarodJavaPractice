package by.lessons.practices.class4;

public class Main {
    public static void main(String[] args) {

        AdministrativeBuilding administrativeBuilding1 = new AdministrativeBuilding("ул. Веселая", "кирпич",
                2010, "общественные здания", 6, "спортсооружение", 63);
        AdministrativeBuilding administrativeBuilding2 = new AdministrativeBuilding("ул. Деловая", "блоки",
                1990, "общественные здания", 3, "исполком", 180);
        MultiApartmentBuilding multiApartmentBuilding1 = new MultiApartmentBuilding("ул. Жилая", "кирпич",
                1960, "жилье", 5, 100);
        MultiApartmentBuilding multiApartmentBuilding2 = new MultiApartmentBuilding("ул. Жилая", "бревно",
                1926, "жилье", 2, 2);
        Fabric fabric1 = new Fabric("ул. Заделочная", "кирпич", 2015, "сельское хозяйство",
                1500, "картошка");

        System.out.println(administrativeBuilding1.getPeopleQuantity());
        administrativeBuilding1.setPeopleQuantity(44);
        System.out.println(administrativeBuilding1.getPeopleQuantity());

        Village village = new Village();
        village.addBuildingToVillage(administrativeBuilding1);
        village.getPrintVillage();

        System.out.println(village.getQuantityOfVillage());

        System.out.println(village.getQuantityOfIndustrialBuildingInVillage());

        village.addBuildingToVillage(fabric1);
        System.out.println(village.getQuantityOfIndustrialBuildingInVillage());


    }
}
