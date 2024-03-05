public class Array1 {
    public static void main(String[] args) {
        float sum = 0;
        float percentage = 0;
        int[] marks = { 60, 50, 76, 80, 90, 95 };
        int temp = 0;
        System.out.println("marks of all subjects :");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + "");
        }
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < marks.length - 1; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum + "Total marks obtained ");
        percentage = (sum / 500) * 100;
        System.out.println("percentage :" + percentage);
    }
}
