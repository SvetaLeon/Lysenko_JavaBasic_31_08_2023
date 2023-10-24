package ua.hillel.shutko.homework.homework2;

public class MyApp {
    public static void main(String[] args) {
        double latitude = 25.1916159002;
        double longitude = 55.2711322488;
        char specSymbol1 = '°';
        char specSymbol2 = '\'';
        System.out.println("Latitude " + latitude + " Longitude " + longitude);
        System.out.println("\"DMS Lat\": 25" + specSymbol1 + " 11" + specSymbol2 + " 29.82\" N DMS Long: 55" + specSymbol1 + " 16' 16.08\" E");
    }
}
