package hashmap;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int DEFAULT_INITIAL_CAPACITY = 20;
    private Entry<K, V>[] table;
    private int size;


    public MyHashMap() {
        table = new Entry[DEFAULT_INITIAL_CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        int hash = getHash(key);
        Entry<K, V> entry = table[hash];

        if (entry == null) {
            table[hash] = new Entry<>(key, value);
        } else {
            putInEntry(entry, key, value);
        }

        size++;
    }

    private void putInEntry(Entry<K, V> entry, K key, V value) {
        while (entry.getNext() != null) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
            entry = entry.getNext();
        }

        if (entry.getKey() == key) {
            entry.setValue(value);
            return;
        }
        entry.setNext(new Entry<>(key, value));
    }

    @Override
    public void remove(K key) {
        int hash = getHash(key);
        Entry<K, V> entry = table[hash];

        if (entry == null) {
            return;
        }

        if (entry.getKey() == key) {
            table[hash] = entry.getNext();
            entry.setNext(null);
            --size;
            return;
        }

        Entry<K, V> prevEntry = entry;
        entry = entry.getNext();

        while (entry != null) {
            if (entry.getKey() == key) {
                prevEntry.setNext(entry.getNext());
                entry.setNext(null);
                --size;
                return;
            }
            prevEntry = entry;
            entry = entry.getNext();
        }


    }

    @Override
    public void clear() {
        table = new Entry[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {
        int hash = getHash(key);
        Entry<K, V> entry = table[hash];

        if (entry == null) {
            return null;
        }

        while (entry != null) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
            entry = entry.getNext();
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                stringBuilder.append("[").append(i).append("] ").append(table[i]).append("\n");
            }
        }

        stringBuilder.append("size = ").append(size);
        return stringBuilder.toString();
    }

    private int getHash(K key) {
        return key == null ? 0 : key.hashCode() % table.length;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            if (next == null) return null;
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            Entry<K, V> temp = this;
            StringBuilder stringBuilder = new StringBuilder();
            while (temp != null) {
                stringBuilder.append(temp.key).append(" -> ").append(temp.value).append(", ");
                temp = temp.next;
            }
            return stringBuilder.toString();
        }
    }
}
