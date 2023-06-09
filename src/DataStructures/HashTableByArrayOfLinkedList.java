package DataStructures;

public class HashTableByArrayOfLinkedList<T>{
    int size;
    Entry[] entries;
    public HashTableByArrayOfLinkedList(int size){
        this.size = size;
        entries = new Entry[size];
        for(int i = 0 ; i < entries.length; i++){
            entries[i] = new Entry<T>();
        }

    }

    int getHash(int key){
        return key % size;
    }
    public void put(int key, T vlaue){
        int index = getHash(key);
        Entry entryIndex = entries[index];
        Entry newEntry = new Entry<T>(key, vlaue);
        newEntry.next = entryIndex.next;
        entryIndex.next = newEntry;
    }

    public T get(int key){
        T value = null;
        int index = getHash(key);
        Entry enteryIndex = entries[index];
        while (enteryIndex != null){
            if(enteryIndex.getKey() == key){
                value = (T) enteryIndex.getValue();
                break;
            }
            enteryIndex = enteryIndex.next;
        }
       return value;
    }



}
