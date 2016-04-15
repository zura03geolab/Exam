import java.util.Random;

/**
 * Created by Zurab Vashakidze on 15/04/2016.
 */
public class LiarsDice {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println(checkTwoPairCategory(array1));
    }

    private static Boolean checkTwoPairCategory(int[] dice) {
        Random random = new Random();
        int min = 1;
        int max = 6;
        int random1 = random.nextInt((max - min) + 1) + min;
        int random2 = random.nextInt((max - min) + 1) + min;
        int random3 = random.nextInt((max - min) + 1) + min;
        int random4 = random.nextInt((max - min) + 1) + min;
        int random5 = random.nextInt((max - min) + 1) + min;
        int[] array2 = {random1, random2, random3, random4, random5};
        int counter0 = 0, counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0;
        for (int i = 0; i < array2.length; i++) {
            switch (array2[i]) {
                case 0:
                    counter0++;
                    break;
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;

            }
        }
        int[] result = {counter0, counter1, counter2, counter3, counter4, counter5};
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            switch (result[i]) {
                case 2:
                    counter++;
                    break;
            }
        }
        if (counter == 2)
            return true;
        else {
            return false;
        }
    }
}
