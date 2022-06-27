package corejava;


public class ThreadExample extends Thread  {
	
	//Initiated run method for thread
	
	public void run()
	{
		System.out.println("thred is running");
	}

	public static void main(String[] args) {
		
		ThreadExample th=new ThreadExample();
		
		//Invoking thread
		
		th.start();
		
	

	}

}
