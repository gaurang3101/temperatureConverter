import java.util.Scanner;

public class TemperatureConverter {

    double celsius;

    public void convertCelsiusToFahrenheit() {
        double fahrenheit = (9*celsius)/5 + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }

    public TemperatureConverter(double celsius) {
        this.celsius = celsius;
    }

}

class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius - ");
        double c = scanner.nextDouble();
        TemperatureConverter tc = new TemperatureConverter(c);
        //System.out.println("Temperature in Fahrenheit is - ");
        tc.convertCelsiusToFahrenheit();



    }
}
