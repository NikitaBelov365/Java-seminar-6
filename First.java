import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class First {
    public static float Check_Unic(ArrayList<Integer> newRndArr) {
        Set<Integer> setic = new HashSet<>(newRndArr);
        float a = (float)setic.size() * 100 / (float)newRndArr.size();
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> newRndArr = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int rndNum = ThreadLocalRandom.current().nextInt(0, 24);
            newRndArr.add(rndNum);
        }
        System.out.println(Check_Unic(newRndArr));
    }
}