import java.io.IOException;

public class Bot {
    public static void main(String[] args) {
        try {
         
            Runtime.getRuntime().exec("chmod +x a.sh b.sh").waitFor();

            System.out.println("Install dependencies A...");
            Process p1 = Runtime.getRuntime().exec("./a.sh");
            p1.waitFor();


            System.out.println("Install dependencies B...");
            Process p2 = Runtime.getRuntime().exec("./b.sh");
            p2.waitFor();

   
            System.out.println("app is running");

 
            while (true) {
                try {
                    Thread.sleep(60_000); 
                } catch (InterruptedException e) {
                    System.out.println("done!" + e.getMessage());
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
