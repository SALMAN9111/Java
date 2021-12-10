package com.techlabs.service.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.service.MyThread;


public class DataServiceTest3 {
	public static void main(String[] args) {
		ExecutorService exService = null;
		MyThread myThread = new MyThread();
		
		try {
			exService = Executors.newFixedThreadPool(2);
			exService.execute(myThread);
			exService.execute(myThread);
			exService.execute(myThread);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(exService != null) {
				exService.shutdown();
			}
		}
	}

}




/*DataService service1 = DataService.getInstance();
		System.out.println(service1.hashCode());
		service1.doTask();
		
		DataService service2 = DataService.getInstance();
		System.out.println(service2.hashCode());
		service2.doTask();*/