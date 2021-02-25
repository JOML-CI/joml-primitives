package org.joml.primitives;

import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector2ic;

public interface Rectanglefc {
	float minX();

	float minY();

	float maxX();

	float maxY();

	/**
	 * Return the length of the rectangle in the X dimension.
	 *
	 * @return length in the X dimension
	 */
	float lengthX();

	/**
	 * Return the length of the rectangle in the Y dimension.
	 *
	 * @return length in the Y dimension
	 */
	float lengthY();

	/**
	 * Return the area of the rectangle
	 *
	 * @return area
	 */
	float area();

	/**
	 * Compute the union of <code>this</code> and the given point <code>(x, y, z)</code> and store the result in <code>dest</code>.
	 *
	 * @param x
	 *          the x coordinate of the point
	 * @param y
	 *          the y coordinate of the point
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef union(float x, float y, Rectanglef dest);

	/**
	 * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
	 *
	 * @param p
	 *          the point
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef union(Vector2ic p, Rectanglef dest);

	/**
	 * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
	 *
	 * @param other
	 *          the other {@link Rectanglef}
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef union(Rectanglefc other, Rectanglef dest);

	/**
	 * Check if this and the given rectangle intersect.
	 *
	 * @param other
	 *          the other rectangle
	 * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
	 */
	boolean intersectsRectangle(Rectangledc other);

	/**
	 * Check if this and the given rectangle intersect.
	 *
	 * @param other
	 *          the other rectangle
	 * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
	 */
	boolean intersectsRectangle(Rectanglefc other);

	/**
	 * Check if this and the given rectangle intersect.
	 *
	 * @param other
	 *          the other rectangle
	 * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
	 */
	boolean intersectsRectangle(Rectangleic other);

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
	 * If the two rectangles do not intersect, then {@link Float#NaN} is stored in each component
	 * of <code>dest</code>.
	 *
	 * @param other
	 *          the other rectangle
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef intersection(Rectanglefc other, Rectanglef dest);

	/**
	 * Compute the rectangle of intersection between <code>this</code> and the given rectangle and
	 * store the result in <code>dest</code>.
	 * <p>
	 * If the two rectangles do not intersect, then {@link Double#NaN} is stored in each component
	 * of <code>dest</code>.
	 *
	 * @param other
	 *          the other rectangle
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef intersection(Rectangleic other, Rectanglef dest);

	/**
	 * Return the length of this rectangle in the X and Y dimensions and store the result in <code>dest</code>.
	 *
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Vector2f lengths(Vector2f dest);

	/**
	 * Check if this rectangle contains the given <code>rectangle</code>.
	 *
	 * @param rectangle
	 *          the rectangle to test
	 * @return <code>true</code> iff this rectangle contains the rectangle; <code>false</code> otherwise
	 */
	boolean containsRectangle(Rectangledc rectangle);

	/**
	 * Check if this rectangle contains the given <code>rectangle</code>.
	 *
	 * @param rectangle
	 *          the rectangle to test
	 * @return <code>true</code> iff this rectangle contains the rectangle; <code>false</code> otherwise
	 */
	boolean containsRectangle(Rectanglefc rectangle);

	/**
	 * Check if this rectangle contains the given <code>rectangle</code>.
	 *
	 * @param rectangle
	 *          the rectangle to test
	 * @return <code>true</code> iff this rectangle contains the rectangle; <code>false</code> otherwise
	 */
	boolean containsRectangle(Rectangleic rectangle);

	/**
	 * Check if this rectangle contains the given <code>point</code>.
	 *
	 * @param point
	 *          the point to test
	 * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
	 */
	boolean containsPoint(Vector2fc point);

	/**
	 * Check if this rectangle contains the given point <code>(x, y)</code>.
	 *
	 * @param x
	 *          the x coordinate of the point to check
	 * @param y
	 *          the y coordinate of the point to check
	 * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
	 */
	boolean containsPoint(float x, float y);

	/**
	 * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
	 *
	 * @param xy
	 *          the vector to translate by
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef translate(Vector2fc xy, Rectanglef dest);

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
	Rectanglef translate(float x, float y, Rectanglef dest);

	/**
	 * Scale <code>this</code> about the origin and store the result in <code>dest</code>.
	 *
	 * @param sf
	 *          the scaling factor in the x and y axis
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef scale(float sf, Rectanglef dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(-ax, -ay, dest).scale(sf).translate(ax, ay)</code>
	 *
	 * @param sf
	 *          the scaling factor in the x and y axis
	 * @param ax
	 *          the x coordinate of the anchor
	 * @param ay
	 *          the y coordinate of the anchor
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef scale(float sf, float ax, float ay, Rectanglef dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(anchor.negate(), dest).scale(sf).translate(anchor.negate())</code>
	 *
	 * @param sf
	 *          the scaling factor in the x and y axis
	 * @param anchor
	 *          the location of the anchor
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef scale(float sf, Vector2fc anchor, Rectanglef dest);

	/**
	 * Scale <code>this</code> about the origin and store the result in <code>dest</code>.
	 *
	 * @param sx
	 *          the scaling factor on the x axis
	 * @param sy
	 *          the scaling factor on the y axis
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef scale(float sx, float sy, Rectanglef dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(-ax, -ay, dest).scale(sx, sy).translate(ax, ay)</code>
	 *
	 * @param sx
	 *          the scaling factor on the x axis
	 * @param sy
	 *          the scaling factor on the y axis
	 * @param ax
	 *          the x coordinate of the anchor
	 * @param ay
	 *          the y coordinate of the anchor
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef scale(float sx, float sy, float ax, float ay, Rectanglef dest);

	/**
	 * Scale <code>this</code> about an anchor and store the result in <code>dest</code>.
	 * <p>
	 * This is equivalent to <code>translate(anchor.negate(), dest).scale(sx, sy).translate(anchor.negate())</code>
	 *
	 * @param sx
	 *          the scaling factor on the x axis
	 * @param sy
	 *          the scaling factor on the y axis
	 * @param anchor
	 *          the location of the anchor
	 * @param dest
	 *          will hold the result
	 * @return dest
	 */
	Rectanglef scale(float sx, float sy, Vector2fc anchor, Rectanglef dest);
}
