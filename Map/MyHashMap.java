package Map;

import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    List<int[]> myList;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        myList = new ArrayList<>();
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        boolean isContained = false;
        for (int[] arrTemp : myList) {
            int keyTemp = arrTemp[0];
            if (keyTemp == key) {
                arrTemp[1] = value;
                isContained = true;
                break;
            }
        }
        if (!isContained) {
            int[] newEntry = new int[2];
            newEntry[0] = key;
            newEntry[1] = value;
            myList.add(newEntry);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        for (int[] arrTemp : myList) {
            int keyTemp = arrTemp[0];
            if (keyTemp == key) {
                return arrTemp[1];
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        for (int[] arrTemp : myList) {
            int keyTemp = arrTemp[0];
            if (keyTemp == key) {
                myList.remove(arrTemp);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */