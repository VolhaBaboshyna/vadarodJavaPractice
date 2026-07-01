package by.lessons.practices.class8.class9;

import java.util.Comparator;
import java.util.List;

public class MainAvto {
    public static void main(String[] args) {

        Avto avto1 = new Avto(1, "BMW", 21111, 2020, 200, 13022);
        Avto avto2 = new Avto(2, "Mercedes", 55678, 2019, 220, 393939);
        Avto avto3 = new Avto(3, "Mercedez", 388383, 2015, 227, 3939);
        Avto avto4 = new Avto(4, "Audi RsQ3 Sportback ", 10000, 2023, 333, 112221);
        Avto avto5 = new Avto(5, "Tesla Model X", 88888, 2022, 293, 388383);


        List<Avto> carsList = List.of(avto1, avto2, avto3, avto4, avto5);
//        Optional<Avto> fasterAvto = carsList.stream().max((avt1, avt2) ->
//                Integer.compare((int) avt1.getMaxSpeed(), (int) avt2.getMaxSpeed()));
//
//        Optional<Avto> slowerAvto = carsList.stream().min((avt1, avt2) ->
//                Integer.compare((int) avt1.getMaxSpeed(), (int) avt2.getMaxSpeed()));
//
//        System.out.println("Самый быстрый автомобиль: ");
//        System.out.println(fasterAvto);
//        System.out.println("Самый медленный автомобиль:");
//        System.out.println(slowerAvto);

//        Optional<Avto> newerAvto = carsList.stream().max((avt1, avt2) ->
//                Integer.compare((int) avt1.getYear(), (int) avt2.getYear()));
//
//        List<Avto> avtoRun50K_100K = carsList.stream().filter((avt) -> {
//                    if (avt.getRun() >= 50000 && avt.getRun() <= 100000) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//        ).toList();
//
//        System.out.println("Автомобили с пробегом 50к-100к:");
//        System.out.println(avtoRun50K_100K);
//
//        Optional<Avto> expensiveAvto = carsList.stream().max((avt1, avt2) ->
//                Integer.compare((int) avt1.getPrice(), (int) avt2.getPrice()));
//
//        Optional<Avto> chiperAvto = carsList.stream().min((avt1, avt2) ->
//                Integer.compare((int) avt1.getPrice(), (int) avt2.getPrice()));
//
//        System.out.println("Самый дорогой автомобиль: ");
//        System.out.println(expensiveAvto);
//        System.out.println("Самый дешевый автомобиль:");
//        System.out.println(chiperAvto);

        List<Avto> sortedAsc = carsList.stream().sorted(Comparator.comparingInt(Avto::getRun)).toList();
        List<Avto> sortedDesc = carsList.stream().sorted(Comparator.comparingInt(Avto::getRun).reversed()).toList();

        System.out.println("Пробег по возрастанию");
        sortedAsc.forEach(System.out::println);
        System.out.println("Пробег по убыванию");
        sortedDesc.forEach(System.out::println);

        List<Avto> avtoRunPrice = carsList.stream().filter((avt) -> {
                    if (avt.getRun() >= 20000 && avt.getRun() <= 100000) {
                        if (avt.getPrice() >= 10000 && avt.getPrice() < 20000) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                    return false;
                }
        ).toList();

        System.out.println("диапазон");
        System.out.println(avtoRunPrice);


    }
}
