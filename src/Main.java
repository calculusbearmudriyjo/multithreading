import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	private static final Integer MAX = 10000;
	public static void main(String[] arg) {
		System.out.println(generateMatrix(10,10));
	}

	private static List<Integer[][]> generateMatrix(Integer row, Integer col) {
		List<Integer[][]> result = new ArrayList<>(2);
		Random random = new Random();
		for(int i = 0; i < 2; i++) {
			Integer[][] matrix = new Integer[row][col];
			for(int j = 0; j < row; j++) {
				for( int k = 0; k < col; k++) {
					matrix[j][k] = MAX + random.nextInt(MAX + 1);
				}
			}
			result.add(matrix);
		}

		return result;
	}
}
