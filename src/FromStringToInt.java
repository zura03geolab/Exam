import java.util.Scanner;

/**
 * Created by Zurab Vashakidze on 15/04/2016.
 */
public class FromStringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შემოიტანეთ რიცხვი (String): ");
        String input = scanner.nextLine();
        System.out.print("შემოტანილი რიცხვი (To Int): ");
        System.out.println(parseInt(input));
    }
    private static int parseInt(String st){
        int number=Integer.valueOf(st);

        return number;
    }
}