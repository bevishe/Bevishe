package com.leetcode.linkedList;

import java.util.HashSet;

/**
 * @Classname Demo2_1
 * @Description TODO
 * @Date 2020/6/28 23:48
 * @Created by Administrator
 */
public class Demo2_1 {

    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        ListNode curNode = head,next = head.
        while(curNode != null){
            if(hashSet.contains(curNode.val)){
                // 删除当前节点

            }
        }
    }


    public static void main(String[] args) {

    }
}
