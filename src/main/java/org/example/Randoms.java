package org.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected int min, max;
    private Iterator<Integer> intIterator;

    public Randoms(int min, int max) {
        intIterator = new Random().ints(min,max+1).iterator();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>(){


            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (hasNext()){
                    return intIterator.next();
                }
                return null;
            }
        };
    }
}
