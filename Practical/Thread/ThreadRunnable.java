package corejava;

public class ThreadRunnable implements Runnable {

	// Initiated run method for thread

	public void run() {
		System.out.println("Thread is running successfully");
	}

	public static void main(String[] args) {

		ThreadRunnable tr = new ThreadRunnable();

		// Initializing Thread object

		Thread th = new Thread(tr);

		// Invoking Thread

		th.start();

	}

}
