package com.kunyao.arithmetic;

import java.util.Stack;

/**
 * 二叉树的按层打印与ZigZag打印
 */

public class ZigZag {

    private static class TreeNode<T>{
        T data;
        TreeNode left;
        TreeNode right;

        public TreeNode(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public static void printZigzag(TreeNode<Integer> biaryTreeNode){
        if(biaryTreeNode==null){
            return;
        }
        Stack<TreeNode> cur = new Stack<TreeNode>();
        Stack<TreeNode> next = new Stack<TreeNode>();
        boolean isleft = true;
        cur.push(biaryTreeNode);
        while(!cur.isEmpty()){
            TreeNode parentNode = cur.pop();
            System.out.print(parentNode);
            if(isleft) {
                if (parentNode.left != null) {

                    next.push(parentNode.left);
                }
                if (parentNode.right != null) {

                    next.push(parentNode.right);
                }
            }else{
                if (parentNode.right != null) {
                    next.push(parentNode.right);
                }
                if (parentNode.left != null) {

                    next.push(parentNode.left);
                }
            }

            if(cur.isEmpty()&& !next.isEmpty()){
                isleft=!isleft;
                System.out.println();
                Stack<TreeNode> tmp = cur;
                cur = next;
                next = tmp;
            }
        }


    }

    public static void main(String[] args){
        TreeNode<Integer> biaryTreeNode = new TreeNode<>(1);
        TreeNode<Integer> tem1 = new TreeNode<>(3);
        TreeNode<Integer> tem2 = new TreeNode<>(2);
        biaryTreeNode.left = tem1;
        biaryTreeNode.right = tem2;
        TreeNode<Integer> tem11 = new TreeNode<>(6);
        TreeNode<Integer> tem12 = new TreeNode<>(8);
        TreeNode<Integer> tem21 = new TreeNode<>(9);
        TreeNode<Integer> tem22 = new TreeNode<>(5);
        tem1.left = tem11;
        tem1.right = tem12;
        tem2.left = tem21;
        tem2.right = tem22;
        printZigzag(biaryTreeNode);
    }




}
