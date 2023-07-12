import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class First {

    public static void main(String[] args) {
        ArrayList<Integer> newRndArr = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int rndNum = ThreadLocalRandom.current().nextInt(0, 24);
            newRndArr.add(rndNum);
        }
        System.out.println(newRndArr.toString());
    }
}