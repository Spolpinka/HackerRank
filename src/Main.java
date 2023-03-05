import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("0")) {
            s = sc.nextLine();
            String[] array = s.split(";");

            if (array[0].equals("S")) {
                System.out.println(separate(array[2]));
            } else {
                System.out.println(combine(array));
            }
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
        String[] words = array[2].split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!array[1].equals("C") && i == 0) {
                result += words[0].toLowerCase();
            } else {
                String firstLetter = words[i].substring(0, 1).toUpperCase();
                String word = words[i]. substring(1).toLowerCase();
                result += firstLetter + word;
            }
        }
        if (array[1].equals("M")) result += "()";
        return result;
    }


}