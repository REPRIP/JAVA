import java.util.*;

class MergeListUsingGeneric{
    //Generic Method
    public static <T> List<T> mergeList(List<T> List1, List<T> List2){
        List<T> newList = new ArrayList<>(List1);
        newList.addAll(List2);
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1,2,3,4);
        List<Integer> nums2 = List.of(1,2,3,4);

        List<Integer> news = mergeList(nums1, nums2);
        System.out.println(news);

        List<Character> c1 = List.of('a','b');
        List<Character> c2 = List.of('a','b');

        List<Character> c3 = mergeList(c1, c2);
        System.out.println(c3);

    }
}