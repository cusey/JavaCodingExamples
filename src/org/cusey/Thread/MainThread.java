package org.cusey.Thread;

import java.util.ArrayList;
import java.util.List;

public class MainThread<E> {

    public List<E> list = new ArrayList<E>();

    public boolean outIfAbsent(E x){
        synchronized(list){

            boolean absent = !list.contains(x);
            if(absent){
                System.out.println("Element " + x + " does not exist in list so added.");
                list.add(x);
            }
            return absent;
        }

    }

    public static void main(String[] args) {

        final MainThread<String> concurrect = new MainThread<>();

        Thread threadOne  = new Thread( new Runnable(){
            @Override
            public void run() {concurrect.outIfAbsent("JOHN");}
        });

        Thread threadTwo = new Thread( new Runnable(){
            @Override
            public void run() {concurrect.outIfAbsent("JOHN");}
        });

        Thread threadThree = new Thread( new Runnable(){
            @Override
            public void run() {concurrect.outIfAbsent("JOHN");}
        });

        threadOne.start();
        threadTwo.start();
        threadThree.start();

    }
}
