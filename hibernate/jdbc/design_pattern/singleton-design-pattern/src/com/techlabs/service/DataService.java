package com.techlabs.service;

public class DataService {
	private static DataService instance;

	private DataService() {
		System.out.println("Service created.");
	}

	public void doTask() {
		System.out.println("Task done by " + this.hashCode() + "\n");
	}

	public static DataService getInstance() {
		if (instance == null) {
			//synchronized (DataService.class) {
				//if (instance == null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return instance = new DataService();
				//}
		//	}
		}

		return instance;
	}

}

/*
 * if (instance == null) { try { Thread.sleep(2000); } catch
 * (InterruptedException e) { e.printStackTrace(); } return instance = new
 * DataService(); }
 */

/*if (instance == null) {
			synchronized (DataService.class) {
				if (instance == null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return instance = new DataService();
				}
			}
		}*/