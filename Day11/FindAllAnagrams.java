package Day11;

import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(s.length() < p.length())
            return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        for(char ch : p.toCharArray())
            pCount[ch-'a']++;

        int k = p.length();

        for(int i=0;i<s.length();i++){

            window[s.charAt(i)-'a']++;

            if(i>=k)
                window[s.charAt(i-k)-'a']--;

            if(Arrays.equals(window,pCount))
                result.add(i-k+1);
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
}