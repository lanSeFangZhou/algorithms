package designPatternCode.IteratorPattern.Demo2;

import designPatternCode.IteratorPattern.Demo1.Container;
import designPatternCode.IteratorPattern.Demo1.Iterator;

public class StringArrayIterator implements Iterator {
    String[] args;
    int index = 0;

    public StringArrayIterator(String[] argTemp) {
        this.args = argTemp;
    }

    public boolean hasNext() {
        if (index < args.length) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (index < args.length) {
            return args[index++];
        }
        return null;
    }

    public class NameRepository implements Container {
        public String names[] = {"Robert", "John", "Julie", "Lora"};

        public Iterator getIterator() {
            return new StringArrayIterator(names);
        }
    }
}
