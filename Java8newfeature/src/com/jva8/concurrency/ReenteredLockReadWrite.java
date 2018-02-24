package com.jva8.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReenteredLockReadWrite {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Map<String, String> map = new HashMap<String, String>();
		ReadWriteLock lock = new ReentrantReadWriteLock();
		
		Runnable readTask = () -> {
			lock.readLock().lock();
		    try {
		    	sleep(5);
		    	
		        System.out.println(map.get("foo"));
		        
		    } finally {
		        lock.readLock().unlock();
		    }
		};

		executor.submit(readTask);

		executor.submit(() -> {
			   lock.writeLock().lock();
		    try {
		    	
		        sleep(1);
		     
		        map.put("foo", "bar");
		    } finally {
		        lock.writeLock().unlock();
		    }
		});
	
		executor.submit(readTask);

		stop(executor);

	}
	
	 public static void stop(ExecutorService executor) {
	        try {
	            executor.shutdown();
	            executor.awaitTermination(60, TimeUnit.SECONDS);
	        }
	        catch (InterruptedException e) {
	            System.err.println("termination interrupted");
	        }
	        finally {
	            if (!executor.isTerminated()) {
	                System.err.println("killing non-finished tasks");
	            }
	            executor.shutdownNow();
	        }
	    }

	    public static void sleep(int seconds) {
	        try {
	            TimeUnit.SECONDS.sleep(seconds);
	        } catch (InterruptedException e) {
	            throw new IllegalStateException(e);
	        }
	    }

	}


