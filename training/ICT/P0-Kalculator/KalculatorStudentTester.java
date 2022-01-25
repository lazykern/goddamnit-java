import java.util.Arrays;

public class KalculatorStudentTester {
	public static final double[][] TEST_CASES = { { 1, 2, 3, 4, 5 },
			{ 345.15, 312.05, 295.83, 615.04, 69.56, 503.49, 749.43, 183.16, 182.57, 235.97, 836.34, 861.94, 285.7,
					701.31, 414.23, 402.71, 74.21, 442.75, 459.11, 404.91, 316.85, 74.98, 75.23, 558.88, 275.02, 164.72,
					649.63, 646.32, 522.59, 119.77, 511.02, 2.74, 886.29, 842.32, 477.86, 173.03, 952.6, 22.82, 46.93,
					308.46, 272.7, 130.69, 571.02, 906.69, 383.53, 269.72, 223.07, 22.34, 684.29, 119.31, 115.39,
					853.67, 534.63, 166.93, 962.78, 617.22, 230.03, 405.11, 221.77, 100.41, 304.45, 972.89, 82.8,
					245.05, 67.19, 227.95, 335.86, 126.91, 852.6, 655.57, 452.68, 175.06, 296.74, 85.48, 43.8, 555.17,
					905.24, 121.54, 119.7, 943.05, 317.27, 22.06, 969, 800.87, 762.9, 846.74, 994.54, 225.32, 792.93,
					88.92, 310.3, 210.52, 330.81, 843.69, 205.59, 214.26, 655.11, 393.64, 812.71, 602.67 },
			{ 345.15 }, {}
	};

	public static final int K = 3;

	public static void test(double[] data, int k) {
		Kalculator ktor = new Kalculator();
		System.out.println("@@@ Loading data:");
		for (int i = 0; i < data.length; i++)
			ktor.addNumber(data[i]);
		ktor.printData();
		System.out.println("@@@ Sum: " + ktor.getSum());
		System.out.println("@@@ Avg: " + ktor.getAvg());
		System.out.println("@@@ Std: " + ktor.getStd());
		System.out.println("@@@ Max: " + ktor.getMax());
		System.out
				.println("@@@ Max " + k + " numbers: " + Arrays.toString(ktor.getMaxK(k)) + " //order does not matter");
		System.out.println("@@@ Min: " + ktor.getMin());
		System.out
				.println("@@@ Min " + k + " numbers: " + Arrays.toString(ktor.getMinK(k)) + " //order does not matter");
		System.out.println("@@@ Removing last number:");
		ktor.deleteLastNumber();
		ktor.printData();
		System.out.println("@@@ Removing first number:");
		ktor.deleteFirstNumber();
		ktor.printData();
	}

	public static void main(String[] args) {
		System.out.println("---- Welkome to Kalculator ----");
		for (int i = 0; i < TEST_CASES.length; i++) {
			System.out.println("@@ ========== TestCase " + (i + 1) + " =========== @@");
			test(TEST_CASES[i], K);
		}
		System.out.println("---- Have a kood day. Bye. ----");
	}

}
