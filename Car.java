public class Car {

    private String brand;
    private String model;
    private Integer year;
    private Double mileage;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.mileage = 0.0;
    }

    public Car(String brand, String model, Integer year, Double mileage) {
        this.brand = brand;
        this.model = model;
        if (year <= 2026) {
            this.year = year;
        }
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.mileage = other.mileage;
    }

    public String getInfo() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Mileage: " + mileage + " km";
    }

    public void delete() {
        this.brand = "Deleted";
        this.model = "Deleted";
        this.year = null;
        this.mileage = null;
        System.out.println("Car information has been deleted.");
    }

    public void updateMileage(double newMileage) {
        if (newMileage > this.mileage) {
            this.mileage = newMileage;
            System.out.println("Updated car info: " + getInfo());
        } else {
            System.out.println("New mileage must be greater than current mileage.");
        }
    }

    public void compareYears(Car other) {
        if (this.year > other.year) {
            System.out.println(this.brand + " " + this.model + " is newer than " + other.brand + " " + other.model);
        } else if (this.year < other.year) {
            System.out.println(this.brand + " " + this.model + " is older than " + other.brand + " " + other.model);
        } else {
            System.out.println("Both cars have the same year.");
        }
    }

    public void compareMileages(Car other) {
        if (this.mileage > other.mileage) {
            System.out.println(this.brand + " " + this.model + " has more mileage than " + other.brand + " " + other.model);
        } else if (this.mileage < other.mileage) {
            System.out.println(this.brand + " " + this.model + " has less mileage  than " + other.brand + " " + other.model);
        } else {
            System.out.println("Both cars have the same mileage.");
        }
    }
}

