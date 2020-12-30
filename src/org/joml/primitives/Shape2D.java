package org.joml.primitives;

import org.joml.Vector2dc;

public interface Shape2D {

    /**
     * Check if this {@link Shape2D} contains the given point <code>(x, y)</code>.
     *
     * @param x
     *          the x coordinate of the point to check
     * @param y
     *          the y coordinate of the point to check
     * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
     */
    boolean containsPoint(double x, double y);

    /**
     * Check if this {@link Shape2D} contains the given point <code>(x, y)</code>.
     *
     * @param x
     *          the x coordinate of the point to check
     * @param y
     *          the y coordinate of the point to check
     * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
     */
    boolean containsPoint(float x, float y);

    /**
     * Check if this {@link Shape2D} contains the given <code>point</code>.
     *
     * @param point
     *          the point to test
     * @return <code>true</code> iff this rectangle contains the point; <code>false</code> otherwise
     */
    boolean containsPoint(Vector2dc point);

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
     * Check if this and the given circle intersect.
     *
     * @param other
     *          the other rectangle
     * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
     */
    boolean intersectsCircle(Circlefc other);

    /**
     * Check if this and the given circle intersect.
     *
     * @param other
     *          the other rectangle
     * @return <code>true</code> iff both rectangles intersect; <code>false</code> otherwise
     */
    boolean intersectsCircle(Circledc other);
}
