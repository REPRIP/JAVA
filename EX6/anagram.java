package EX6;

import java.util.Scanner;

public class anagram {

    public static boolean checkKAnagram(String str1, String str2, int k){
        if (str1.length() != str2.length()){
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++){
            count1[str1.charAt(i) - 'a']++;
            count2[str2.charAt(i) - 'a']++;
        }

        int count = 0; //count of mismatches
        for (int i = 0;i < 26; i++){
            count += Math.abs(count1[i] - count2[i]);
        }

        return count <= 2*k; //total number of mismatches is less than or equal to 2k
    }
    public static void main(String[] args){
        String str1;
        String str2;
        int k;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string 1");
        str1 = scan.nextLine();
        System.out.println("Enter string 2");
        str2 = scan.nextLine();
        System.out.println("Enter value of k");
        k = scan.nextInt();

        if (checkKAnagram(str1,str2,k)){
            System.out.println("Yes, the strings are k-anagrams");
        }
        else{
            System.out.println("No, the strings are not k-anagrams");
        }
        scan.close();
    }
}
