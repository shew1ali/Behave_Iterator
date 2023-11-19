package org.example;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected PrimitiveIterator.OfInt randomIterator;

    public Randoms(int min, int max) {
       randomIterator = new Random().ints(min,max).iterator();

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
                return randomIterator.nextInt();
            }
        };

    }
}