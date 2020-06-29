package com.leetcode;

/**
 * @Classname Demo10
 * @Description TODO
 * @Date 2020/6/8 22:25
 * @Created by Administrator
 */
public class Demo10 {


    // 正则表达式匹配
    public boolean isMatch(String s, String p) {
        boolean re = false;

        return re;
    }

    public void dfs(String s,int startIndex,char[] pArray,StringBuilder curString,boolean re,int curIndex){
        if(s.equals(curString.toString())){
            re = true;
            return;
        }
        for (int i = startIndex; i < pArray.length; ) {
            if(pArray[i] == '.'){
                curString.append(pArray[curIndex]);
                dfs(s,i+1,pArray,curString,re,curIndex+1);
                curString.deleteCharAt(curString.length()-1);
            }else if(pArray[i] >= 'a' && pArray[i] <= 'z'){
                if(pArray[i] == s.charAt(curIndex)){
                    curString.append(pArray[i]);
                    dfs(s,i+1,pArray,curString,re,curIndex+1);
                    curString.deleteCharAt(curString.length()-1);
                }else return;
            }else{
                if(i <= 0){ //星号是第一个
                    break;
                }else{
                    if(pArray[i - 1] == '.'){  // * 前面是.

                    }else{// * 前面是字母

                    }
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
