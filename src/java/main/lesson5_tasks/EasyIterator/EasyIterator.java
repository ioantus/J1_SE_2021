package main.lesson5_tasks.EasyIterator;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.NoSuchElementException;

public class EasyIterator implements Iterator<Integer> {

    private final Integer[][] array;
    private Integer currentIndexVertical;
    private Integer currentIndexHorisontal;

    public EasyIterator(Integer[][] array) {
        this.array = array;
        currentIndexVertical = 0;
        currentIndexHorisontal = 0;
    }

    public boolean isNewLine(){
        return currentIndexHorisontal == (array[currentIndexVertical].length - 1);
    }

    @Override
    public boolean hasNext() {
        boolean ret = false;
        Integer cursorVertical = currentIndexVertical;
        Integer cursorHorisontal = currentIndexHorisontal;
        do {
            if (cursorHorisontal < array[cursorVertical].length - 1) {
                ret = true;
            } else {
                if (cursorVertical < array.length - 1) {
                    cursorVertical++;
                    cursorHorisontal = 0;
                } else
                    break;
                }
            }
        while (ret == false);
        return ret;
    }

    @Override
    public Integer next() {
        Integer ret;
        if (currentIndexHorisontal < array[currentIndexVertical].length - 1) {
            ret = array[currentIndexVertical][++currentIndexHorisontal];
        } else {
            if (currentIndexVertical < array.length - 1) {
                currentIndexHorisontal = 0;
                ret = array[++currentIndexVertical][++currentIndexHorisontal];
            } else {
                throw new NoSuchElementException();
            }
        }
        return ret;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }

}
