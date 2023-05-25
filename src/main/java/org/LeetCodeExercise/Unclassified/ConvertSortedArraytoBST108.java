package org.LeetCodeExercise.Unclassified;

public class ConvertSortedArraytoBST108 {
    public TreeNode sortedArraytoBST(int[] nums)
    {
        if (nums.length == 0) return null;
        return constructTreeFromArray(nums, 0, nums.length -1);
    }
    public TreeNode constructTreeFromArray(int [] nums, int left, int right){
        if (left > right) return null;
        int midpoint = left + (right - left) /2; // watchout of integer overflow
        TreeNode node= new TreeNode(nums[midpoint]);
        node.left = constructTreeFromArray(nums, left, midpoint-1);
        node.right = constructTreeFromArray(nums, midpoint + 1, right);

        return node;


    }
}
