package org.LeetCodeExercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall554 {
    public int leastBrick(List<List<Integer>> wall){
        Map<Integer, Integer> map = new HashMap<>();
        int maxGaps = 0;

        for (List<Integer> row: wall){
            int pos = 0;
            for (int i = 0; i< row.size()-1; i++){
                pos += row.get(i);
                map.put(pos, map.getOrDefault(pos,0 )+1);
                maxGaps= Math.max(maxGaps, map.get(pos));
            }

        }

        return wall.size() - maxGaps;
    }
}
