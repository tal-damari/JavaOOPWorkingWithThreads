package Targil1;

import Targil1.Worker;

public class ClassMain {

	public static void main(String[] args) throws NumberFormatException, InterruptedException{
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<5; i++)
		{
			Thread t1 = new Thread(new Worker(1));
			Thread t2 = new Thread(new Worker(2));
			Thread t3 = new Thread(new Worker(3));
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		}
		
		Worker w1 = new Worker(12);
		w1.printArr();
	}

}
