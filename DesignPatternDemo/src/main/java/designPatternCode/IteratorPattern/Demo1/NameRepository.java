package designPatternCode.IteratorPattern.Demo1;

public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    private class NameIterator implements Iterator {

        int index;


        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

    public Iterator getIterator() {
        return new NameIterator();
    }
}
