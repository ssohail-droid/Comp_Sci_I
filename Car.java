public class Car extends Vehicle {
    protected int horsepower;
    protected double width;
    protected String driveType;
    protected double fuelCapacity;
    PerformanceMetrics performanceMetrics;
    
    public Car(String carName, int topSpeed, String engineType, int horsepower, double weight, 
               int length, double width, String driveType, double fuelCapacity, String chassisType) {
        
        super(carName, topSpeed, engineType, weight, length, chassisType);
        this.horsepower = horsepower;
        this.width = width;
        this.driveType = driveType;
        this.fuelCapacity = fuelCapacity;
        performanceMetrics = new PerformanceMetrics(horsepower, weight, topSpeed);
    }
    
    public int getHorsepower() {
        return horsepower;
    }
    
    public String toString() {  
        return super.toString() +  
            "Horsepower: " + getHorsepower() + " hp\n" + 
            "Width: " + width + " inches\n" + 
            "Drive Type: " + driveType + "\n" + 
            "Fuel Capacity: " + fuelCapacity + " gallons\n" +
            performanceMetrics.toString();
    }
}
