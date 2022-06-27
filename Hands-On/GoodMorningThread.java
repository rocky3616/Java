package corejava;

import java.io.*;
import java.util.*;
import java.lang.*;

public class GoodMorningThread implements Runnable {
	public void run() {
		//infinite looping

		while (true) {
			System.out.println("Good Morning");
			try {
				//crating delay of 200ms
				Thread.sleep(200l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Welcome");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new GoodMorningThread();
		//creating thread
		Thread t1 = new Thread(r1);

		t1.start();

	}

}
