package org.LeetCodeExercise.Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllPossibleFullBinaryTrees894 {
    public TreeNode clone (TreeNode tree){
        if (null == tree){
            return null;
        }
        TreeNode new_tree = new TreeNode(tree.val);
        new_tree.left = clone(tree.left);
        new_tree.right = clone(tree.right);
        return new_tree;
    }

    public List<TreeNode> allPossibleFBT(int N){
        List<TreeNode> ret = new ArrayList<>();
        if (1 == N){
            ret.add(new TreeNode(0));
        } else if(N % 2 != 0){
            for (int i = 2; i <= N; i+= 2){
                List<TreeNode> left_branch = allPossibleFBT(i -1);
                List<TreeNode> right_branch = allPossibleFBT(N -1);
                for (Iterator<TreeNode> left_iter = left_branch.iterator(); left_iter.hasNext();){
                    TreeNode left = left_iter.next();
                    for (Iterator<TreeNode> right_iter = right_branch.iterator(); right_iter.hasNext();){
                        TreeNode right = right_iter.next();
                        TreeNode tree = new TreeNode();
                        tree.left = right_iter.hasNext() ? clone(left): left;
                        tree.right = left_iter.hasNext() ? clone(right) : right;
                        ret.add(tree);
                    }
                }
            }
        }
        return ret;

    }
}
