package org.cusey.Concurrect;

import java.util.*;

//https://www.youtube.com/watch?v=ClO49t-ctXU

public class MainConcurrect<E> {
	
	public List<E> list = new ArrayList<E>();
	
	public boolean outIfAbsent(E x){
		synchronized(list){
			
			boolean absent = !list.contains(x);
			if(absent){
				System.out.println("Element " + x + " not exit in list so added.");
				list.add(x);
			}
			return absent;
		}

	}

	public static void main(String[] args) {

		final MainConcurrect<String> concurrect = new MainConcurrect<>();
		
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

