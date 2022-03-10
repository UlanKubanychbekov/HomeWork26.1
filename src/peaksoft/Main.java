package peaksoft;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car, CarDate> car = new HashMap<>();
        car.put(new Car("09KG", 834), new CarDate(LocalDate.of(2020, 4, 23), "BMW", 560000, "black"));
        car.put(new Car("07KG", 235), new CarDate(LocalDate.of(2002, 2, 13), "Mers", 560000, "black"));
        car.put(new Car("04KG", 656), new CarDate(LocalDate.of(2018, 7, 24), "Toyota", 560000, "black"));
        car.put(new Car("02KG", 345), new CarDate(LocalDate.of(2011, 8, 5), "Lexus", 560000, "black"));
        car.put(new Car("01KG", 876), new CarDate(LocalDate.of(2014, 1, 3), "Rolls - Rois", 560000, "black"));
        car.put(new Car("05KG", 872), new CarDate(LocalDate.of(2009, 9, 29), "Hyundai", 560000, "black"));


        for (Map.Entry cars : car.entrySet()) {
            System.out.println(cars);
        }
       

    }
}
