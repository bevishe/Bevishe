package com.leetcode.coderAlgo;

public class Demo6 {

    /*
    * 字符串压缩：
    * 因为返回的字符串是变化的，所以我们来采用StringBuilder来存储结果，最后在和原字符串的长度来做比较
    * */
    public String compressString(String S) {
        if(S == null || S.length() == 0 || S.length() == 1) return S;
        StringBuilder res = new StringBuilder();
        int curIndex = 1,preChar = S.charAt(0),preCharCount = 1;
        // 判断当前索引下的字符是否和前面的相同
        for (; curIndex < S.length();) {
            while(curIndex<S.length() && S.charAt(curIndex) == preChar){
                curIndex++;
                preCharCount ++ ;
            }
            res.append(String.valueOf((char)preChar)+String.valueOf(preCharCount));

            // 重置
            if(curIndex < S.length()){
                preChar = S.charAt(curIndex);
                preCharCount = 1;
                curIndex ++;
            }
        }
        if(preCharCount == 1) res.append(String.valueOf((char)preChar)+"1");
        return res.length() < S.length() ? res.toString() : S;
    }

    public String extMethod(String S){
        if(S == null|| S.length() == 0 || S.length() == 1) return S;
        // S使用滑动窗口，双指针来做
        StringBuilder res = new StringBuilder();
        int firstIndxe = 0,secIndex = 0;
        while(secIndex<S.length()){
            while(secIndex+1<S.length() && S.charAt(secIndex+1) == S.charAt(firstIndxe)) secIndex++;
            res.append(String.valueOf((char)S.charAt(firstIndxe))+(secIndex-firstIndxe+1));
            firstIndxe = secIndex+1;
            secIndex ++;
        }
        return res.length() < S.length() ? res.toString() : S;
    }

    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        System.out.println(demo6.compressString("bbbac"));
    }
}
