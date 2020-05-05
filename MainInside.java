package no3;

package com.latihan;

public class MainInside
{
 public static void main(String[] args)
 {
	Test obj1 = new Test();
	Test obj2 = new Test();
	Test obj3 = new Test();
	obj1.addCounter();
 System.out.println("Counter milik obj1 ="+ obj1.gerCounter());
 System.out.println("Counter milik obj2 ="+ obj2.gerCounter());
 System.out.println("Counter milik obj3 ="+ obj3.gerCounter());
 }
}
 