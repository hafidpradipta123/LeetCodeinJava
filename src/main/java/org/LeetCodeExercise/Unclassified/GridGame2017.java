package org.LeetCodeExercise.Unclassified;

import java.util.Arrays;

public class GridGame2017 {
    public long gridGame(int [][] g){
        long  top = Arrays.stream(g[0]).asLongStream().sum() ;
        long bottom = 0;
        long res = Long.MAX_VALUE;
        for (int i = 0; i < g[0].length; ++i) {
            top -= g[0][1];
            res = Math.min(res, Math.max(top, bottom));
            bottom += g[1][i];
        }
        return res;
    }

}
