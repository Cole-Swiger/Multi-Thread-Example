public class PrintOddNum implements Runnable {
	private int num;
	
	public PrintOddNum(int n) {
		num = n;
	}
	
	public void run() {
		for (int i = 1; i <= num; i = i + 2) {
			System.out.print(" " + i);
		}
	}
}
