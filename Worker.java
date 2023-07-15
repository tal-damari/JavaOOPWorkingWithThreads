package Targil1;

public class Worker implements Runnable{
	public static int num=0;
	public static int arr[] = new int[15];
	public static int numOfCustomer = 0 ;
	
	private int id;
	
	public Worker(int id)
	{
		this.id =id;
	}
	
	
	public static void func1(int num, int arr[], int numOfCustomer)
	{
		try {
			System.out.println("In func1");
			Thread.currentThread().sleep(2000);
		}
		catch(InterruptedException e) //handling interrupts from the system//
		{
			System.out.println("Interrupt occures");
		}
		try {   //implement try in to the static array//
		arr[num]+= numOfCustomer;
		System.out.println("current thread is " + Thread.currentThread().getName() + " implementing: "+numOfCustomer);  //which thread implement who in to the array//
		}
		catch(IndexOutOfBoundsException e )   //handling out of bounds in the array exception//
		{
			System.out.println("Out of bounds in the array");
		}
	}
	
	public static void printArr()
	{
		int i;
		System.out.println("array update:");
		for(i=0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public void run()
	{
		func1CriticalSection();
	}
	public static synchronized void func1CriticalSection()  //critical section
	{
		func1(num++, arr, numOfCustomer++);
		printArr();
	}
	
}
