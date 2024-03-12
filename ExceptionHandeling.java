public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            // code that may raise exception
            int data = 100 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        // rest code of program
        System.out.println("rest of code...");
    }
}
