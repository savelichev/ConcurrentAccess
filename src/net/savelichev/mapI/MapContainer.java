package net.savelichev.mapI;

import java.util.HashMap;
import java.util.Map;


public class MapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();


    public void writeData(int key, int value) {

        hashMap.put(key, value);
    }

    public void readData() {

        for (int key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }


}
