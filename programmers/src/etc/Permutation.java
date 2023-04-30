package etc;

import java.util.Arrays;

public class Permutation {

    /**
     * 순열 검사
     * https://school.programmers.co.kr/learn/courses/18/lessons/1877
     */
    public static boolean checkPermutation(int[] arr) {
        // 1. 1부터 n의 길이까지
        // 2. 중복 없이
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++) {
            // idx+1이 곧 1부터 n의 숫자
            if (arr[i] != i+1) return false;
        }
        return true;
    }

}
