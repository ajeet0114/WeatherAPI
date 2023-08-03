import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherAPI api = new WeatherAPI();
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    getWeather(api, scanner);
                    break;
                case 2:
                    getWindSpeed(api, scanner);
                    break;
                case 3:
                    getPressure(api, scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Options:");
        System.out.println("1. Get weather");
        System.out.println("2. Get Wind Speed");
        System.out.println("3. Get Pressure");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void getWeather(WeatherAPI api, Scanner scanner) {
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        
        double temperature = api.getTemperature(date); 
        System.out.println("Temperature on " + date + " is " + temperature + "°C");
    }

    private static void getWindSpeed(WeatherAPI api, Scanner scanner) {
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        
        double windSpeed = api.getWindSpeed(date); 
        System.out.println("Wind Speed on " + date + " is " + windSpeed + " m/s");
    }

    private static void getPressure(WeatherAPI api, Scanner scanner) {
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        
        double pressure = api.getPressure(date); 
        System.out.println("Pressure on " + date + " is " + pressure + " hPa");
    }
}


class WeatherAPI {
    public double getTemperature(String date) {
        
        return 25.0; 
    }

    public double getWindSpeed(String date) {
        
        return 8.5; 
    }

    public double getPressure(String date) {
        
        return 1013.5; 
    }
}
