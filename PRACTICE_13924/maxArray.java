public class maxArray {
    public static int findmaximum(int[] a, int n){
        if (n == 1){
            return a[0];
        }
        else{
            int maxi = findmaximum(a, n-1);
            return Math.max(maxi, a[n-1]);
        }
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 50, 40, 40};
        int n = a.length;
        int maximum = findmaximum(a, n);
        System.out.println("Maximum element in the array: " + maximum);
    }
}
