import java.util.Arrays;

public class StringListImpl implements StringList {
    private final String[] storage;
    private int size;

    public StringListImpl() {
        storage = new String[10];
    }

    public StringListImpl(int initSize) {
        storage = new String[initSize];
    }

    @Override
    public String add(String item) {
        return null;
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(),otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    //возвращает копию массива storage без пустых ячеек
    @Override
    public String[] toArray() {
        return Arrays.copyOf(storage, size);
    }

    public void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    public void indexItem(int index) {
        if (index < 0 || index > size) {
            throw new InvalideIndexException();
        }
    }

    public void validateSize(String item) {
        if (size == storage.length) {
            throw new SizeIsFullException();
        }
    }
}
