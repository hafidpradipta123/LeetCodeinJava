package org.LeetCodeExercise.Stack;

import org.LeetCodeExercise.Unclassified.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFleet853Test {

    @Test
    void carFleet() {
        CarFleet853 formula = new CarFleet853();
        int target = 12;
        int [] position ={10,8,0,5,3};
        int [] speed = {2,4,1,1,3};
        int result = formula.carFleet(target, position, speed);
        assertEquals(3, result);

    }
}