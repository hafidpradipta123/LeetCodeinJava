package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenThatCanAttacktheKing1222Test {

    @Test
    void queensAttacktheKing() {
        QueenThatCanAttacktheKing1222 queenattack = new QueenThatCanAttacktheKing1222();
        int [][] queens = {{0,0}, {1,1}, {2,2}, {3,4}, {3,5}, {4,4},{4,5}};
        int[] king = {3,3};
        List<List<Integer>> actual = queenattack.queensAttacktheKing(queens, king);
        List<List<Integer>> expected = List.of(List.of(2, 2), List.of(3, 4), List.of(4, 4));
        assertEquals(expected, actual);



    }
}