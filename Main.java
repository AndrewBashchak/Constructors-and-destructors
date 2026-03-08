public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Corolla", 2015, 2874.35);
        Car car3 = new Car("BMW", "X5 (G05)", 2018, 15000.0);
        Car car4 = new Car(car2);

        System.out.println("Car 1: " + car1.getInfo());
        System.out.println("Car 2: " + car2.getInfo());
        System.out.println("Car 3: " + car3.getInfo());
        System.out.println("Car 4: " + car4.getInfo());

        car1.delete();
        System.out.println("Car 1: " + car1.getInfo());

        car2.updateMileage(15042);

        car2.compareMileages(car3);
        car3.compareYears(car4);
    }
}
