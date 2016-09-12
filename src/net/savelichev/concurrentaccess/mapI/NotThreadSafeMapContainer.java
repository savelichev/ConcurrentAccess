package net.savelichev.concurrentaccess.mapI;

import net.savelichev.concurrentaccess.interfaces.IMapContainer;

import java.util.HashMap;
import java.util.Map;


/**
 * Realization of the container without synchronization.
 */
public class NotThreadSafeMapContainer implements IMapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();

    /**
     * Insert data into map
     *
     * @param key   key for inserting
     * @param value value for inserting
     */
    public void writeData(int key, int value) {

        hashMap.put(key, value);
    }


    /**
     * Read each element in map and out it in to console
     */
    public void readData() {

        for (int key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }


}
