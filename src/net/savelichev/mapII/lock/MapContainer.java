package net.savelichev.mapII.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class MapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();
    private Lock lock = new ReentrantLock();


    public void writeData(int key, int value) {

        try{
            if(lock.tryLock()){

                hashMap.put(key, value);

            }
        }finally {
            lock.unlock();
        }

    }

    public void readData() {

        try{
            if(lock.tryLock()){

                for (int key : hashMap.keySet()) {
                    System.out.println(hashMap.get(key));
                }

            }
        }finally {
            lock.unlock();
        }


    }


}
