public class PrintChar implements Runnable{
	private char print;
	private int times;
	
	public PrintChar(char c, int t) {
		print = c;
		times = t;
	}
	
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(print);
		}
	}
}
