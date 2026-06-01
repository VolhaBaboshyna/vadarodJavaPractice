package by.lessons.practices.class4;

public class Village {
    private Building[] buildings;

    public Village() {
        this.buildings = new Building[0];
    }

    public void addBuildingToVillage(Building building) {
        Building[] newBuildings = new Building[buildings.length + 1];
        for (int i = 0; i < buildings.length; i++) {
            newBuildings[i] = buildings[i];
        }
        newBuildings[buildings.length] = building;
        buildings = newBuildings;
    }

    public void getPrintVillage() {
        System.out.println("Здания в деревне:");
        for (Building building : buildings) {
            if (building == null) {
            } else {
                System.out.println(building.toString());
            }
        }
    }

    public String getQuantityOfVillage() {
        int i = buildings.length;
        String result = "Количестве строений в деревне: " + i;
        return result;
    }

    public String getQuantityOfIndustrialBuildingInVillage() {
        System.out.println("Промышленные здания в деревне:");
        int i = 0;
        for (Building building : buildings) {
            if (building instanceof IndustrialBuilding) {
                i++;
                System.out.println(building.toString());
            } else {
                continue;
            }
        }
        String result = "Количество промышленных строений в деревне: " + i;
        return result;
    }


}
