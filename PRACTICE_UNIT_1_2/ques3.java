public class ques3 {
    public static void main(String[] args) {
        int[] oneDArray = {1,2,3,4,5};
        System.out.println("Length of one dimensional array: " + oneDArray.length);

        System.out.println("Elements of one dimensional array:");
        for (int i = 0;i < oneDArray.length; i++){
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();

        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Length of two-dimensional array (number of rows): " + twoDArray.length);
        System.out.println("Elements of two-dimensional array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] multiDimensionalArray = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
        System.out.println("Length of multi-dimensional array (number of 2D arrays): " + multiDimensionalArray.length);
        System.out.println("Elements of multi-dimensional array:");
        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                for (int k = 0; k < multiDimensionalArray[i][j].length; k++) {
                    System.out.print(multiDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
