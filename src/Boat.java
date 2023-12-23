//Класс Лодка, наследует общие характеристики от класса Vehicle
// и реализует интерфейс Swimmable
public class Boat extends Vehicle implements Swimmable{
    int maxSpeed; //макс скорость лодки
    boolean isSailing; //флаг статуса плавания
    Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
    }

    @Override
    public void startSwimming() {
        System.out.println("Лодка начала плавание");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Лодка закончила плавание");
    }

    @Override
    void startEngine() {
        System.out.println("Запуск двигателя лодки");
    }
    @Override
    void stopEngine() {
        System.out.println("Остановка двигателя лодки");
    }

    //Увеличение скорости лодки
    //Предупреждение о превышении макс скорости лодки
    @Override
    void accelerate(int speed) {
        System.out.println("Лодка разогналась до " + speed + " узлов");
        if (speed > maxSpeed) {
            System.out.println("Осторожно! Текущая скорость лодки превысила " + maxSpeed + " узлов(максимальную" +
                    " скорость лодки), может произойти поломка");
        }
    }

    @Override
    void brake() {
        System.out.println("Лодка прекратила движение");
    }

    //Информация о лодке
    @Override
    void displayInfo() {
        System.out.println("Лодка: " + brand + " " + model + " (" + year + ")");
    }
}
