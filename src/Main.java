public class Main {
    public static void main(String[] args) {
        //Создание объектов транспортных средств
        Car car = new Car(1, "Lamborghini", "Revuelto", 2023, 80);
        Aircraft aircraft = new Aircraft(2, "Boeing", "747", 2020, 35000);
        Boat boat = new Boat(3, "Yamaha", "242X", 2021, 40);

        //Демонстрация работы транспортных средств

        //Автомобиля
        car.displayInfo();
        car.startEngine();
        car.accelerate(120);
        car.brake();
        car.refuel(20);

        System.out.println();

        //Самолета
        aircraft.displayInfo();
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.accelerate(500);
        aircraft.brake();
        aircraft.land();
        aircraft.stopEngine();

        System.out.println();

        //Лодки
        boat.displayInfo();
        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(50);
        boat.stopSwimming();
        boat.stopEngine();
    }
}
