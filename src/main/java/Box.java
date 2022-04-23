import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Box<T extends Fruit> implements Comparator<Box<? extends Fruit>> {
    private ArrayList<T> fruits = new ArrayList<>();
    private float boxWeight = 0f;

    public<E extends Fruit> void add(T fruit) {
        fruits.add(fruit);
        boxWeight += fruit.getWeight();
    }

    public float getWeight() {
        return boxWeight;
    }

    @Override
    public int compare(Box b1, Box b2) {
        return Float.compare(b1.getWeight(), b2.getWeight());
    }

    public void move(Box<T> target) {
        fruits.forEach(target::add);
        fruits = new ArrayList<>();
        boxWeight = 0;
    }

    @Override
    public String toString() {
        return fruits.stream()
                .map(e -> "\"" + e.name + "\" ")
                .collect(Collectors.joining()) +
                "вес корзины: " + getWeight();
    }
}
