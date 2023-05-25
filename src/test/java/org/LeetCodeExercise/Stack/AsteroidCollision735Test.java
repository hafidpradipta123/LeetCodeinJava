package org.LeetCodeExercise.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollision735Test {
    @Test
            void asteroidcollision(){
        AsteroidCollision735 formula = new AsteroidCollision735();
        int [] input ={5,10,-5};
        int [] expected = {5,10};
        int [] result = formula.asteroidCollision(input);
        assertArrayEquals(expected,result);

    }




}