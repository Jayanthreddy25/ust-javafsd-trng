package Thread;

public class Thread_3 extends Thread{
public static void main(String args[]) {
	Thread_3 t3=new Thread_3();
	try {
		System.out.println("hi");
		t3.sleep(5000);
		System.out.println("slept");
	}
	catch(Exception ex) {
		ex.getStackTrace();
			
		}
	}
}

