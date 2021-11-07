package class01;

import java.util.LinkedList;
import java.util.Queue;

public class Qustion06_BFS {

	public static void main(String[] args) {
		int [][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		Solution s1 = new Solution();
		int a  = s1.solution(maps);
		System.out.println(a);
	}

}



class Solution {
	
	class Position{
		int x,y;
		Position (int x , int y){
			this.x = x;
			this.y = y;
		}
		boolean isValid (int width , int height) {
			if(x < 0 || x>=width) return false;
			if(y < 0 || y>=width) return false;
			return true;
		}
		
	}
	/*
	 * [[1,0,1,1,1],
	 *  [1,0,1,0,1],
	 *  [1,0,1,1,1],
	 *  [1,1,1,0,1],
	 *  [0,0,0,0,1]
	 *  ]	11
		[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1
	 * 
	 */
	public int solution (int [][] maps) {
		
		Queue<Position> queue = new LinkedList<>();
		int maxWidth = maps[0].length;
		int maxHeight = maps.length;
		int [][] count = new int [maxHeight][maxWidth];
		boolean[][] isVisited = new boolean[maxHeight][maxWidth];
		
		queue.offer(new Position(0,0));
		count[0][0] = 1;
		isVisited[0][0] = true;
		
		while(!queue.isEmpty()) {
			Position current = queue.poll();
			int currentCount = count[current.y][current.x]; 
			
			final int[][] moving = {{0,-1},{0,1},{-1,0},{1,0}};
			for(int i = 0; i < moving.length; i++) {
				Position moved = new Position (current.x + moving[i][0], current.y + moving[i][1]);
				if(!moved.isValid(maxWidth,maxHeight)) continue;
				if(isVisited[moved.y][moved.x]) continue;
				if(maps[moved.y][moved.x] == 0) continue;
				
				count[moved.y][moved.x] = currentCount + 1;
				isVisited[moved.y][moved.x] = true;
				queue.offer(moved);
			}
			
			/*
			Position moved = new Position (current.x, current.y - 1);
			if(!isVisited[moved.y][moved.x] && maps[moved.y][moved.x] != 0 && !(moved.x < 0 || moved.x >= maxWidth || moved.y < 0 || moved.y >= maxHeight)) {
			}
			moved = new Position (current.x , current.y + 1);
			if(!isVisited[moved.y][moved.x] && maps[moved.y][moved.x] != 0 && !(moved.x < 0 || moved.x >= maxWidth || moved.y < 0 || moved.y >= maxHeight)) {
				count[moved.y][moved.x] = currentCount + 1;
				isVisited[moved.y][moved.x] = true;
				queue.offer(moved);
			}
			moved = new Position (current.x -1 , current.y);
			if(!isVisited[moved.y][moved.x] && maps[moved.y][moved.x] != 0 && !(moved.x < 0 || moved.x >= maxWidth || moved.y < 0 || moved.y >= maxHeight)) {
				count[moved.y][moved.x] = currentCount + 1;
				isVisited[moved.y][moved.x] = true;
				queue.offer(moved);
			}
     		 moved = new Position (current.x + 1, current.y);
			if(!isVisited[moved.y][moved.x] && maps[moved.y][moved.x] != 0 && !(moved.x < 0 || moved.x >= maxWidth || moved.y < 0 || moved.y >= maxHeight)) {
				count[moved.y][moved.x] = currentCount + 1;
				isVisited[moved.y][moved.x] = true;
				queue.offer(moved);
			}
			*/
		}
		int answer = count[maxHeight -1][maxWidth-1];
		if(answer == 0) return -1;
		return answer ;
		
		
		
		
		
	}
	
	
	
	
	
}