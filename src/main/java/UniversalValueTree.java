package Interview_samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 This problem was asked by Google.

 A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

 Given the root to a binary tree, count the number of unival subtrees.

 For example, the following tree has 5 unival subtrees:

 0
 / \
 1   0
 / \
 1   0
 / \
 1   1

 */

/*
Univals: The node with certain value x has same value as x for both the childs called univals(universal nodes), and also the node with no childs also counted as univals.

My Approach: step1: First construct an array from an given tree, which represents the tree with roots and childs nodes.

             step2:
*/

public class UniversalValueTree {
   static int[] treeArray = new int[10];
    // @counter to count the number of unival nodes
   static int counter;
   static List<Integer> rootPositionsLists = new ArrayList<Integer>();
    public static void main(String[] args){
             int root = 0;
             UniversalValueTree obj = new UniversalValueTree();
             obj.setTreeValues(root,0,1,0);
             // Store the position of the root nodes such that they can be used to verify the univals of that respective node and also its child nodes if any.
              rootPositionsLists.add(root);
             // update the root value as per the tree requirement
              root = root + 2;
             obj.setTreeValues(root,0,1,0);
              rootPositionsLists.add(root);
             // update the root value as per the tree requirement
             root = root + 1;
             obj.setTreeValues(root,1,1,1);
              rootPositionsLists.add(root);
             //System.out.println(Arrays.toString(treeArray));
             //calling the checkUnivalnode method to count the number of unival nodes
             obj.checkUnivalnode(rootPositionsLists);
             System.out.println(counter);

    }

public void setTreeValues(int rootPosition, int rootValue, int Lchild, int Rchild){
    treeArray[rootPosition] = rootValue;
    treeArray[2*rootPosition +1] = Lchild;
    treeArray[2*rootPosition+2] = Rchild;

}
/*
Check whether the nodes in the list unival or not and also verify their child nodes.
 */

public void checkUnivalnode(List<Integer> rootPositionsLists){

        for(int i=0;i<rootPositionsLists.size();i++) {
            int currentRootNode=rootPositionsLists.get(i);
            /*
             Check if the node has parent
           */
            if(currentRootNode>0){

              //when node has a parent, then compare the value of the parent node with current node and another child if exists
              if((treeArray[currentRootNode]==treeArray[(int)(currentRootNode-1)/2])&&(treeArray[currentRootNode]==treeArray[(int)(currentRootNode-2)/2])){
              //This indicates the node as unival
                  counter= counter+1;
              }
                 //Now compare the currentRootnode value with its child nodes. if they are same then increase the counter.
                //if the node has no child nodes i.e alone then increase the counter
              if(((2*currentRootNode+2)<treeArray.length)&&((2*currentRootNode+1)<=treeArray.length)){
               //this condition checks whether the array consists of any values at certain index.
               //the below condition checks if the child nodes are equal to the parent nodes
                  if((treeArray[currentRootNode]==treeArray[(2*currentRootNode)+1])&&treeArray[currentRootNode]==treeArray[(2*currentRootNode)+2]){
                      counter=counter+1;
                  }
              }
              else{
                  //this represents the current root node has no childs
                  //so the current root node can be considered as unival node
                  counter= counter+1;
              }
            }
        }
}

}