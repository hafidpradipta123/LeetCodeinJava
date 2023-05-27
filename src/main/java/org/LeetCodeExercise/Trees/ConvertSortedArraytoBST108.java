package org.LeetCodeExercise.Trees;

public class ConvertSortedArraytoBST108  {
    public TreeNode sortedArrayToBST(int [] nums){
        return CreateBST(nums,0, nums.length -1);

    }
    private TreeNode CreateBST(int nums[], int l, int r ){
        if (l > r){ // Base Condition or Recursion Stoping Condition
            return null;
        }
        int mid = (l + r)/ 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = CreateBST(nums, l, mid -1);
        root.right = CreateBST(nums, mid + 1, r);
        return root;
    }

}

