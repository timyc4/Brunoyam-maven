package Home_Work_3;

/*
Создать массив с любыми целыми числами
Посчитать сумму элементов массива и если она больше 100, вывести "Большой массив"
 */
public class HW1 {
    public static void main(String[] args) {
        int[] array = new int[]{100,300,-800};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;

        }
        if (sum > 100) {
            System.out.println("Большой массив");
        } else
            System.out.println("Сумма массива = " + sum);

    }
}
