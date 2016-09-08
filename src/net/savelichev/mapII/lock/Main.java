package net.savelichev.mapII.lock;

public class Main {

    public static void main(String[] args) {


        MapContainer mapContainer = new MapContainer();

        Thread generator = new Thread(new DataGenerator(mapContainer));
        generator.setName("generator");
        generator.start();
        Thread reader = new Thread(new DataReader(mapContainer));
        reader.setName("reader");
        reader.start();

    }
}
