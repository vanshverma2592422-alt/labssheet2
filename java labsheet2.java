
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter question number (1-30): ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1: q1(); break;
            case 2: q2(); break;
            case 3: q3(); break;
            case 4: q4(); break;
            case 5: q5(); break;
            case 6: q6(); break;
            case 7: q7(); break;
            case 8: q8(); break;
            case 9: q9(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            case 16: q16(); break;
            case 17: q17(); break;
            case 18: q18(); break;
            case 19: q19(); break;
            case 20: q20(); break;
            case 21: q21(); break;
            case 22: q22(); break;
            case 23: q23(); break;
            case 24: q24(); break;
            case 25: q25(); break;
            case 26: q26(); break;
            case 27: q27(); break;
            case 28: q28(); break;
            case 29: q29(); break;
            case 30: q30(); break;
            default: System.out.println("Invalid choice");
        }
    }

    // Q1. Area of Triangle Using Heron's Formula
    static void q1() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(area);
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    // Q2. Compound Interest
    static void q2() {
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);
        double interest = amount - p;

        System.out.println(interest);
    }

    // Q3. Distance Between Two Points
    static void q3() {
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println(distance);
    }

    // Q4. Prefix and Postfix Increment
    static void q4() {
        int visitors = sc.nextInt();

        System.out.println(++visitors);
        System.out.println(visitors++);
        System.out.println(visitors--);
        System.out.println(visitors);
    }

    // Q5. Negative Value Using Unary Operator
    static void q5() {
        int n = sc.nextInt();
        int negative = -n;

        System.out.println(negative);
    }

    // Q6. Reduce Number by Half Using /=
    static void q6() {
        double n = sc.nextDouble();
        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println(steps);
    }

    // Q7. Total Rainfall for Seven Days
    static void q7() {
        double total = 0;

        for (int i = 1; i <= 7; i++) {
            double rainfall = sc.nextDouble();
            total += rainfall;
        }

        System.out.println(total);
    }

    // Q8. Valid Triangle Using Angles
    static void q8() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
            a + b + c == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    // Q9. Compare Strings Without compareTo()
    static void q9() {
        String a = sc.nextLine();
        String b = sc.nextLine();

        int i = 0;
        int result = 0;

        while (i < a.length() && i < b.length()) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }

            i++;
        }

        if (result == 0) {
            if (a.length() < b.length())
                result = -1;
            else if (a.length() > b.length())
                result = 1;
        }

        if (result < 0)
            System.out.println("First String is Smaller");
        else if (result > 0)
            System.out.println("First String is Greater");
        else
            System.out.println("Strings are Equal");
    }

    // Q10. Leap Year Within a Given Range
    static void q10() {
        int year = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean leap = year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end)
            System.out.println("Leap Year Within Range");
        else
            System.out.println("Condition Not Satisfied");
    }

    // Q11. Student Pass Using Logical Operators
    static void q11() {
        double theory = sc.nextDouble();
        double practical = sc.nextDouble();
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    // Q12. Smallest of Four Using Ternary Operator
    static void q12() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int ab = (a < b) ? a : b;
        int cd = (c < d) ? c : d;
        int smallest = (ab < cd) ? ab : cd;

        System.out.println(smallest);
    }

    // Q13. Character Classification Using Ternary Operator
    static void q13() {
        char ch = sc.next().charAt(0);

        String result = "aeiouAEIOU".indexOf(ch) >= 0
            ? "Vowel"
            : Character.isLetter(ch)
                ? "Consonant"
                : Character.isDigit(ch)
                    ? "Digit"
                    : "Special Symbol";

        System.out.println(result);
    }

    // Q14. Swap Two Integers Using XOR
    static void q14() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println(a);
        System.out.println(b);
    }

    // Q15. Count Set Bits
    static void q15() {
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        System.out.println(count);
    }

    // Q16. Multiply and Divide Using Shift Operators
    static void q16() {
        int n = sc.nextInt();
        int power = sc.nextInt();

        if (power >= 0 && power < 32) {
            int multiplication = n << power;
            int division = n >> power;

            System.out.println(multiplication);
            System.out.println(division);
        } else {
            System.out.println("Invalid Power");
        }
    }

    // Q17. Cyclically Rotate Bits Left by Two Positions
    static void q17() {
        int n = sc.nextInt();

        int rotated = (n << 2) | (n >>> 30);

        System.out.println(rotated);
    }

    // Q18. First Twenty Fibonacci Terms
    static void q18() {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }
    }

    // Q19. Armstrong Numbers from 1 to 1000
    static void q19() {
        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n)
                System.out.println(n);
        }
    }

    // Q20. Accept Password Until Correct
    static void q20() {
        String correctPassword = "java123";
        String password;

        do {
            password = sc.nextLine();
        } while (!password.equals(correctPassword));

        System.out.println("Correct Password");
    }

    // Q21. Display Factors Using do-while
    static void q21() {
        int n = sc.nextInt();
        int i = 1;

        if (n > 0) {
            do {
                if (n % i == 0)
                    System.out.println(i);

                i++;
            } while (i <= n);
        }
    }

    // Q22. Reverse Digits Using while
    static void q22() {
        int n = sc.nextInt();
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println(reverse);
    }

    // Q23. Palindrome Number Using while
    static void q23() {
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        if (original >= 0 && original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // Q24. Maximum and Minimum Using for-each
    static void q24() {
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int x : arr) {
            if (x > max)
                max = x;

            if (x < min)
                min = x;
        }

        System.out.println(max);
        System.out.println(min);
    }

    // Q25. Average Marks Using 2D Array and for-each
    static void q25() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int[][] marks = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        int total = 0;
        int count = 0;

        for (int[] row : marks) {
            for (int mark : row) {
                total += mark;
                count++;
            }
        }

        System.out.println((double) total / count);
    }

    // Q26. Weekday or Weekend Using switch-case
    static void q26() {
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    // Q27. Grade Meaning Using switch-case
    static void q27() {
        char grade = Character.toUpperCase(
            sc.next().charAt(0));

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }

    // Q28. Skip Perfect Squares Using continue
    static void q28() {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i)
                continue;

            System.out.println(i);
        }
    }

    // Q29. Random Numbers Using break
    static void q29() {
        Random random = new Random();

        while (true) {
            int n = random.nextInt(100) + 1;
            System.out.println(n);

            if (n % 7 == 0 && n % 13 == 0)
                break;
        }
    }

    // Q30. Power of Four, Toggle Bit and Multiplication Table
    static void q30() {
        int n = sc.nextInt();

        boolean powerOfFour = n > 0 &&
            (n & (n - 1)) == 0 &&
            (n & 0x55555555) != 0;

        System.out.println(powerOfFour);

        int toggled = n ^ (1 << 2);
        System.out.println(toggled);

        for (int i = 1; i <= 10; i++) {
            int product = n * i;

            if (product % 48 == 0)
                break;

            if (product % 6 == 0)
                continue;

            System.out.println(product);
        }
    }
}
