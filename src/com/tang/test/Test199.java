package com.tang.test;

import java.util.*;

public class Test199 {
    public static void main(String[] args) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode treeNode = new TreeNode(3, null, null);
        //        stack.push(treeNode.right);

        //        System.out.println(stack.poll());
        Stack<Integer> integers = new Stack<>();
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        // 用于存放每一层深度的最右侧的Value值
        Map<Integer, Integer> map = new HashMap<>();
        // 用于存放当前遍历的结点的深度  将当前深度+1压入栈中
        Deque<Integer> stackOfDepth = new LinkedList<>();
        // 用于存放当前遍历的结点  优先把把左侧结点压入栈中
        Deque<TreeNode> stackOfNode = new LinkedList<>();
        int indexOfDepth = -1; // 记录当前的深度的最大值
        // 存放头节点
        stackOfDepth.push(0);
        stackOfNode.push(root);
        // 深度优先遍历
        while (!stackOfNode.isEmpty()) {
            int depth = stackOfDepth.poll();
            TreeNode node = stackOfNode.poll();
            if (node != null) {
                indexOfDepth = Math.max(indexOfDepth, depth);
                if (!map.containsKey(depth)) {
                    map.put(depth, node.val);
                }
                stackOfDepth.push(depth + 1);
                stackOfDepth.push(depth + 1);
                stackOfNode.push(node.left);
                stackOfNode.push(node.right);
            }
        }
        // 取出map值加入到List中并返回
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i <= indexOfDepth; i++) {
            l.add(map.get(i));
        }

        return l;
    }
}
