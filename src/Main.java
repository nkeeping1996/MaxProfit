public class Main {
    public static void main(String[] args) {
        int[] a = {230, 300, 150, 720, 139, 111, 120};
        int profit = maxProfit(a);
        System.out.println("This returns a profit of " + profit + "." );
    }

    public static int maxProfit(int[] a){
        int max = a[0];
        int maxIndex = 0;
        int min = a[0];
        int minIndex = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
                maxIndex = i;
            }
        }

        for(int j = 0; j<a.length; j++){
            if(a[j] < min){
                min = a[j];
                minIndex = j;
            }
        }
        minIndex++;
        maxIndex++;
        System.out.println("The min price in the array is " + min + ", on day " + minIndex + ".");
        System.out.println("The max price in the array is " + max + ", on day " + maxIndex + ".");
        System.out.println("Therefore, you should buy on day " + minIndex + ", and sell on day " + maxIndex + ".");
        return max-min;
    }
}