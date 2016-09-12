package net.savelichev.concurrentaccess.mapII.synchronizedd;

import net.savelichev.concurrentaccess.interfaces.IMapContainer;

import java.util.HashMap;
import java.util.Map;


/**
 * Realization of the container with "synchronized" synchronization.
 */
public class SynchronizedContainer implements IMapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();

    /**
     * Insert data into map
     * @param key key for inserting
     * @param value value for inserting
     */
    public synchronized void writeData(int key, int value) {

        hashMap.put(key, value);
    }

    /**
     * Read each element in map and out it in to console
     */
    public synchronized void readData() {

        for (int key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }


}
