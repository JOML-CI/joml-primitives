package org.joml.primitives;

public interface Planefc {
    /**
     * Normalize this plane and store the result in <code>dest</code>.
     *
     * @param dest will hold the result
     * @return dest
     */
    Planef normalize(Planef dest);

    /**
     * Compute the signed distance between this plane and the given point.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @param z the z coordinate of the point
     * @return the signed distance between this plane and the point
     */
    float distance(float x, float y, float z);

    float a();

    float b();

    float c();

    float d();
}
