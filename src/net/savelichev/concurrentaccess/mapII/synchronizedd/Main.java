package net.savelichev.concurrentaccess.mapII.synchronizedd;

import net.savelichev.concurrentaccess.interfaces.IMapContainer;
import net.savelichev.concurrentaccess.utills.DataGenerator;
import net.savelichev.concurrentaccess.utills.DataReader;

public class Main {

    public static void main(String[] args) {


        IMapContainer mapContainer = new SynchronizedContainer();

        Thread generator = new Thread(new DataGenerator(mapContainer));
        generator.setName("generator");
        generator.start();
        Thread reader = new Thread(new DataReader(mapContainer));
        reader.setName("reader");
        reader.start();

    }
}
