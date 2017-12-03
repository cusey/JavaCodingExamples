package org.cusey.Concurrency;

public class MainConcurrency {

    private static final int POOL_SIZE = 10;

    public static void main(String[] args) {

        System.out.println(" ******** *Semaphore ******** ");

        ConnectionPool pool = new ConnectionPool(POOL_SIZE);

    }
}
