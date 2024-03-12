import java.io.IOException;

public class Throws {
    void m() throws IOException {
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String[] args) {
        Throws obj = new Throws();
        obj.p();
        System.out.println("normal flow...");
    }
}
