import static java.lang.Math.*;
import java.util.ArrayList;

/*
 * This class adds more Math functions,
 * extending the existing Math library.
 *
 * @author zephyres
 * @version 1.0 July 4, 2015
 */

public class ExtendedMath {

	/*
	 * This method finds the real roots of
	 * a quadratic function of the form
	 * y = ax^2 + bx + c
	 *
	 * @param a Coefficient of x^2 of standard form quadratic equation
	 * @param b Coefficient of x of standard form quadratic equation
	 * @param c Constant of standard form quadratic equation
	 * @return Double array containing values of real roots
	 */

	public static double[] realQuadraticRoots(double a, double b, double c) {
		double discriminant = sqrt(b * b + 4 * a * c);

		if (isNaN(discriminant)) {
			return null;
		}

		else {
			double[] roots = new double[2];

			roots[0] = (-b + discriminant) / (2 * a);
			roots[1] = (-b - discriminant) / (2 * a);

			return roots;
		}
	}

	/*
	 * This method finds the number of ways to choose
	 * r objects from a set of n elements. Note that
	 * order does not matter.
	 *
	 * @param n Number of elements to choose from
	 * @param r Size of chosen group
	 * @return Returns the number of ways to choose r objects from n elements
	 */

	public static int ncr(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	/*
	 * This method finds the number of ways to arrange
	 * a list of r distinct elements from a list of
	 * n elements.
	 *
	 * @param n Size of list to choose from
	 * @param r Number of elements chosen from list
	 * @return Returns the number of ways to arrange r elements from list of size n
	 */

	public static int npr(int n, int r) {
		return factorial(n) / factorial(n - r);
	}

	/*
	 * This method finds factorial of a number.
	 *
	 * @param x Number to operate on
	 * @return Returns the factorial of x
	 */

	public static int factorial(int x) {
		if(x == 0)
			return 1;
		else if(x > 0)
			return x * factorial(x - 1);
		else
			throw new ArithmeticException("Number cannot be less than zero.");
	}

	public static double variance(ArrayList<Double> list) {
		return 0;
	}

	public static double stdev(ArrayList<Double> list) {
		return 0;
	}

	/*
	 * This method determines if a double is
	 * not a number.
	 *
	 * @param x Double under consideration
	 * @return Returns true if double is not a number
	 */

	public static boolean isNaN(double x) {
		return x != x;
	}
}