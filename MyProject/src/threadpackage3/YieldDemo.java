package threadpackage3;

public class YieldDemo {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0;i<5;i++) {
			Thread.yield();
			
			System.out.println(Thread.currentThread().getName() +" Second in control");
		}
	}

}
