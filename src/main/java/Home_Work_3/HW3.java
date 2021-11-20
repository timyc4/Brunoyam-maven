package Home_Work_3;

import java.util.Scanner;

/*
Создать метод, у которого:
    имя calcArea
    входной аргумент (параметр) дробное число radius
    выходной тип данных - дробное число
Метод должен возвращать результат вычисления площади круга (формула для этого - PI * radius * radius)
Как значение PI можно использовать или переменную со значением 3.14, или Math.PI
 */
public class HW3 {

    static float calcArea (float radius){
        return (float) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Для вычисления площади круга введите радиус r: ");
        float r = sc.nextFloat();
        System.out.println("Площадь круга = " + calcArea(r));

    }
}
