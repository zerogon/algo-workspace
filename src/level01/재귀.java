package level01;

public class 재귀 {

	private static int N = 8;
	private static int [][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,1,0,1},
			{0,1,1,1,0,1,0,0}
	};
	public static void main(String[] args) {
		boolean a = findMaze(0,0);
		System.out.println(a);
	}
	// white 0
	// blue 1
	// red 2
	// green 3
	public static int white = 0;
	public static int blue = 1;
	public static int red = 2;
	public static int green = 3;
	
	public static boolean findMaze(int x, int y) {
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		}else if (maze[x][y]!=white) {
			return false;
		}else if (x == N-1 && y == N-1) {
			maze[x][y] = green;
			return true;
		}else {
			maze[x][y] = green;
			if(findMaze(x+1,y) || findMaze(x,y+1)|| findMaze(x-1,y) | findMaze(x,y-1)) {
				return true;
			}
			maze[x][y] = red;
		}
		return false;
	}
	
}
