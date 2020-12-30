package org.joml.primitives;

import org.joml.Math;
import org.joml.Vector2d;
import org.joml.Vector2dc;
import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector3d;

public interface Rectangledc extends Shape2D {
    double minX();

    double minY();

    double maxX();

    double maxY();

    double getSizeX();

    double getSizeY();


    Vector2f getSize(Vector2f dest);

    Vector2d getSize(Vector2d dest);


    Vector2f center(Vector2f dest);

    Vector2d center(Vector2d dest);

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
     Rectangled intersection(Rectangled other, Rectangled dest);

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
     Rectangled intersection(Rectanglef other, Rectangled dest);

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
    Rectangled intersection(Rectanglei other, Rectangled dest);

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
    Rectangled union(double x, double y, Rectangled dest);


    /**
     * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
     *
     * @param p
     *          the point
     * @param dest
     *          will hold the result
     * @return dest
     */
    Rectangled union(Vector2dc p, Rectangled dest);


    /**
     * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
     *
     * @param other
     *          the other {@link Rectangled}
     * @param dest
     *          will hold the result
     * @return dest
     */
    Rectangled union(Rectangledc other, Rectangled dest);

    /**
     * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
     *
     * @param xy
     *          the vector to translate by
     * @param dest
     *          will hold the result
     * @return dest
     */
    Rectangled translate(Vector2dc xy, Rectangled dest);


    /**
     * Translate <code>this</code> by the given vector <code>xy</code> and store the result in <code>dest</code>.
     *
     * @param xy
     *          the vector to translate by
     * @param dest
     *          will hold the result
     * @return dest
     */
    Rectangled translate(Vector2fc xy, Rectangled dest);

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
    Rectangled translate(double x, double y, Rectangled dest);


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
    Rectangled scale(double sx, double sy, Vector2dc anchor, Rectangled dest);

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
    Rectangled scale(double sx, double sy, double ax, double ay, Rectangled dest);

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
    Rectangled scale(double sx, double sy, Rectangled dest);

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
    Rectangled scale(double sf, Vector2dc anchor, Rectangled dest);



}
