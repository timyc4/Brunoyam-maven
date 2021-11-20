package Home_Work_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
В psvm по байтам скопировать любой файл с изображением
Использовать FileInputReader и FileOutputWriter как в методе streamsByte класса Main
При этом после чтения байта из исходного файла,
записывать в выходной файл значение этого байта увеличенное на 1 (т.е. изменить написание строки 60)
P.S. psvm дополнить "throws IOException" после "(String[] args)" и до начала фигурных скобок,
как psvm в классе Main
 */
public class HW2 {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("java.png");
        FileOutputStream output =   new FileOutputStream("java_copy.png");

        int i = 0;
        while ((i = input.read()) != -1) {
            /*При такой записи, картинка ломается*/
//            output.write(i+1);
            /*А так копируется норм*/
            output.write(i);
        }
        input.close();
        output.close();

    }
}
