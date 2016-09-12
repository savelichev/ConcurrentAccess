package net.savelichev.concurrentaccess.mapII.synchronizedMap;

import net.savelichev.concurrentaccess.interfaces.IMapContainer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Realization of the container with Collections.synchronizedMap synchronization.
 */
public class SynchronizedMapContainer implements IMapContainer {


    private Map<Integer, Integer> syncHashMap = Collections.synchronizedMap(new HashMap<Integer, Integer>());

    /**
     * Insert data into map
     *
     * @param key   key for inserting
     * @param value value for inserting
     */
    public void writeData(int key, int value) {

        syncHashMap.put(key, value);
    }

    /**
     * Read each element in map and out it in to console
     */
    public void readData() {

        for (int key : syncHashMap.keySet()) {
            System.out.println(syncHashMap.get(key));
        }
    }


}
