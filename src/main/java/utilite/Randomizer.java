package utilite;

public class Randomizer {
    public static double generationTime(int min, int max){
        return ((Math.random() * (max - min)) + min);
    }
}
