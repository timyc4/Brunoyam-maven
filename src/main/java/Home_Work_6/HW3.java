package Home_Work_6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Создать файл story.txt, в котором будет записан любой текст
С помощью Scanner изучить все слова текста:
подсчитать количество чисел в тексте, которые можно принять за номер телефона
Под номером телефона будем понимать номер вида "89999999999",
т.е. число, начинающееся с 89 и длиной ровно 11 символов
Вывести на экран число телефонных номеров в тексте
 */
public class HW3 {
    public static void main(String[] args) throws IOException {
        long minNumberPhone = 89000000000L;
        long maxNumberPhone = 89999999999L;
        int count =0;
        Scanner sc = new Scanner(new FileInputStream("story.txt"));
        while (sc.hasNext()) {
            if(sc.hasNextLong()) {
                long number = sc.nextLong();
                if (number >= minNumberPhone && number <= maxNumberPhone)
                    count++;
            } else {
                    String s = sc.next();
                }
            }
        System.out.println("Найдено количество номеров: " + count);

    }
}
