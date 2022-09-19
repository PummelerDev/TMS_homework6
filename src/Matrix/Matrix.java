package Matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
	public Matrix() {
	}

	public Matrix(int n, int k) {
		this.n = n;
		this.k = k;
		this.content = new int[n][k];
		init();
	}

	int[][] content;
	int n;
	int k;

	private void init() {
		Random random = new Random();
		for (int i = 0; i < content.length; i++) {
			for (int j = 0; j < content[i].length; j++) {
				content[i][j] = random.nextInt(10);
			}
		}

	}

	public void printMatrix() {
		System.out.println(Arrays.deepToString(this.content));
	}

	public Matrix plus(Matrix matrix) {
		int[][] temp = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				temp[i][j] = this.content[i][j] + matrix.content[i][j];
			}
		}
		Matrix matrix1 = new Matrix();
		matrix1.content = temp;
		matrix1.k = k;
		matrix1.n = n;
		return matrix1;
	}

	public Matrix multiplyByNumber(int number) {
		int[][] temp = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				temp[i][j] = this.content[i][j] * number;
			}
		}
		Matrix matrix1 = new Matrix();
		matrix1.content = temp;
		matrix1.k = k;
		matrix1.n = n;
		return matrix1;
	}

	public Matrix multiply(Matrix matrix) {
		int[][] temp = new int[n][k];
		for (int v = 0; v < this.content.length; v++) {
			for (int i = 0; i < this.content.length; i++) {
				for (int j = 0; j < matrix.content[i].length; j++) {
					temp[v][i] += this.content[v][j] * matrix.content[j][i];
				}
			}
		}
		Matrix matrix1 = new Matrix();
		matrix1.content = temp;
		matrix1.k = k;
		matrix1.n = n;
		return matrix1;
	}

}
