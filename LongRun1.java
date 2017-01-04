public class LongRun1 {
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("hello 1");
			Thread.sleep(1000L);
		}
	}
}