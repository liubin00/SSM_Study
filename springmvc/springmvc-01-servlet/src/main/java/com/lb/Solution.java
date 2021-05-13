package com.lb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/09/18:38
 */


public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sNum = 0;
        int tNum = 0;
        HashSet<Character> sSet = new HashSet<Character>();
        HashSet<Character> tSet = new HashSet<Character>();

        for (char c : s.toCharArray()) {
            if (!sSet.contains(c)) {
                sNum += 1;
                sSet.add(c);
            }
        }

        return sNum == tNum;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(new Solution().isIsomorphic(s, t));
    }
}
