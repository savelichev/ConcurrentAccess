package net.savelichev.mapII.synchronizedd;

import java.util.HashMap;
import java.util.Map;


public class MapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();


    public synchronized void writeData(int key, int value) {

        hashMap.put(key, value);
    }

    public synchronized void readData() {

        for (int key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }


}
