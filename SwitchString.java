public class SwitchString {
    public static void main(String[] args) {
        String levelString = "Expert";
        int level = 0;
        switch (levelString) {
            case "Beginner":
                level = 1;
            case "Intermediate":
                level = 2;
            case "Expert":
                level = 3;
            default:
                level = 0;
                break;
        }
        System.out.println("Your level is:" + level);
    }
}
