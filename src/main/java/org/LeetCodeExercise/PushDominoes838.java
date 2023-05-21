package org.LeetCodeExercise;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PushDominoes838 {
    public String pushDominoes(String dominoes) {
        char[] dom = dominoes.toCharArray();
        List<Map<String, Integer>> q = new ArrayList<>();

        for (int domIndex = 0; domIndex < dom.length; domIndex++) {
            if (dom[domIndex] != '.') {
                Map<String, Integer> domino = new HashMap<>();
                domino.put("index", domIndex);
                domino.put("direction", (int) dom[domIndex]);
                q.add(domino);
            }
        }
        int sec = 0;
        while (sec < q.size()) {
            Map<String, Integer> domino = q.get(sec);
            int domIndex = domino.get("index");
            char domDir = (char) (int) domino.get("direction");

            if (domDir == 'L' && domIndex > 0 && dom[domIndex - 1] == '.') {
                Map<String, Integer> newDomino = new HashMap<>();
                newDomino.put("index", domIndex - 1);
                newDomino.put("direction", (int) 'L');
                q.add(newDomino);
                dom[domIndex - 1] = 'L';
            } else if (domDir == 'R' && domIndex + 1 < dom.length && dom[domIndex + 1] == '.') {
                if (domIndex + 2 < dom.length && dom[domIndex + 2] == 'L') {
                    q.remove(sec);
                } else {
                    Map<String, Integer> newDomino = new HashMap<>();
                    newDomino.put("index", domIndex + 1);
                    newDomino.put("direction", (int) 'R');
                    q.add(newDomino);
                    dom[domIndex + 1] = 'R';
                }
            }
            sec++;
        }
        return new String(dom);
    }
}
