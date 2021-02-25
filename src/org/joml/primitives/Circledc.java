package org.joml.primitives;

import org.joml.Vector2dc;
import org.joml.Vector2fc;

/**
 * Interface to a read-only view of a 2D circle using double-precision floating-point numbers.
 */
public interface Circledc {

	/**
	 * The x coordinate of the circle's center.
	 */
	double x();

	/**
	 * The y coordinate of the circle's center.
	 */
	double y();

	/**
	 * The radius of the circle.
	 */
	double r();

	/**
	 * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
	 *
	 * @param xy
	 *          the vector to translate by
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Circled translate(Vector2dc xy, Circled dest);

	/**
	 * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
	 *
	 * @param xy
	 *          the vector to translate by
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Circled translate(Vector2fc xy, Circled dest);

	/**
	 * Translate <code>this</code> by the vector <code>(x, y)</code> and store the result in <code>dest</code>.
	 *
	 * @param x
	 *          the x coordinate to translate by
	 * @param y
	 *          the y coordinate to translate by
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Circled translate(double x, double y, Circled dest);
}
