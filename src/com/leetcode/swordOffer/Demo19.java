package com.leetcode.swordOffer;


/**
 * @Classname Demo19
 * @Description TODO
 * @Date 2020/3/17 17:47
 * @Created by Administrator
 */

public class Demo19 {


    // 使用回溯法
    public void back(String s,String addString){
        curString.append(addString);
    }

    private static StringBuilder curString = new StringBuilder();

    public boolean isMatch(String s,String p){
        StringBuilder curString = new StringBuilder();
        for (int i = 0; i < p.length() - 1; i++) {
            if(p.charAt(i) == '.'){
                if(p.charAt(i+1) == '*'){
                    // 在这里使用回溯的思想，看前面的字母是使用0还是1 2 3次数


                }else{
                    if(p.charAt(i+1) != s.charAt(i+1)) return false;
                    else curString.append(s.charAt(i)).append(s.charAt(i+1));
                }
            }else{
                if(p.charAt(i+1)=='*'){



                }else if(p.charAt(i+1) == '.'){
                    if(p.charAt(i) != s.charAt(i)) return false;
                    else{
                        curString.append(s.charAt(i)).append(s.charAt(i+1));
                    }
                }else{

                }
            }
        }
        return true;
    }



    public static void main(String[] args) {


        String s = "hello";

        System.out.println(s.charAt(1));

    }

}
