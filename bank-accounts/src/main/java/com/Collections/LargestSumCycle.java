package com.Collections;

import java.util.*;

public class LargestSumCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of cells
        int N = scanner.nextInt();
        
        // Read edges
        int[] edges = new int[N];
        for (int i = 0; i < N; i++) {
            edges[i] = scanner.nextInt();
        }

        // Find and print the largest sum cycle
        System.out.println(findLargestSumCycle(N, edges));
    }

    public static int findLargestSumCycle(int N, int[] edges) {
        boolean[] visited = new boolean[N];
        boolean[] stack = new boolean[N];
        int maxSum = -1;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                int sum = dfs(i, edges, visited, stack, new ArrayList<>());
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    private static int dfs(int node, int[] edges, boolean[] visited, boolean[] stack, List<Integer> path) {
        if (stack[node]) {
            // Found a cycle
            int cycleSum = 0;
            int cycleStart = path.indexOf(node);
            for (int i = cycleStart; i < path.size(); i++) {
                cycleSum += path.get(i);
            }
            return cycleSum;
        }

        if (visited[node]) {
            return -1; // No cycle found
        }

        visited[node] = true;
        stack[node] = true;
        path.add(node);

        int nextNode = edges[node];
        int result = -1;
        if (nextNode != -1) {
            result = dfs(nextNode, edges, visited, stack, path);
        }

        stack[node] = false;
        path.remove(path.size() - 1);
        return result;
    }
}
