public class PrintPower implements Runnable{
private int num;
	
	public PrintPower(int n) {
		num = n;
	}
	
	public void run() {
		Thread at = new Thread(new PrintChar('@', 100));
		at.start();
		try {
			for (int i = 1; i <= num; i++) {
				System.out.print(" " + Math.round(Math.pow(2, i)));
				if (i == 8) {
					at.join();
				}
			} 
		}catch (InterruptedException e) {	
				e.printStackTrace();
		}
	}
}
