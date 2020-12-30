package org.joml.primitives;

import org.joml.Vector3dc;
import org.joml.Vector3fc;

public interface Spheredc extends Shape3D {

    /**
     * @return the value of the x component
     */
    double x();

    /**
     * @return the value of the y component
     */
    double y();

    /**
     * @return the value of the z component
     */
    double z();

    /**
     * @return the radius of the sphere
     */
    double r();

    /**
     * Translate <code>this</code> by the given vector <code>xyz</code> and store the result in <code>dest</code>.
     *
     * @param xyz  the vector to translate by
     * @param dest will hold the result
     * @return dest
     */
    Sphered translate(Vector3fc xyz, Sphered dest);

    /**
     * Translate <code>this</code> by the given vector <code>xyz</code> and store the result in <code>dest</code>.
     *
     * @param xyz  the vector to translate by
     * @param dest will hold the result
     * @return dest
     */
    Sphered translate(Vector3dc xyz, Sphered dest);

    /**
     * Translate <code>this</code> by the vector <code>(x, y, z)</code> and store the result in <code>dest</code>.
     *
     * @param x    the x coordinate to translate by
     * @param y    the y coordinate to translate by
     * @param z    the z coordinate to translate by
     * @param dest will hold the result
     * @return dest
     */
    Sphered translate(double x, double y, double z, Sphered dest);
}
