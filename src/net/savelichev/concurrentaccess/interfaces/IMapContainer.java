package net.savelichev.concurrentaccess.interfaces;

/**
 * Interface for MapContainers
 */
public interface IMapContainer {

    void writeData(int key, int value);

    void readData();
}
