public class String4 {
    public static void main(String[] args) {
        String s1 = "my name is daksh. my name is bob. my name is sono.";
        String replaceString = s1.replaceAll("\\s", "");
        System.out.println(replaceString);
    }
}
