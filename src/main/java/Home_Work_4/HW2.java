package Home_Work_4;

/*
В класс PhoneNumber добавить два конструктора:
первый - без аргументов, он задает значение numType = ""
второй - с двумя аргументами таких же типов, что и поля, он передает значения аргументов в поля
В psvm класса HW2 создать два объекта класса PhoneNumber
    первый - с помощью конструктора без параметров и потом задать значения его полей
    второй - с помощью конструктора с двумя параметрами
Вывести поля первого и второго объектов в консоль
 */
public class HW2 {
    public static void main(String[] args) {
        PhoneNumber number1 = new PhoneNumber();
        number1.num = 88126669900L;
        number1.numType = "Рабочий";

        PhoneNumber number2 = new PhoneNumber("Личный", 89997773311L);

        System.out.println(number1.num +" "+ number1.numType);
        System.out.println(number2.num +" "+ number2.numType);

    }
}
