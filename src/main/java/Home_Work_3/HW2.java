package Home_Work_3;

import java.util.Scanner;

/*
Спросить у пользователя число N
С помощью цикла создать массив с числами от N до 10*N
Вывести все элементы массива на экран
 */
public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = sc.nextInt();
        int count = 0;
        int[] arr = new int[]{N,2*N,3*N,4*N,5*N,6*N,7*N,8*N,9*N,10*N};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Эллемент массива "+ count + " содержит число: "+arr[i]);
            count++;

        }


    }
}
