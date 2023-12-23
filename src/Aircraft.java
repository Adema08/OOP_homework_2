//Класс Самолет, наследует общие характеристики от класса Vehicle
// и реализует интерфейс Flyable
public class Aircraft extends Vehicle implements Flyable {
    int maxAltitude; //макс высота полета(в футах)
    boolean isFlying; //флаг статуса полета
    Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }
    @Override
    public void takeOff() {
        System.out.println("Взлет самолета");
        isFlying = true;
    }
    @Override
    public void land() {
        System.out.println("Посадка самолета");
        isFlying = false;
    }
    @Override
    void startEngine() {
        System.out.println("Запуск двигателя самолета");
    }
    @Override
    void stopEngine() {
        System.out.println("Остановка двигателя самолета");
    }

    //Увеличение скорости самолета
    @Override
    void accelerate(int speed) {
        System.out.println("Самолет разогнался до " + speed + " узлов");
    }

    //Одна из причин прекращения движения самолета
    @Override
    void brake() {
        System.out.println("Самолет прекратил движение," +
                " так как максимальная высота полета больше чем " + maxAltitude + " футов");
    }

    //Информация о самолете
    @Override
    void displayInfo() {
        System.out.println("Самолет: " + brand + " " + model + " (" + year + ")");
    }
}
