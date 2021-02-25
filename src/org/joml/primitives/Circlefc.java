package org.joml.primitives;

import org.joml.Vector2fc;

/**
 * Interface to a read-only view of a 2D circle using single-precision floating-point numbers.
 */
public interface Circlefc {


	/**
	 * The x coordinate of the circle's center.
	 */
	float x();

	/**
	 * The y coordinate of the circle's center.
	 */
	float y();

	/**
	 * The radius of the circle.
	 */
	float r();

	/**
	 * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
	 *
	 * @param xy
	 *          the vector to translate by
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Circlef translate(Vector2fc xy, Circlef dest);

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
	Circlef translate(float x, float y, Circlef dest);
}
