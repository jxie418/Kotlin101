package learning.bfs;

import java.util.*;

public class Solution {
    public int minimumSemesters(int n, List<List<Integer>> relations) {
        List<Integer> next[] = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            next[i] = new ArrayList<Integer>();
        }

        int inDegree[] = new int[n + 1];
        for (List<Integer> list : relations) {
            next[list.get(0)].add(list.get(1));
            inDegree[list.get(1)] += 1;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                count += 1;
                q.offer(i);
            }
        }
        int step = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            step += 1;
            for (int i = 0; i < len; i++) {
                int cur = q.poll();
                for (Integer t : next[cur]) {
                    inDegree[t] -= 1;
                    if (inDegree[t] == 0) {
                        q.offer(t);
                        count++;
                    }
                }
            }

        }

        if (count != n)
            return -1;
        else
            return step;
    }
}
