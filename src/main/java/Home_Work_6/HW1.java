package Home_Work_6;

/*
Создать интерфейс Vehicle, определяющий что может делать транспортное средство
    В нём будут заданы два метода
        move с двумя дробными аргументами new_x и new_y без возвращаемого значения
        changeSpeed с одним дробным аргументом с именем inc
Определить класс Car
    Три дробных поля x, y и speed
    Пустой конструктор, конструктор с тремя аргументами
    Реализация move - установить x и y равными значениям new_x и new_y
    Реализация changeSpeed - увеличить скорость на inc
В psvm создать автомобиль, проверить работу его методов move и changeSpeed
 */
public class HW1 {
    public static void main(String[] args) {
        Car car1 = new Car(5,2,60);
        System.out.printf("Машина 1 едет: %.2f %.2f %.2f\n", car1.x, car1.y, car1.speed);
        car1.move(6,3);
        System.out.printf("Машина 1 увеличилась: %.2f %.2f %.2f\n", car1.x, car1.y, car1.speed);
        car1.changeSpeed(10.5);
        System.out.printf("Машина 1 ускорилась: %.2f %.2f %.2f\n", car1.x, car1.y, car1.speed);

    }
}
