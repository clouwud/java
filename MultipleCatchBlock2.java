public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        } catch (Exception e) {
            System.out.println("parent exception occurs");
        }
        System.out.println("Rest of the code...");
    }
}
