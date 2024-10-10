// To Print Synchronization in Java
class Table 
{
    	synchronized void printTable(int n) 
	{
        	for (int i = 1; i <= 5; i++) 
		{
            		System.out.println(n * i);
            		try 
			{
                		Thread.sleep(500);
            		} 
			catch (Exception e) 
			{
                		System.out.println(e);
            		}
        	}
    	}
}
class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5); // Print table of 5
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100); // Print table of 100
    }
}

public class Synchronization_in_java {
    public static void main(String[] args) {
        Table obj = new Table(); // Only one object of Table is created
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
