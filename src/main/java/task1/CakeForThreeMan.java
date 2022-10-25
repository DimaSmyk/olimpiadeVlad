package task1;

import utilite.Randomizer;
import utilite.Rounder;

public class CakeForThreeMan {
    private static final int max = 100001;
    private static final int min = 0;
    public static void main(String[] args) {
        double firstTime = Randomizer.generationTime(min, max);
        double secondTime = Randomizer.generationTime(min, max);
        double thirdTime = Randomizer.generationTime(min, max);
        System.out.println(Rounder.roundValue(middleAverage(firstTime, secondTime, thirdTime)));
    }
    private static double middleAverage(double firstTime, double secondTime, double thirdTime){
        return (firstTime + secondTime + thirdTime) / 3;
    }
}
