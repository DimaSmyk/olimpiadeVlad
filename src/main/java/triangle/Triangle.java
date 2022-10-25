package triangle;

import utilite.Randomizer;

public class Triangle {
    private static final int max = 100001;
    private static final int min = 0;
    public static void main(String[] args) {
        double x = 1;
        double resultForYCoordinate = 1;
        double resultForXCoordinate;
        int numberOfTriangle = (int) Randomizer.generationTime(min,max);
        for(int i = 1; i < numberOfTriangle; i++){
            resultForYCoordinate = resultForYCoordinate  + 2;
            x = x + resultForYCoordinate;
        }
        resultForXCoordinate = x - resultForYCoordinate/2;
        System.out.println(resultForXCoordinate);
        System.out.println("X = " + validateValue(resultForXCoordinate));
        System.out.println("Y = " + resultForYCoordinate);

    }

    private static String validateValue(double value){
        String number = String.valueOf(value);
        StringBuilder stringBuffer = new StringBuilder(number);
        for(int i = 0; i <= number.length(); i++){
            if(number.charAt(i) == '.'){
                stringBuffer.deleteCharAt(1).insert(number.length() - 4, '.').delete(
                        number.length() - 2, number.length());
                return stringBuffer.toString();
            }
        }
        return number;
    }
}
