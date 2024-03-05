import java.util.Scanner;

class Array {
    public static void descending(int marks[]) {
        int temp = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 1; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }

        System.out.println();

    }

    public static float percentage(int marks[]) {
        float sum = 0, percentage = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum + " Total marks obtained");
        percentage = (sum / 500) * 100;
        System.out.println("percentage :" + percentage);
        return percentage;
    }

    public static void marks(int marks[]) {
        System.out.println("marks of all subjects: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + "");
        }
    }

    public static void grade(float per) {
        if (per < 40) {
            System.out.println("Fail");
        } else if (per >= 40 && per < 50) {
            System.out.println("E Grade");
        } else if (per >= 50 && per < 60) {
            System.out.println("D Grade");
        } else if (per >= 60 && per < 70) {
            System.out.println("C Grade");
        } else if (per >= 70 && per < 80) {
            System.out.println("B Grade");
        } else if (per >= 80 && per < 90) {
            System.out.println("A Grade");
        } else if (per >= 90 && per < 100) {
            System.out.println("A+ Grade");
        } else {
            System.out.println("Invalid");
        }
    }

    public static int check(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[6];

        System.out.println("enter marks :");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int val = check(marks);

        if (val == 0) {
            System.out.println("sorry you are fail, we can not process further. Best of Luck next time");
        } else {
            descending(marks);
            marks(marks);

            float per = percentage(marks);

            grade(per);
        }
    }
}