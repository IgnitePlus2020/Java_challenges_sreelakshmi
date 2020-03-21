package com.tgt.igniteplus;

public class Binary_tree {
    public static void main(String[] args) throws Exception {
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode g = new TreeNode("g");
        TreeNode k = new TreeNode("k");
        TreeNode c = new TreeNode("c", d, null);
        TreeNode h = new TreeNode("h", k, null);
        TreeNode b = new TreeNode("b", c, e);
        TreeNode f = new TreeNode("f", g, h);
        TreeNode root = new TreeNode("a", b, f);
        System.out.println("Leaf nodes of binary tree "); printLeaf(root);
    }
    private static class TreeNode {
        String value;
        TreeNode left;
        TreeNode right;
        TreeNode(String value) { this.value = value; }
        TreeNode(String data, TreeNode left, TreeNode right) {
            this.value = data;
            this.left = left;
            this.right = right;}
        boolean isLeaf() { return left == null ? right == null : false; }
    }
    public static void printLeaf(TreeNode node) {
        if (node == null) { return; }
        if (node.isLeaf()) { System.out.printf("%s ", node.value); }
        printLeaf(node.left);
        printLeaf(node.right);
    }
}

