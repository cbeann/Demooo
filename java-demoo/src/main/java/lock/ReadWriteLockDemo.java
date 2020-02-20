package lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author CBeann
 * @create 2020-02-21 0:55
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
        readWriteLock.writeLock().lock();
        readWriteLock.readLock().lock();
        System.out.println("--logic---");
        readWriteLock.readLock().unlock();
        readWriteLock.writeLock().lock();




    }
}
