package org.LeetCodeExercise.Trees;

import java.util.LinkedList;
import java.util.List;

public class BinaryPreorderTarversalRecursive1_144 {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> pre = new LinkedList<>();
        if (root == null) return pre;
        pre.add(root.val);
        pre.addAll(preorderTraversal(root.left));
        pre.addAll(preorderTraversal(root.right));
        return pre;


    }
}
