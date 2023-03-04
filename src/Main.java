import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split(";");

        if (array[0].equals("S")) {
            System.out.println(separate(array[2]));
        } else {
            combine(array);
        }

    }

    private static String separate(String s) {
        String result = "";
        int startPosition = 0;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                result += " " + s.substring(startPosition, i);
                startPosition = i;
            } else if (i == chars.length - 1) {
                result += " " + s.substring(startPosition);
            }
        }
        return result.substring(1).toLowerCase().replace("(", "").replace(")", "");
    }

    private static String combine(String[] array) {
        String result = "";

        return result;
    }


}