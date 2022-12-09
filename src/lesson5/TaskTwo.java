package lesson5;

import java.util.*;

//public class TaskTwo {
//    public static void main(String[] args) {
//        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
//        String[] words2 = new String[]{"amazing", "leetcode", "is"};
//
//        System.out.println(countWords(words1, words2));
//        System.out.println((count(words1)));
//    }
//
//    public static int countWords(String[] words1, String[] words2) {
//        if (words1.length > words2.length) {
//            return countWords(words2, words1);
//        }
//        int answer = 0;
//        for (String word : words1) {
//            if (count(words1).getOrDefault(word, 0) == 1
//                    && count(words2).getOrDefault(word, 0) == 1) {
//                answer += 1;
//            }
//        }
//        return answer;
//    }
//
//    private static Map<String, Integer> count(String[] words) {
//        Map<String, Integer> count = new HashMap<>();
//        for (String word : words) {
//            count.put(word, count.getOrDefault(word, 0) + 1);
//        }
//        return count;
//    }
//}
