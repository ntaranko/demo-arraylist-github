package by.itacademy.ntaranko;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Brest");
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Ghomel");
        cities.set(3, "Vitebsk");
        System.out.println(cities);
        System.out.println(Util.cityWithMaxLength(cities));
    }
}
