package Thread;

public class Thread_example1 implements Runnable {
	@Override

	public void run() {

	}

	public static void main(String[] args) {

	Thread thread1 = new Thread();

	thread1.start();

	try {

	thread1.sleep(1000);

	} catch (InterruptedException e) {

	// TODO Auto-generated catch block

	e.printStackTrace();

	}

	thread1.setPriority(1);

	int priority = thread1.getPriority();

	System.out.println(priority);

	System.out.println("Thread Running");

	}

}
