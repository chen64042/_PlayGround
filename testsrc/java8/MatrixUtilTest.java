package java8;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import java8.math.MathUtils;
import junit.framework.TestCase;

public class MatrixUtilTest extends TestCase {
    private int mRows = 50, mColumns = 20;
    private int nRows = 20, nColumns = 40;
    private int kRows = 10, kColumns = 100000;
    private double[][] m = null, n = null;
    private double[] k = null;

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testParallel() {
		k = new double[kColumns];

	    DoubleStream is = IntStream.range(0, kColumns).mapToDouble(i->{ k[i] = (long)MathUtils.scaleRandom(100, 3); return k[i]; });
	}

	public void testSequential() {
		k = new double[kColumns];

		DoubleStream is = IntStream.range(0, kColumns).mapToDouble(i->{ k[i] = (long)MathUtils.scaleRandom(100, 3); return k[i]; });
	}

	public void testMultiplyMatrix() {

	}

}
