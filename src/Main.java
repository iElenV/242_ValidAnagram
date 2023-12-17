import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку 1: ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = scanner.nextLine();
         DoesItAnagram(str1, str2);
    }

    public static void DoesItAnagram(String str1, String str2)
    {
        if (str1.length() == str2.length())
        {
            while (!str1.isEmpty()) {
                int k1 = 0;
                int k2 = 0;
                char symbol = str1.charAt(0);
                for (int j = 0; j < str1.length(); j++)
                {
                    if (str1.charAt(j) == symbol) {
                        k1++;
                    }
                    if (str2.charAt(j) == symbol) {
                        k2++;
                    }
                }
                if (k1 == k2) {
                    str1 = str1.replaceAll(String.valueOf(symbol), "");
                    str2 = str2.replaceAll(String.valueOf(symbol), "");

                } else {
                    System.out.println("не анаграмма");
                    break;
                }
                if (str1.isEmpty()) {
                    System.out.println("анаграмма");
                }
            }
        } else
        {
            System.out.println("не анаграмма");
        }
    }
}



