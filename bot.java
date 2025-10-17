public class bot {
    public static void main(String[] args) {
        System.out.println("bot 已启动，30 秒后自动结束。");
        try {
            Thread.sleep(30_000); // 30 秒
        } catch (InterruptedException e) {
            System.out.println("中断异常: " + e.getMessage());
        }
        System.out.println("bot 已退出。");
    }
}
