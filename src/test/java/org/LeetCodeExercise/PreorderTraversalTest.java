package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {

    @Test
    void preorder() {
        // Construct the input tree

    }
    @Test
    void preorder2() {
        // Construct the input tree
            Node root = new Node(1, Arrays.asList(
                    null,
                    new Node(2, Arrays.asList(
                            new Node(3, Arrays.asList(
                                    new Node(6, null)
                            )),
                            new Node(4, Arrays.asList(
                                    new Node(7, null),
                                    new Node(8, Arrays.asList(
                                            new Node(11, Arrays.asList(
                                                    new Node(14, null)
                                            ))
                                    ))
                            ))
                    )),
                    new Node(5, Arrays.asList(
                            new Node(9, null),
                            new Node(10, Arrays.asList(
                                    new Node(12, null),
                                    new Node(13, null)
                            ))
                    ))
            ));


        // Create the expected output
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 4, 7, 8, 11, 14, 5, 9, 10, 12, 13);

        PreorderTraversal144 solution = new PreorderTraversal144();
        List<Integer> result = solution.preorder(root);

        assertEquals(expected, result);

    }
}