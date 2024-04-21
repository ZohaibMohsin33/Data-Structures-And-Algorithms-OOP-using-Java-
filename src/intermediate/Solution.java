package intermediate;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {

    class Node{
        int first;
        int second;

        Node(int first,int second){
            this.first = first;
            this.second = second;
        }
    }

    public void display(int[][] land){
        ArrayList<int[]> sol = findFarmland(land);

        for(int i = 0; i<sol.size(); i++){
            System.out.println(Arrays.toString(sol.get(i)));

        }

    }
    public ArrayList<int[]> findFarmland(int[][] land) {

        ArrayList<int[]> list = new ArrayList();
        boolean[][] visited = new boolean[land.length][land[0].length];
        for(int i = 0; i<land.length; i++){
            for(int j = 0; j<land[0].length; j++){
                if(land[i][j] == 1 && !visited[i][j]){
                    int[] arr = new int[4];
                    arr[0] = i;
                    arr[1] = j;
                    Node taken = send(land,visited,i,j,new Node(i,j));
                    arr[2] = taken.first;
                    arr[3] = taken.second;
                    list.add(arr);
                }
            }
        }
        return list;
    }

    public Node send(int[][] land,boolean[][] visited, int r, int c, Node prev){
        if(r>=land.length || c>=land[0].length){
            return prev;
        }

        visited[r][c] = true;

        if(land[r][c] == 0)
            return prev;

        Node left  = send(land,visited,r+1,c,new Node(r,c));
        Node right = send(land,visited,r,c+1,new Node(r,c));

        if(left.first == right.first){
            return left.second > right.second ? left:right;
        }

        return left.first>right.first ? left:right;

    }
}
