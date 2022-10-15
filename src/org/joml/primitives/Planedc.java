package org.joml.primitives;

public interface Planedc {
    /**
     * Normalize this plane and store the result in <code>dest</code>.
     *
     * @param dest will hold the result
     * @return dest
     */
    Planed normalize(Planed dest);

    /**
     * Compute the signed distance between this plane and the given point.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @param z the z coordinate of the point
     * @return the signed distance between this plane and the point
     */
    double distance(double x, double y, double z);

    double a();

    double b();

    double c();

    double d();
}
