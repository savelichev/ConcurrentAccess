package net.savelichev.mapII.collectionsSynchronizedMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class MapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();

    private Map<Integer,Integer> syncHashMap = Collections.synchronizedMap(hashMap);


    public void writeData(int key, int value) {

        syncHashMap.put(key, value);
    }

    public  void readData() {

        for (int key : syncHashMap.keySet()) {
            System.out.println(syncHashMap.get(key));
        }
    }


}
