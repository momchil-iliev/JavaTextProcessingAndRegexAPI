import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1_ExtractEmails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String p = "([0-9a-zA-Z]+[0-9a-zA-Z(\\.\\-_)]+[0-9a-zA-Z])@[0-9a-zA-Z]+(.)[a-zA-Z]+\\.[0-9a-zA-Z]+";

        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
