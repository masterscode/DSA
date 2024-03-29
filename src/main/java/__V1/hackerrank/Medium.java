package __V1.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Medium {

    public class Solution {

        static class Plus {
            int x;
            int y;
            int len;
            int size;

            Plus(int x, int y) {
                this.x = x;
                this.y = y;
                this.len = 0;
                this.size = 1;
            }

            Plus(int x, int y, int len, int size) {
                this.x = x;
                this.y = y;
                this.len = len;
                this.size = size;
            }

            void grow() {
                this.len++;
                this.size += 4;
            }

            boolean overlaps(Plus p2, int r, int c) {

                if(this.x != p2.x && this.y == p2.y) {
                    if(p2.x >= this.x - this.len &&
                            p2.x <= this.x + this.len ||
                            p2.x < this.x - this.len &&
                                    p2.x + p2.len >= this.x - this.len ||
                            p2.x > this.x + this.len &&
                                    p2.x - p2.len <= this.x + this.len)
                        return true;
                }

                if(this.y != p2.y && this.x == p2.x) {
                    if(p2.y >= this.y - this.len &&
                            p2.y <= this.y + this.len ||
                            p2.y < this.y - this.len &&
                                    p2.y + p2.len >= this.y - this.len ||
                            p2.y > this.y + this.len &&
                                    p2.y - p2.len <= this.y + this.len)
                        return true;
                }

                boolean[][] grid = new boolean[r][c];

                for(int i = this.x - this.len; i <= this.x + this.len; i++)
                    grid[this.y][i] = true;
                for(int i = this.y - this.len; i <= this.y + this.len; i++)
                    grid[i][this.x] = true;

                for(int i = p2.x - p2.len; i <= p2.x + p2.len; i++) {
                    if(grid[p2.y][i] == true)
                        return true;
                }
                for(int i = p2.y - p2.len; i <= p2.y + p2.len; i++) {
                    if(grid[i][p2.x] == true)
                        return true;
                }
                return false;
            }
        }

        static void findPlus(int x, int y, int r, int c, String[] grid, ArrayList<Plus> list) {
            Plus plus = new Plus(x, y);
            int s = 1;
            while(y-s >= 0 && grid[y-s].charAt(x) != 'B' &&
                    y+s < r && grid[y+s].charAt(x) != 'B' &&
                    x-s >= 0 && grid[y].charAt(x-s) != 'B' &&
                    x+s < c && grid[y].charAt(x+s) != 'B') {
                list.add(new Plus(plus.x, plus.y, plus.len, plus.size));
                plus.grow();
                s++;
            }
            list.add(plus);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            String[] grid = new String[r];
            ArrayList<Plus> list = new ArrayList<Plus>();

            for(int y = 0; y < r; y++) {
                grid[y] = sc.nextLine();
            }

            for(int y = 0; y < r; y++) {
                for(int x = 0; x < c; x++) {
                    if(grid[y].charAt(x) != 'B')
                        findPlus(x, y, r, c, grid, list);
                }
            }

            int max = 0;
            for(int i = 0; i < list.size()-1; i++) {
                Plus p1 = list.get(i);
                for(int j = i+1; j < list.size(); j++) {
                    Plus p2 = list.get(j);
                    int sum = p1.size * p2.size;
                    if(sum > max && !p1.overlaps(p2, r, c)) {
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
