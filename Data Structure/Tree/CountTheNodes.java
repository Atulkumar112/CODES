package com.cg.java;

import java.util.*;

public class Practice {
      
  //Defining a tree node with created a nested class
      static class Node{
          int data;
          Node left;
          Node right;
          
          Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
          }
      }
      
      
      static int i=-1;
      public static Node buildTree(int[] arr){
        
        i++;
        if(arr[i] == -1) return null;
        Node newNode = new Node(arr[i]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        
        return newNode;
      }
    
      static int totalNode=0;
      public static int countNodes(Node root) {
    	  if(root == null) {
    		  return 0;
    	  }
    	  /*int leftNodes = countNodes(root.left);
    	  int rightNodes = countNodes(root.right);
    	  return leftNodes + rightNodes + 1;  */
        //--------OR------------
        totalNodes++;
        countNodes(root.left);
    	  countNodes(root.right);
    	  return totalNodes;
      }
    
      // main method
      public static void main(String[] args) {
        /*
              1 
            /   \
          2      3
        /  \      \
      4     5      6
        
        */
      int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      Node root = buildTree(arr);     
      System.out.println("The total nodes are: "+countNodes(root));
  }
}


//-------------------------------------Output------------------
The total nodes are: 6
