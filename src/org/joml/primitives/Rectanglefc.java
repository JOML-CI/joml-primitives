package org.joml.primitives;

import org.joml.Vector2d;
import org.joml.Vector2f;
import org.joml.Vector2fc;

public interface Rectanglefc extends Shape2D{

    float minX();

    float minY();

    float maxX();

    float maxY();

    /**
     * Return the length of the rectangle in the X dimension.
     *
     * @return length in the X dimension
     */
    float getSizeX();

    /**
     * Return the length of the rectangle in the X dimension.
     *
     * @return size in the Y dimension
     */
    float getSizeY();

    Vector2f getSize(Vector2f dest);

    Vector2f center(Vector2f dest);

    Vector2d center(Vector2d dest);

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
}
