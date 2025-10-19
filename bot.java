public class Bot {
public static void main(String[] args) {
System.out.println("Hello, world!");
try {
Thread.sleep(10_000); // 等待 10 秒
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
}
System.out.println("Program finished.");
}
}
