package org.joml.primitives;

import org.joml.Vector2ic;

public interface Rectangleic extends Shape2D {

    int minX();

    int minY();

    int maxX();

    int maxY();

    /**
     * Return the length of the rectangle in the X dimension.
     *
     * @return length in the X dimension
     */
    int getSizeX();

    /**
     * Return the length of the rectangle in the X dimension.
     *
     * @return length in the X dimension
     */
    int getSizeY();

    /**
     * Return the area of the rectangle
     *
     * @return area
     */
    int area();

    /**
     * Compute the union of <code>this</code> and the given point <code>(x, y, z)</code> and store the result in <code>dest</code>.
     *
     * @param x    the x coordinate of the point
     * @param y    the y coordinate of the point
     * @param dest will hold the result
     * @return dest
     */
    Rectanglei union(int x, int y, Rectanglei dest);

    /**
     * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
     *
     * @param p    the point
     * @param dest will hold the result
     * @return dest
     */
    Rectanglei union(Vector2ic p, Rectanglei dest);


    /**
     * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
     *
     * @param other the other {@link Rectanglei}
     * @param dest  will hold the result
     * @return dest
     */
    Rectanglei union(Rectanglei other, Rectanglei dest);


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

}
