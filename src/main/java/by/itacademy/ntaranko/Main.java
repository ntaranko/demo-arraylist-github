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
        int maxLength = cities.get(0).length();
        String cityWithMaxLength = cities.get(0);
        for (String city : cities) {
            if (city.length() > maxLength) {
                cityWithMaxLength = city;
                maxLength = city.length();
            }
        }
        System.out.println(cityWithMaxLength);
    }
}
