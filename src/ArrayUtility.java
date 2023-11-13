public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i<array.length;i++){
            result = result+array[i];
        }
        return result;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length;i++){
            sum += array[i];
        }
        double result = (double)sum/(array.length);
        String r = String.valueOf(result);
        if (r.length()>4){
            String rr = r.substring(0,5);
            return Double.parseDouble(rr);
        }return Double.parseDouble(r);
    }

    public static int minimum(int[] array) {
        int minimum = array[0];
        for (int i = 1; i<array.length;i++){
            if (minimum>array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = array[0];
        for (int i = 1; i<array.length;i++){
            if (maximum<array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static int evenCount(int[] array) {
        int result = 0;
        for (int i: array){
            if (i%2==0){
                result++;
            }
        }
        return result;
    }

    public static int[] reverseOne(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i<array.length;i++){
            result[i]=array[array.length-1-i];
        }
        return result;
    }

    public static void reverseTwo(int[] array) {
        if (array.length%2==0){
            for (int i = 0; i<array.length/2;i++){
                int a = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = a;
            }
        }else{
            for (int i = 0; i<(array.length-1)/2;i++){
                int a = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = a;
            }
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i<array.length;i++){
            if (array[i]==num){
                return true;
            }
        } return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String i: array){
            if (i.equals(str)){
                return true;
            }
        }return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i<array.length;i++){
            array[i]=array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i<array.length;i++){
            array[i]=array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i: array){
            result = result + String.valueOf(i)+", ";
        }
        return result.substring(0,result.length()-2);
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i<array.length;i++){
            int d = num-array[i];
            for (int j = i+1; j<array.length;j++){
                if (array[j]==d){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length-1];
        for (int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for (int i = 0; i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 1; i<n+1;i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 1; i<n+1;i++){
            shiftLeft(array);
        }
    }

}
