public class TaskThread {
	public static void main(String[] args) {
		Runnable printAt = new PrintChar('@', 100);
		Runnable printDollar = new PrintChar('$', 300);
		Runnable printOdd = new PrintOddNum(300);
		Runnable printPower = new PrintPower(16);
		
		Thread t1 = new Thread(printAt);
		Thread t2 = new Thread(printDollar);
		Thread t3 = new Thread(printOdd);
		Thread t4 = new Thread(printPower);
		
		//t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
