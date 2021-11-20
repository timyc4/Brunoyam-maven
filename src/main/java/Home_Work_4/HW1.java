package Home_Work_4;

/*
Создать класс PhoneNumber (в отдельном файле в пакете lesson4)
2 поля:
num целочисленного типа
    (там будет храниться номер в виде числа, начинающегося с 8)
numType строчного типа
    (там будет храниться информация о типе номера, например "Рабочий" или "Личный")

В psvm класса HW1 создать объект класса PhoneNumber без аргументов с именем number
Задать значения полям number
Вывести поля в консоль
 */
public class HW1 {
    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber();
        number.num = 81234567890L;
        number.numType = "Личный";

        System.out.println(number.num);
        System.out.println(number.numType);
    }
}
