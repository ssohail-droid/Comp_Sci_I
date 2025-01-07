public class CarRunner {
    private String carName = "Porsche 911";
    private int topSpeed = 182;
    private String engineType = "Turbocharged";
    private int horsepower = 379;
    
    private double weight = 3364;
    private int length = 177;
    private double width = 72.9;
    private String driveType = "Rear-wheel drive";
    
    private double fuelCapacity = 17.6;
    private String chassisType = "Coupe";
    
    public CarRunner() {
        Car carObj = new Car(carName, topSpeed, engineType, horsepower, 
                             weight, length, width, driveType, fuelCapacity, chassisType);
        System.out.println(carObj);
    }
    
    public static void main(String[] args) {
        CarRunner carRunnerObj = new CarRunner();
    }
}
