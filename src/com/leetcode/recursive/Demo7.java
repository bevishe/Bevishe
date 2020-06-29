package com.leetcode.recursive;

public class Demo7 {


    // 根据中序序列和前序序列来重建二叉树
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        build(root,preorder,inorder);
        return root;
    }

    public void build(TreeNode root,int[] preorder,int[] inorder){
        int index = 0,lIndex = 0,rIndex = inorder.length -1;
        while(inorder[index] != preorder[0]) index++;
        int leftLength = index - lIndex ,rightLenght = rIndex - index;
        int[] leftArray = new int[leftLength],rightArray = new int[rightLenght],leftInOrder = new int[leftLength],rightInOrder = new int[rightLenght];
        if(index - lIndex == 0){
            root.left = null;
        }else{
            for (int i = 0; i < leftArray.length; i++) {
                leftArray[i] = preorder[1+i];
                leftInOrder[i] = inorder[i];
            }
            root.left = new TreeNode(leftArray[0]);
            build(root.left,leftArray,leftInOrder);
        }

        if(rIndex - index == 0){
            root.right = null;
        }else{
            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = preorder[1 + leftLength +i];
                rightInOrder[i] = inorder[1+leftLength +i];
            }
            root.right = new TreeNode(rightArray[0]);
            build(root.right,rightArray,rightInOrder);
        }
    }


    /*
    * 此种方法的时间复杂度太高，主要是在数组的复制上面，能否通过传递数组的下标来，而不用直接传递数组
    *
    * */


    public void dfs(TreeNode root,int[] preorder,int preStart,int preEnd,
                    int[] inorder,int inStart,int inEnd){
        // 1.找到根节点在中序数组中的位置
        int index = inStart;
        while(inorder[index] != preorder[preStart]) index++;
        // 2.找左右子树的节点数
        int leftLength = index - inStart,rightLength = inEnd - index;
        if(leftLength == 0){
            root.left = null;
        }else{
            root.left = new TreeNode(preorder[preStart+1]);
            dfs(root.left,preorder,preStart+1,preStart+leftLength,inorder,index - leftLength,index-1);
        }

        if(rightLength == 0){
            root.right = null;
        }else{
            root.right = new TreeNode(preorder[preStart+leftLength+1]);
            dfs(root.right,preorder,preStart+leftLength,preStart+leftLength+rightLength,inorder,index+1,index+rightLength);
        }
    }

    public static void main(String[] args) {

    }
}
