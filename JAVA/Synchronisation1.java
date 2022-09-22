package Java8;

public class Synchronisation1 {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start();
		Thread t2 = new Thread();
		t2.start();
		
	}
	public void run() {
		synchronized(this) {
			 System.out.println("is synchronized");
			 
		}
		System.out.println("Thread is started");
		System.gc();
	}
}
