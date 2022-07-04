package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HighestRankedKItems {

    public static class Cell implements Comparable<Cell> {
        int r;
        int c;
        int price;
        int dist;

        public Cell(int r, int c, int p) {
            this.r = r;
            this.c = c;
            this.price = p;
        }

        public void setDistance(int d) {
            this.dist = d;
        }

        public int compareTo(Cell other) {

            if (this.dist != other.dist) {
                return this.dist - other.dist;
            }

            if (this.price != other.price) {
                return this.price - other.price;
            }

            return this.r == other.r ? (this.c - other.c) : this.r - other.r;
        }
    }

    public static int row;
    public static int col;
    public static int minPrice;
    public static int maxPrice;

    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        minPrice = pricing[0];
        maxPrice = pricing[1];
        row = grid.length;
        col = grid[0].length;
        int[][] nextIndexes = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        boolean[] visited = new boolean[row * col];

        Queue<Cell> queue = new LinkedList<>();
        PriorityQueue<Cell> priorityQueue = new PriorityQueue<>();
        visited[start[0] * col + start[1]] = true;
        queue.add(new Cell(start[0], start[1], grid[start[0]][start[1]]));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int l = 0; l < size; l++) {
                Cell curr = queue.poll();
                if (curr.price > 1 && curr.price <= maxPrice && curr.price >= minPrice)
                    priorityQueue.add(curr);

                for (int[] next : nextIndexes) {
                    int nexti = curr.r + next[0];
                    int nextj = curr.c + next[1];

                    if (isValid(nexti, nextj) && grid[nexti][nextj] != 0 && visited[nexti * col + nextj] == false) {
                        Cell nextCell = new Cell(nexti, nextj, grid[nexti][nextj]);
                        nextCell.setDistance(curr.dist + 1);
                        queue.add(nextCell);
                        visited[nexti * col + nextj] = true;
                    }
                }

            }
        }

        LinkedList<List<Integer>> resultList = new LinkedList<>();

        while (!priorityQueue.isEmpty() && k-- > 0) {
            Cell c = priorityQueue.poll();

            resultList.add(Arrays.asList(c.r, c.c));
        }
        return resultList;
    }

    public boolean isValid(int i, int j) {
        return !(i < 0 || j < 0 || i >= row || j >= col);
    }
}
