package org.cusey.Concurrency;

import java.util.concurrent.Semaphore;

public class ConnectionPool {

    private Object[] connections;
    private boolean[] inUse;
    private int poolSize = 0;

    private Semaphore semaphore;

    public ConnectionPool (int poolSize){

        this.poolSize = poolSize;

        for (int i = 0; i < poolSize; ++i){
            connections[i] = new Object ();
            inUse[i] = false;
        }

        semaphore = new Semaphore (poolSize);

    }

    /**
     Get a permit from our semaphore object.
     Check for a available object, and return it if is found.
     Otherwise, throw an exception (this should not happen
     because the pool size is initialized in the constructor).
     */
    public Object checkOutConnection ()
    {
        try
        {
            semaphore.acquire ();
        }
        catch (InterruptedException error)
        {
            System.out.println (error.getMessage());
        }

        synchronized (this)
        {
            for (int i = 0; i < poolSize; ++i)
                if (!inUse[i])
                {
                    inUse[i] = true;
                    return connections[i];
                }
        }

        throw new IllegalStateException ("No connections available.");
    }

    public synchronized void checkInConnection (Object connection)
    {
        for (int i = 0; i < poolSize; ++i)
            if (connections[i] == connection)
            {
                if (!inUse[i])
                    throw new IllegalArgumentException("This connection has already been returned.");

                inUse[i] = false;
                semaphore.release ();
                return;
            }

        throw new IllegalArgumentException ("No such object in pool.");
    }
}
