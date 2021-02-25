package org.joml.primitives;

import org.joml.Vector2d;
import org.joml.Vector2dc;
import org.joml.Vector2fc;

public interface Rectangledc {

	double minX();
	double minY();
	double maxX();
	double maxY();

	/**
	 * Return the length of the rectangle in the X dimension.
	 *
	 * @return length in the X dimension
	 */
	double lengthX();

	/**
	 * Return the length of the rectangle in the Y dimension.
	 *
	 * @return length in the Y dimension
	 */
	double lengthY();

	/**
	 * Return the area of the rectangle
	 *
	 * @return area
	 */
	double area();

	/**
	 * Check whether <code>this</code> rectangle represents a valid rectangle.
	 *
	 * @return <code>true</code> iff this rectangle is valid; <code>false</code> otherwise
	 */
	boolean isValid();

	/**
	 * Compute the rectangle of intersection between <code>this</code> and the given rectangle and
	 * store the result in <code>dest</code>.
	 * <p>
	 * If the two rectangles do not intersect, then {@link Double#NaN} is stored in each component
	 * of <code>dest</code>.
	 *
	 * @param other the other rectangle
	 * @param dest  will hold the result
	 * @return dest
	 */
	Rectangled intersection(Rectangled other, Rectangled dest);

	/**
	 * Compute the rectangle of intersection between <code>this</code> and the given rectangle and
	 * store the result in <code>dest</code>.
	 * <p>
	 * If the two rectangles do not intersect, then {@link Double#NaN} is stored in each component
	 * of <code>dest</code>.
	 *
	 * @param other the other rectangle
	 * @param dest  will hold the result
	 * @return dest
	 */
	Rectangled intersection(Rectanglef other, Rectangled dest);

	/**
	 * Compute the rectangle of intersection between <code>this</code> and the given rectangle and
	 * store the result in <code>dest</code>.
	 * <p>
	 * If the two rectangles do not intersect, then {@link Double#NaN} is stored in each component
	 * of <code>dest</code>.
	 *
	 * @param other the other rectangle
	 * @param dest  will hold the result
	 * @return dest
	 */
	Rectangled intersection(Rectanglei other, Rectangled dest);

	/**
	 * Return the length of this rectangle in the X and Y dimensions and store the result in <code>dest</code>.
	 *
	 * @param dest will hold the result
	 * @return dest
	 */
	Vector2d lengths(Vector2d dest);

	/**
	 * Check if this rectangle contains the given <code>rectangle</code>.
	 *
	 * @param rectangle the rectangle to test
	 * @return <code>true</code> iff this rectangle contains the rectangle; <code>false</code> otherwise
	 */
	boolean containsRectangle(Rectangledc rectangle);

	/**
	 * Check if this rectangle contains the given <code>rectangle</code>.
	 *
	 * @param rectangle the rectangle to test
	 * @return <code>true</code> iff this rectangle contains the rectangle; <code>false</code> otherwise
	 */
	boolean containsRectangle(Rectanglef rectangle);

	/**
	 * Check if this rectangle contains the given <code>rectangle</code>.
	 *
	 * @param rectangle the rectangle to test
	 * @return <code>true</code> iff this rectangle contains the rectangle; <code>false</code> otherwise
	 */
	boolean containsRectangle(Rectanglei rectangle);

	/**
	 * Compute the union of <code>this</code> and the given point <code>(x, y, z)</code> and store the result in <code>dest</code>.
	 *
	 * @param x    the x coordinate of the point
	 * @param y    the y coordinate of the point
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled union(double x, double y, Rectangled dest);

	/**
	 * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
	 *
	 * @param p    the point
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled union(Vector2dc p, Rectangled dest);

	/**
	 * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
	 *
	 * @param other the other {@link Rectangled}
	 * @param dest  will hold the result
	 * @return dest
	 */
	Rectangled union(Rectangled other, Rectangled dest);

	/**
	 * Check if this and the given rectangle intersect.
	 *
	 * @param other the other rectangle
	 * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
	 */
	boolean intersectsRectangle(Rectangled other);

	/**
	 * Check if this and the given rectangle intersect.
	 *
	 * @param other the other rectangle
	 * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
	 */
	boolean intersectsRectangle(Rectanglef other);

	/**
	 * Check if this and the given rectangle intersect.
	 *
	 * @param other the other rectangle
	 * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
	 */
	boolean intersectsRectangle(Rectanglei other);

	/**
	 * Check if this rectangle contains the given <code>point</code>.
	 *
	 * @param point the point to test
	 * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
	 */
	boolean containsPoint(Vector2dc point);

	/**
	 * Check if this rectangle contains the given point <code>(x, y)</code>.
	 *
	 * @param x the x coordinate of the point to check
	 * @param y the y coordinate of the point to check
	 * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
	 */
	boolean containsPoint(double x, double y);

	/**
	 * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
	 *
	 * @param xy   the vector to translate by
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled translate(Vector2dc xy, Rectangled dest);

	/**
	 * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
	 *
	 * @param xy   the vector to translate by
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled translate(Vector2fc xy, Rectangled dest);

	/**
	 * Translate <code>this</code> by the vector <code>(x, y)</code> and store the result in <code>dest</code>.
	 *
	 * @param x    the x coordinate to translate by
	 * @param y    the y coordinate to translate by
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled translate(double x, double y, Rectangled dest);

	/**
	 * Scale <code>this</code> about the origin and store the result in <code>dest</code>.
	 *
	 * @param sf   the scaling factor in the x and y axis
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled scale(double sf, Rectangled dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(-ax, -ay, dest).scale(sf).translate(ax, ay)</code>
	 *
	 * @param sf   the scaling factor in the x and y axis
	 * @param ax   the x coordinate of the anchor
	 * @param ay   the y coordinate of the anchor
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled scale(double sf, double ax, double ay, Rectangled dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(anchor.negate(), dest).scale(sf).translate(anchor.negate())</code>
	 *
	 * @param sf     the scaling factor in the x and y axis
	 * @param anchor the location of the anchor
	 * @param dest   will hold the result
	 * @return dest
	 */
	Rectangled scale(double sf, Vector2dc anchor, Rectangled dest);

	/**
	 * Scale <code>this</code> about the origin and store the result in <code>dest</code>.
	 *
	 * @param sx   the scaling factor on the x axis
	 * @param sy   the scaling factor on the y axis
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled scale(double sx, double sy, Rectangled dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(-ax, -ay, dest).scale(sx, sy).translate(ax, ay)</code>
	 *
	 * @param sx   the scaling factor on the x axis
	 * @param sy   the scaling factor on the y axis
	 * @param ax   the x coordinate of the anchor
	 * @param ay   the y coordinate of the anchor
	 * @param dest will hold the result
	 * @return dest
	 */
	Rectangled scale(double sx, double sy, double ax, double ay, Rectangled dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(anchor.negate(), dest).scale(sx, sy).translate(anchor.negate())</code>
	 *
	 * @param sx     the scaling factor on the x axis
	 * @param sy     the scaling factor on the y axis
	 * @param anchor the location of the anchor
	 * @param dest   will hold the result
	 * @return dest
	 */
	Rectangled scale(double sx, double sy, Vector2dc anchor, Rectangled dest);
}
