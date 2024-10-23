import java.util.*;

public class Genmax <T extends Comparable<T>> {
    private List<T> myList;

    Genmax(List<T> arr){
        this.myList = new ArrayList<>(arr);
    }

    public T maximume(){
        // Use Collections.sort() correctly
        Collections.sort(myList);
        return myList.getLast();
    }

    public static void main(String[] args) {
        List<Integer> arr1 = List.of(1, 2, 4, 77, 54, 3);
        List<String> arr2 = List.of("cat", "dog", "meow", "bow");

        Genmax<Integer> myObj1 = new Genmax<>(arr1);
        Genmax<String> myObj2 = new Genmax<>(arr2);

        System.out.println(myObj1.maximume());
        System.out.println(myObj2.maximume());
    }
}

/*
 import java.util.*;

public class Genmax{
    //Genreic Method
    //Applying generic template to only a method of class
    //not whole class
    //Static method no need to create object while calling
    public static <T extends Comparable<T>> T findMax(T[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static <T extends Comparable<T>> T findMin(T[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,4,77,54,3};
        String[] arr2 = {"cat","dog","meow","bow"};

        System.out.println(findMax(arr1));
        System.out.println(findMin(arr2));
    }
}
*/