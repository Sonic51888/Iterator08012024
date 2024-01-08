package ru.netology;
import java.util.Iterator;
import java.util.Random;

public class RandomsImplIterable implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public RandomsImplIterable (int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min + 1) + min;
            }
        };
    }
}