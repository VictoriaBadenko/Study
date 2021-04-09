package Task5;

public class MinMax {
    public static void main(String[] args) {
        int array[] = new int[]{ 87, 2, 120};

        int max = getMax(array);
        System.out.println("Max Value is: "+max);

        int min = getMin(array);
        System.out.println("Min Value is: "+min);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
