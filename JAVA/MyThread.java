package Thread;

public class MyThread extends Thread{
	public static void main(String[] args) {
		String name="jayanth";
		MyThread t=new MyThread(name);
		t.run();
	}
	public MyThread(String name) {

		super(name);

		}

		@Override

		public void run() {

		System.out.println("MyThread - START "+Thread.currentThread().getName());

		try {

		Thread.sleep(1000);

		//Get database connection, delete unused data from DB

		doDBProcessing();

		} catch (InterruptedException e) {

		e.printStackTrace();

		}

		System.out.println("MyThread - END "+Thread.currentThread().getName());

		}

		private void doDBProcessing() throws InterruptedException {

		Thread.sleep(5000);

		}
	

}
