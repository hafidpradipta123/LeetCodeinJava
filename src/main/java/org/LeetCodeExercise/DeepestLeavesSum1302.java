package org.LeetCodeExercise;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum1302 {
    public int deepestLEavesSum(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level_sum = 0;
        while(!queue.isEmpty()){
            level_sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i ++){
                TreeNode current_node = queue.poll();
                level_sum += current_node.val;
                if(current_node.left != null) queue.offer(current_node.left);
                if(current_node.right != null) queue.offer(current_node.right);

            }
        }
        return level_sum;


    }
}
