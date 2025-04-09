public class Main {
    public static void main(String[] args) {
        System.out.println("ConverterTemperature");
        System.out.println("Version 1.0");

        double fahrenheit = 15, celsius = 20;
        double convertedFahrenheit = fahrToCels(fahrenheit);
        System.out.printf("%n%.1f фарегейтів, це %.1f цельсіїв.%n", fahrenheit, convertedFahrenheit);

        double convertedCelsius = celsToFahr(celsius);
        System.out.printf("%.1f цельсіїв, це %.1f фарангейтів.%n", celsius, convertedCelsius);
    }
    public static double fahrToCels(double fahrenheit) {
        double Cels = ((fahrenheit - 32) / 1.8);
        return Cels;
    }
    public static double celsToFahr(double celsius) {
        double Fahr = (celsius * 9/5) + 32;
        return Fahr;
    }
}