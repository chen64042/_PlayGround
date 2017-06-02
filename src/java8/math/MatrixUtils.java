package java8.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixUtils {
	public static double[][] multiplyMatrices(double[][] m, double[][] n) {
		int mColumns = m[0].length, nRows = n.length;

	    double[][] result = Arrays.stream(m).sequential().map(r ->
	    IntStream.range(0, mColumns).mapToDouble(j ->
            IntStream.range(0, nRows).mapToDouble(i -> { System.out.println("<i, j> = <"+(i+1)+", "+(j+1)+">");
            System.out.println("r["+(i+1)+"] x n["+(j+1)+"]["+(i+1)+"] "+r[i]+" x "+n[j][i]);
            System.out.println("==========================");
            return r[i] * n[j][i]; }).sum()
    ).toArray()).toArray(double[][]::new);

	    return result;
	}

	public static double[] multiplyVector(double[][] m, double[] vector) {
		return null;
	}

	public static double multiplyVectors(double[] v1, double[] v2) {
		return Double.NaN;
	}

	public static double[][] multipyScalar(double[][] m, double scalar) {
		return null;
	}

}
