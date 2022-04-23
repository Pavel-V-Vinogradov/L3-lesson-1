import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        main.swappingArrayElements(integers, 0, 4);
        System.out.println(Arrays.toString(integers));

        String[] strings = new String[]{"ааа", "bbb", "ccc", "ddd"};
        main.swappingArrayElements(strings, 1, 3);
        System.out.println(Arrays.toString(strings));

        ArrayList<Integer> integerArrayList= main.arrayToArrayList(integers);
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList= main.arrayToArrayList(strings);
        System.out.println(stringArrayList);

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple("Антоновка"));
        appleBox.add(new Apple("Грушовка"));
        appleBox.add(new Apple("Золотой налив"));
        System.out.println(appleBox);

        Box<Orange> orangeBox =  new Box<>();
        orangeBox.add(new Orange("Маро"));
        orangeBox.add(new Orange("Маро"));
        orangeBox.add(new Orange("Тарокко"));
        System.out.println(orangeBox);

        System.out.println("Сравниваем корзины по весу: "+appleBox.compare(appleBox, orangeBox));

        Box<Apple>  templateBox = new Box<>();
        appleBox.move(templateBox);
        System.out.println(appleBox);
        System.out.println(templateBox);

    }

    private <E> void swappingArrayElements(E[] array, int firstIndex, int secondIndex) {
        E item;
        item = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = item;
    }

    private <E> ArrayList<E> arrayToArrayList(E[] e) {
        return new ArrayList<>(Arrays.asList(e));
    }
}
