package org.LeetCodeExercise.Trees;

import java.util.LinkedList;
import java.util.List;

public class BinaryPreorderTarversalRecursive2_144 {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> pre = new LinkedList<Integer>();
        preHelper(root, pre);
        return pre;
    }
    public void preHelper(TreeNode root, List<Integer> pre){
        if (root == null) return;
        pre.add(root.val);
        preHelper(root.left,pre);
        preHelper(root.right,pre);
    }

}
