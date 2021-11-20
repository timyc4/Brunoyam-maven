package Home_Work_4;

/*
Добавить в класс PhoneNumber три метода
метод с именем print без аргументов и без возвращаемого значения,
    print выводит объект в консоль с помощью форматированного вывода System.out.printf()
    формат "Телефонный %s номер: %d", на первом месте должно быть поле numType, на втором - num
метод с именем changeType с одной строкой как аргумент и без возвращаемого значения,
    changeType изменяет значение поля numType на строку из аргумента
метод с именем getNum без аргументов и с возвратом целочисленного значения,
    getNum возвращает значение поля num

В psvm класса HW3 создать объект класса PhoneNumber при помощи конструктора с двумя аргументами,
вызвать у этого объекта метод print(),
с помощью sout и getNum() вывести отдельно значение номера,
вызвать у объекта changeType() со значением строчного типа,
снова вызвать метод print()
 */
public class HW3 {
    public static void main(String[] args) {
        PhoneNumber number3 = new PhoneNumber("Личный", 89992224466L);
        number3.print();
        System.out.println(number3.getNum());
        number3.changeType("Рабочий");
        number3.print();

    }
}
