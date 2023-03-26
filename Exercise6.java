import java.util.Scanner;

public class Exercise6 {
    // Method
    /**
     * Check number type and print out
     * 
     * @param num
     */
    // Exercise61
    public void printType1(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    // Exercise62
    public void printType2(int number) {
        // TODO
        if (number == 0) {
            System.out.println(number + " is zero");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is obb");
        }
    }

    // Exercise63
    public void checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("This character is a vowel.");
        } else {
            System.out.println("This character is not a vowel.");
        }
    }

    // Exercise64
    public void checkChar(char x) {
        if (Character.isUpperCase(x)) {
            System.out.println("This character is Uppercase.");
        } else if (Character.isLowerCase(x)) {
            System.out.println("This character is Lowercase.");
        } else {
            System.out.println("This character is Not a letter.");
        }
    }

    // ดูจากตาราง ascii table ใช้ดูตำแหน่งของตัวอักษร
    public void checkCharX(char x) {
        if (x >= 65 && x <= 122) {
            System.out.println("This character is Uppercase.");
        } else if (x >= 97 && x <= 122) {
            System.out.println("This character is Lowercase.");
        } else {
            System.out.println("This character is Not a letter.");
        }
    }

    // Exercise65
    public void isPositive(int num, Scanner input) {
        while (num <= 0) {
            System.out.println("Enter positive number : ");
            num = input.nextInt();

        }
        System.out.println("is positive number");
    }

    // Exercise66
    public void isOdd(int num, Scanner input) {
        do {
            System.out.println("Enter Odd number : ");
            num = input.nextInt();

        } while (num % 2 == 0);
        System.out.println("is Odd number");
    }

    // Exercise67
    public void isDividedByN(int num, int n, Scanner input) {
        for (int i = 1; i <= num; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }

    }

    // Exercise68

    public void printStarAdvance(int num) {
        for (int i = 1; i <= num; i++) {
            // สร้างดาวหน้าหลัง
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }

            System.out.println(); // เพิ่มเว้นบรรทัดหลังจบแต่ละแถว
        }
    }

    public static void main(String[] args) {
        Exercise6 ex = new Exercise6();
        Scanner input = new Scanner(System.in);
        // System.out.println("Please, enter a number: ");
        // int num = input.nextInt();
        // ex.printType1(num);

        // ex.printType2(num);

        // System.out.println("Please, enter a character: ");
        // String text = input.next();
        // char c = text.charAt(0);
        // ex.checkVowel(c);

        // char x = text.charAt(0);
        // ex.checkChar(x);
        // ex.checkCharX(x);

        // ex.isPositive(num , input);
        // ex.isOdd(0, input);

        // Exercise67

        // System.out.print("Please, enter a number: ");
        // int num = input.nextInt();
        // System.out.print("Please, enter a denominator: ");
        // int n = input.nextInt();
        // ex.isDividedByN(num, n, input);

        // Exercise68

        System.out.print("Please, enter a number: ");
        int num = input.nextInt();
        ex.printStarAdvance(num);

    }

}