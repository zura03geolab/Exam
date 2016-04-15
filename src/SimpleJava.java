import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zurab Vashakidze on 15/04/2016.
 */
public class SimpleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("დამამთავრებელი სიმბოლო არის 0");
        System.out.println("შემოიტანეთ რიცხვები: ");
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (true){
            int y = scanner.nextInt();
            if (y == 0) {
                break;
            }
            else{
                arrayList.add(y);
            }

        }
        int counter = 1, result = 0 ;
        int i = 0;
        while(i < arrayList.size()-1){
            if ((i+1)<=arrayList.size()) {
                if (arrayList.get(i) < arrayList.get(i + 1)){
                    counter++;
                }else{
                    counter = 0;
                }
            }
            if (result < counter){
                result = counter;

            }

            i++;
        }
        System.out.println("მაქსიმალური ინტერვალის სიგრძე არის: " + result);
    }
}