package org.LeetCodeExercise.Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AccountsMerge721 {
    class UnionFind {
        int[] parent;
        int[] weight;

        public UnionFind(int num) {
            parent = new int[num];
            weight = new int[num];

            for (int i = 0; i < num; i++) {
                parent[i] = i;
                weight[i] = i;
            }
        }

        public void union(int a, int b) {
            int rootA = root(a);
            int rootB = root(b);

            if (rootA == rootB) {
                return;
            }

            if (weight[rootA] > weight[rootB]) {
                parent[rootB] = rootA;
                weight[rootA] += weight[rootB];
            } else {
                parent[rootA] = rootB;
                weight[rootB] += weight[rootA];
            }
        }

        public int root(int a) {
            if (parent[a] == a) {
                return a;
            }

            parent[a] = root(parent[a]);
            return parent[a];
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int size = accounts.size();

        UnionFind uf = new UnionFind(size);

        HashMap<String, Integer> emailToId = new HashMap<>();
        for (int i = 0; i < size; i++) {
            List<String> details = accounts.get(i);
            for (int j = 1; j < details.size(); j++) {
                String email = details.get(j);

                if (emailToId.containsKey(email)) {
                    uf.union(i, emailToId.get(email));
                } else {
                    emailToId.put(email, i);
                }
            }
        }

        HashMap<Integer, List<String>> idToEmails = new HashMap<>();
        for (String key : emailToId.keySet()) {
            int root = uf.root(emailToId.get(key));

            if (!idToEmails.containsKey(root)) {
                idToEmails.put(root, new ArrayList<String>());
            }

            idToEmails.get(root).add(key);
        }

        List<List<String>> mergedDetails = new ArrayList<>();
        for (Integer id : idToEmails.keySet()) {
            List<String> emails = idToEmails.get(id);
            Collections.sort(emails);
            emails.add(0, accounts.get(id).get(0));
        }

        return mergedDetails;
    }
}
