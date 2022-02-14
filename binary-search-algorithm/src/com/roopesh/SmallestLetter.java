package com.roopesh;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'e', 'g', 'r'};
        char ans = greatestLetter(letters, 's');
        System.out.println(ans);
    }
    static char greatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;

        while(start < end) {
            mid = start + (end - start) / 2;
            if(target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
//        if(start == letters.length){
//            return letters[0];
//        }
//        return letters[0];
    }
}
