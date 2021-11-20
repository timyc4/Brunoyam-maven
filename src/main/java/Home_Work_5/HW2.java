package Home_Work_5;

/*
Создать класс Plant
Поля Plant:
    Дробное число height для высоты растения
    Дробное число width для ширины растения
Конструкторы:
    один с двумя аргументами с типами как у полей, другой - пустой
Метод grow:
    Нет входных, выходных данных
    Выводит в консоль строку "Я расту"
В psvm создать объект класса Plant, вывести поля объекта, вызвать метод grow
 */
public class HW2 {
    public static void main(String[] args) {
        Plant p = new Plant(2.5, 3);
        System.out.println(p.width);
        System.out.println(p.height);
        p.grow();
    }
}
