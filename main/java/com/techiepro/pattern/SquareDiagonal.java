package com.techiepro.pattern;

public class SquareDiagonal {

  public static void main(String[] args) {
	int k = 10;

	String[][] res = new String[k][k];

	for (int x = 0; x < k; x++) {
	  res[0][x] = "*";
	}

	for (int y = 0; y < k; y++) {
	  res[y][0] = "*";
	}

	for (int u = 0; u < k; u++) {
	  res[k - 1][u] = "*";
	}

	for (int v = 0; v < k; v++) {
	  res[v][k - 1] = "*";
	}

	for (int i = 0, j = 0; i < k; i++) {
	  j = i;
	  res[i][j] = "*";
	}

	for(int i = 0, j = k-1;j>0;i++,j--){
		res[i][j] = "*";
  	}

	for(int i = 0;i<k;i++) {
	  for (int j = 0; j < k; j++) {
		if (res[i][j] == null) res[i][j] = " ";
		System.out.print(res[i][j] + " ");
	  }
	  System.out.println();
	}
}
}
