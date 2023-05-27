package org.LeetCodeExercise.Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConstructStringfromBInaryTree606 {
    public String tree2str(TreeNode t){
        if (t == null)
            return "";
        TreeNode dummy = new TreeNode(0);
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(t);
        while(!s.isEmpty()){
            TreeNode node = s.pop();
            if (node == dummy){
                sb.append(')');
                continue;
            }
            sb.append('(').append(node.val);
            s.push(dummy);
            if (node.left == null && node.right != null)
                sb.append("()");
            if (node.right != null)
                s.push(node.right);
            if(node.left != null)
                s.push(node.left);
        }
        return sb.substring(1, sb.length() -1);
    }

}
