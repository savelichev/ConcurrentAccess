package net.savelichev.mapII.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Contains hash map with synchronization, realized by using Lock
 */
public class MapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();
    private Lock lock = new ReentrantLock();

    /**
     * Insert data into map
     * @param key key for inserting
     * @param value value for inserting
     */
    public void writeData(int key, int value) {

        try{
            if(lock.tryLock(10000,TimeUnit.MILLISECONDS)){

                hashMap.put(key, value);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    /**
     * Read each element in map and out it in to console
     */
    public void readData() {

        try{
            if(lock.tryLock(10000, TimeUnit.MILLISECONDS)){

                for (int key : hashMap.keySet()) {
                    System.out.println(hashMap.get(key));
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }


}
