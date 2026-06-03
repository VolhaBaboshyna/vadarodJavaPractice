package by.lessons.practices.class5.task1;

public class Main {
    public static void main(String[] args) {
        Coffemachine coffemachine1 = new Coffemachine("Кофемашина Dual", "Латте", 153.3, true);
        Coffemachine coffemachine2 = new Coffemachine("Кофемашина Flex", "Капучино", 653.3, false);
        Fridge fridge1 = new Fridge("Холодильник-морозильник", "Атлант", 593.43, true);
        Fridge fridge2 = new Fridge("Морозильник", "Bosch", 1593.43, true);
        WashingMachine washingMachine1 = new WashingMachine("Стиральная машина", "Indesit", 345, true);
        WashingMachine washingMachine2 = new WashingMachine("Стирально-сушильная машина", "Total", 1345, false);
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Пылесос", "Dreame", 862, true);
        VacuumCleaner vacuumCleaner2 = new VacuumCleaner("Пылесос моющий", "Unit", 262, false);

        ElectricalAppliances[] exhibition = {coffemachine1, coffemachine2, fridge1, fridge2, washingMachine1,
                washingMachine2, vacuumCleaner1, vacuumCleaner2};

        for (ElectricalAppliances electricalAppliances : exhibition) {
            electricalAppliances.work();
        }

        KitchenAppliances[] exhibitionKitchenAppliances = {fridge1, fridge2, washingMachine1, washingMachine2};

        for (KitchenAppliances kitchenAppliances : exhibitionKitchenAppliances) {
            kitchenAppliances.work();
        }

        Coffemachine[] exhibitionCoffemachine = {coffemachine1, coffemachine2};

        for (Coffemachine coffemachine : exhibitionCoffemachine) {
            coffemachine.work();
        }


        coffemachine1.start();
        coffemachine2.start();
    }
}
