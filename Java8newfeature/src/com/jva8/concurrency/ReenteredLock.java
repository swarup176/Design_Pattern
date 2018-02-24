package com.jva8.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

public class ReenteredLock {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		ReentrantLock lock = new ReentrantLock(true);

		executor.execute(() -> {
		    lock.lock();
		    System.out.println("First");
		    try {
		        sleep(10);
		    } finally {
		        lock.unlock();
		    }
		});

		Future<String> future = 	executor.submit(() -> {
		    System.out.println("Locked: " + lock.isLocked());
		    System.out.println("Held by me: " + lock.isHeldByCurrentThread());
		    sleep(10);
		    boolean locked = lock.tryLock();
		    System.out.println("Lock acquired: " + locked);
		    return "swarup";
		});
        try {
			System.out.println(future.get(2000, TimeUnit.MILLISECONDS).toUpperCase());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
   System.out.println("The job is finished");
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


