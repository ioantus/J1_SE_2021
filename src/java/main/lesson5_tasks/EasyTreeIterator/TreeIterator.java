package main.lesson5_tasks.EasyTreeIterator;

import lombok.RequiredArgsConstructor;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Iterator;

@RequiredArgsConstructor
public class TreeIterator implements Iterator<Object> {
    private final ArrayList<Object> array;
    private TreeIterator childArray;
    private Integer currentIndex = -1;

    @Override
    public boolean hasNext() {
        if (array.size() > currentIndex+1) {
            if (array.get(currentIndex+1) instanceof String) {
                return true;
            } else {
                return ((TreeIterator)array.get(currentIndex+1)).hasNext();
            }
        } else if (childArray != null && childArray.hasNext()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Object ret = null;
        do {
            if (childArray == null) {
                currentIndex++;
            }
            if (array.get(currentIndex) instanceof String) {
                ret = array.get(currentIndex);
            } else if (array.get(currentIndex) instanceof TreeIterator) {
                if (childArray == null) {
                    childArray = (TreeIterator)array.get(currentIndex);
                }
                if (childArray.hasNext()) {
                    ret = childArray.next();
                } else {
                    childArray = null;
                }
            } else {
                throw new WrongMethodTypeException("Тип элемента не поддерживается!");
            }
        } while (ret == null);
        return ret;
    }

    @Override
    public void remove()  {
        throw new UnsupportedOperationException();
    }

}
