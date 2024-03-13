import java.io.FileOutputStream;

public class FileOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\myBasement\\hello.txt");
            fout.write(153);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
