//Класс Автомобиль, наследует общие характеристики от класса Vehicle
public class Car extends Vehicle {
    int fuelCapacity; //емкость топливного бака
    int currentFuelLevel; //текущий уровень топлива

    Car(int id, String brand, String model, int year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 50;
    }

    @Override
    void startEngine() {
        System.out.println("Запуск двигателя автомобиля");
    }

    @Override
    void stopEngine() {
        System.out.println("Остановка двигателя автомобиля");
    }

    //Увеличение скорости автомобиля
    @Override
    void accelerate(int speed) {
        System.out.println("Автомобиль разогнался до " + speed + " км/час");
    }

    @Override
    void brake() {
        System.out.println("Автомобиль прекратил движение");
    }

    //Информация об автомобиле
    @Override
    void displayInfo() {
        System.out.println("Автомобиль: " + brand + " " + model + " (" + year + ")");
    }

    //Заправка автомобиля с указанным количеством топлива
    void refuel(int liters) {
        currentFuelLevel += liters;
        //Предупреждение о том, что текущий уровень топлива превышает емкость бака
        if (currentFuelLevel > fuelCapacity) {
            System.out.println("Текущий уровень топлива превышает емкость топливного бака");
        }
        else {
            System.out.println("Автомобиль заправлен на " + liters + " литров." +
                    " В баке всего " + currentFuelLevel + " литров");
        }
    }
}
