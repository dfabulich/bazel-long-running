public class LongRun2 {
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("hello 2");
			Thread.sleep(1000L);
		}
	}
}