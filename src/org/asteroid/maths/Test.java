import java.io.*;

public class Test {
    public static void main (String[] args) {
        try {
            FileReader fl = new FileReader(new File("Numbers.java"));
            BufferedReader bf = new BufferedReader(fl);
            String s = bf.readLine();
            while (s != null) {
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(s.charAt(i));
                    Thread.sleep(50);
                }
                Thread.sleep(200);
                System.out.println();
                s = bf.readLine();
                if (s == null)
                    break;
            }
        } catch (Exception e) {
        }
    }
}
