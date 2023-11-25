package org.example;


import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    int min, max;

    public Randoms(int min, int max) {
        random = new Random();
        random.ints(min, max + 1);
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int next = random.nextInt(min, max + 1);
                return next;
            }


        };
        return it;
    }
}

