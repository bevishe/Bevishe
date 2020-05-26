package com.leetcode.tree;

import sun.dc.path.PathError;

public class Demo572 {


    public boolean isSubtree(TreeNode s,TreeNode t){
        // s，t都是非空的树
        // 检验t是否是s的一棵子树
        /*
        * 1.前序遍历+判断
        * 2.判断（+递归 从下往上遍历）
        * 因为里面存储数据不是唯一的，
        * */



        if(t == null) return true;
        if(s == null) return false;
        return isSubtree(s.left,t) || isSubtree(s.right,t) || check(s,t);
    }

    public boolean check(TreeNode root1,TreeNode root2){
         if((root1 == null && root2 == null) || (root1 != null && root2 == null)) return true;
         else if(root1 == null && root2 != null) return false;
         else{
             if(root1.val != root2.val) return false;
             if(root2.left != null && root2.right != null) return check(root1.left,root2.left) && check(root1.right,root2.right);
             else if(root2.left == null) return check(root1.right,root2.right);
             else return check(root1.left,root2.left);
         }
    }

    public void method(char[] chars){
        chars[0] = 'a';
    }


    public void change(Person person){
        person.setName("bevis");

        System.out.println("chage 中的name为："+person.getName());
    }

    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(3);
//        root1.left = new TreeNode(4);
//        root1.right = new TreeNode(5);
//        root1.left.left = new TreeNode(1);
//        root1.left.right = new TreeNode(2);
//
//        TreeNode root2 = new TreeNode(4);
//
//        Demo572 demo572 = new Demo572();
////      boolean subtree = demo572.isSubtree(root1, root2);
////      System.out.println(subtree);
//
//
//        char[] a= new char[1];
//        System.out.println(a[0]);
//        demo572.method(a);
//        System.out.println(a[0]);


        Demo572 demo572 = new Demo572();
        String s = "hello";
        Person p= new Person("hepeng");
        System.out.println("change之前的name是："+p.getName()+"--s是："+s);
        demo572.change(p);
        System.out.println("change之后的name是："+p.getName()+"--s是："+s);

    }


}


class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Person(){

    }

    Person(String name){
        this.name = name;
    }



}
