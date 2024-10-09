//Multithreading using the Runnable Interface
class MyThread implements Runnable 
{
    	private String threadName;

    	MyThread(String name) 
	{
        	this.threadName = name;
    	}

    	@Override
    	public void run() 
	{
        	try 
		{
            		for (int i = 1; i <= 5; i++) 
			{
                		System.out.println(threadName + ": " + i);
                		Thread.sleep(500);  // Pausing the thread for 500ms
            		}
        	} 
		catch (InterruptedException e) 
		{
            		System.out.println(threadName + " interrupted.");
        	}
        	System.out.println(threadName + " exiting.");
    	}
}

class Multithreading
{
    	public static void main(String[] args) 
	{
        	System.out.println("Main thread starting.");

        	// Creating instances of threads
        	MyThread runnable1 = new MyThread("Thread 1");
        	MyThread runnable2 = new MyThread("Thread 2");

        	Thread thread1 = new Thread(runnable1);
        	Thread thread2 = new Thread(runnable2);

        	thread1.start();  // Starting thread1
        	thread2.start();  // Starting thread2

        	try 
		{
            		thread1.join();  // Waiting for thread1 to finish
            		thread2.join();  // Waiting for thread2 to finish
        	}
		catch (InterruptedException e)
		{
            		System.out.println("Main thread interrupted.");
        	}
		System.out.println("Main thread ending.");
    	}
}
