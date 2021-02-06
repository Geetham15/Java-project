package com.lesson.client;

import com.lesson.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		//Two threads running at the same time
		InventoryManager imanager = new InventoryManager();
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				imanager.populateSoldProducts();
				
			}
			
		});
		
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				imanager.displaySoldProducts();
				
			}
			
		});
		
		inventoryTask.start();
		//inventoryTask.join();
		Thread.sleep(2000);
		displayTask.start();
		
	}
}
