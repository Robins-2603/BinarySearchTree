package com.BinarySearchTree;

/*
 *  Ability to create a BST by adding 56 and then adding 30 & 70
 *   Use INode to create My Binary Node
 *   Note the key has to extend comparable to compare and determine left or right node
 *   First add 56 as root node so 30 will be added to left and 70 to right
 */

public class MainBst {
    public static void main(String[] args) {
        System.out.println("welcome to BTS program");

        BinaryTree bst = new BinaryTree();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56); // 56 is value is adding in root

        root = bst.insert(root, 30);

        // 30->56->70->80
        root = bst.insert(root, 70);

        bst.print(root);

    }
}
