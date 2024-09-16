public class ques7 {

    public static class Pair {
        private int min;
        private int max;

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }

    public static Pair MinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return new Pair(min, max);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Pair pair = MinMax(array);
        System.out.println("Min: " + pair.getMin());
        System.out.println("Max: " + pair.getMax());
    }
}
