package Thread;

public class HeavyWorkRunnable implements Runnable{
	
	public static void main(String[] args) {
		Runnable t=new HeavyWorkRunnable();
		t.run();
	}
	
	@Override
	public void run() {
	System.out.println("doing heavy processing-START"+Thread.currentThread().getName());
	try {
		Thread.sleep(1000);;
		//get data base connection,delete un used data from DB
		doDBProcessing();
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Doing heavy processing-END"+Thread.currentThread().getName());
	
	}
	
	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(5000);
		
	}

}
