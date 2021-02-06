/*
 * package com.lesson.threading;
 * 
 * public class Application {
 * 
 * public static void main(String[] args) { //JVM kicks of the first thread
 * 
 * 
 * System.out.println("Starting Thread 1"); Task taskRunner = new
 * Task("Thread-A"); taskRunner.start();
 * 
 * //taskRunner.start(); // not legal to start a thread more than once
 * 
 * System.out.println("Starting Thread 2"); Task taskRunner2 = new
 * Task("Thread-B"); taskRunner2.start(); }
 * 
 * }
 * 
 * class Task extends Thread { String name; public Task(String name) { this.name
 * = name; } public void run() { Thread.currentThread().setName(this.name);
 * for(int i=0;i<100;i++) { System.out.println("number : " + i + " - " +
 * Thread.currentThread().getName()); try { Thread.sleep(10); } catch
 * (InterruptedException e) { e.printStackTrace(); } } }
 * 
 * }
 */