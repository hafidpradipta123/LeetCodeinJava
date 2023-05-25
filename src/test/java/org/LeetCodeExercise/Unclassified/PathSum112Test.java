package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.PathSum112;
import org.LeetCodeExercise.Unclassified.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSum112Test {

    @Test
    void testhasPathSum() {

            // Create the tree
            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(4);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(11);
            root.left.left.left = new TreeNode(7);
            root.left.left.right = new TreeNode(2);
            root.right.left = new TreeNode(13);
            root.right.right = new TreeNode(4);
            root.right.right.right = new TreeNode(1);

            // Test cases
            PathSum112 pathSum = new PathSum112();
            assertTrue(pathSum.hasPathSum(root, 22));
            assertFalse(pathSum.hasPathSum(root, 23));
            assertTrue(pathSum.hasPathSum(root, 18));
            assertFalse(pathSum.hasPathSum(root, 100));
        }
    }