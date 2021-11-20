package Home_Work_5;

/*
Сделать класс Plant абстрактным (добавить слово abstract как модификатор)
Создать два класса Tree и Bush, наследующиеся от класса Plant
    У обоих классов будут конструкторы работающие так же, как и конструктор Plant
    Метод grow в классе Tree будет увеличивать поле с высотой
    Метод grow в классе Bush будет увеличивать поле с шириной
В psvm создать объекты Tree и Bush, вывести их поля, вызвать метод grow и вывести поля ещё раз
Создать массив с Plant, поместить туда три объекта - один Plant, один Tree и один Bush
С помощью цикла for вызвать метод grow() у всех элементов массива
 */
public class HW3 {
    public static void main(String[] args) {
        Tree t = new Tree(2.5, 0.5);
        Bush b = new Bush(0.5, 1.5);
        System.out.printf("Tree %f %f\n", t.height, t.width);
        System.out.printf("Bush %f %f\n", b.height, b.width);
        t.grow();
        b.grow();
        System.out.printf("Tree %f %f\n", t.height, t.width);
        System.out.printf("Bush %f %f\n", b.height, b.width);

        Plant[] plants = new Plant[3];
        plants[0] = new Plant(1, 2);
        plants[1] = new Tree(3, 1);
        plants[2] = new Bush(1, 3);

        for (int i = 0; i < plants.length; i++) {
            plants[i].grow();
        }
        System.out.println(plants[1].height);
        System.out.println(plants[2].width);
    }
}
