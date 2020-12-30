/*
 * The MIT License
 *
 * Copyright (c) 2020 JOML
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.joml.primitives;

import org.joml.Matrix4dc;
import org.joml.Vector2d;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

/**
 * Interface to a read-only view of axis-aligned box defined via the minimum
 * and maximum corner coordinates as double-precision floats.
 */
public interface AABBdc extends Shape3D {

    /**
     * @return The x coordinate of the minimum corner.
     */
    double minX();

    /**
     * @return The y coordinate of the minimum corner.
     */
    double minY();

    /**
     * @return The z coordinate of the minimum corner.
     */
    double minZ();

    /**
     * @return The x coordinate of the maximum corner.
     */
    double maxX();

    /**
     * @return The y coordinate of the maximum corner.
     */
    double maxY();

    /**
     * @return The z coordinate of the maximum corner.
     */
    double maxZ();

    /**
     * Check whether <code>this</code> AABB represents a valid AABB.
     *
     * @return <code>true</code> iff this AABB is valid; <code>false</code> otherwise
     */
    boolean isValid();

    /**
     * Get the maximum corner coordinate of the given component.
     *
     * @param component
     *          the component, within <code>[0..2]</code>
     * @return the maximum coordinate
     * @throws IllegalArgumentException if <code>component</code> is not within <code>[0..2]</code>
     */
    double getMax(int component);

    /**
     * Get the minimum corner coordinate of the given component.
     *
     * @param component
     *          the component, within <code>[0..2]</code>
     * @return the maximum coordinate
     * @throws IllegalArgumentException if <code>component</code> is not within <code>[0..2]</code>
     */
    double getMin(int component);

    /**
     * Return the center of the aabb
     *
     * @param dest will hold the result
     * @return dest
     */
    Vector3d center(Vector3d dest);

    /**
     * Return the center of the aabb
     *
     * @param dest will hold the result
     * @return dest
     */
    Vector3f center(Vector3f dest);

    /**
     * Extent of the aabb (max - min) / 2.0.
     *
     * @param dest will hold the result
     * @return dest
     */
    Vector3d extent(Vector3d dest);

    /**
     * Extent of the aabb (max - min) / 2.0.
     *
     * @param dest will hold the result
     * @return dest
     */
    Vector3f extent(Vector3f dest);

    /**
     * Compute the union of <code>this</code> and the given point <code>(x, y, z)</code> and store the result in <code>dest</code>.
     *
     * @param x
     *          the x coordinate of the point
     * @param y
     *          the y coordinate of the point
     * @param z
     *          the z coordinate of the point
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd union(double x, double y, double z, AABBd dest);


    /**
     * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
     *
     * @param p
     *          the point
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd union(Vector3dc p, AABBd dest);


    /**
     * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
     *
     * @param other
     *          the other {@link AABBd}
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd union(AABBdc other, AABBd dest);

    /**
     * Translate <code>this</code> by the given vector <code>xyz</code> and store the result in <code>dest</code>.
     *
     * @param xyz
     *          the vector to translate by
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd translate(Vector3dc xyz, AABBd dest);


    /**
     * Translate <code>this</code> by the given vector <code>xyz</code> and store the result in <code>dest</code>.
     *
     * @param xyz
     *          the vector to translate by
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd translate(Vector3fc xyz, AABBd dest);

    /**
     * Translate <code>this</code> by the vector <code>(x, y, z)</code> and store the result in <code>dest</code>.
     *
     * @param x
     *          the x coordinate to translate by
     * @param y
     *          the y coordinate to translate by
     * @param z
     *          the z coordinate to translate by
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd translate(double x, double y, double z, AABBd dest);


    /**
     * Compute the AABB of intersection between <code>this</code> and the given AABB.
     * <p>
     * If the two AABBs do not intersect, then the minimum coordinates of <code>this</code>
     * will have a value of {@link Double#POSITIVE_INFINITY} and the maximum coordinates will have a value of
     * {@link Double#NEGATIVE_INFINITY}.
     *
     * @param other
     *           the other AABB
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd intersection(AABBdc other, AABBd dest);


    /**
     * Check if this AABB contains the given <code>AABB</code>.
     *
     * @param aabb
     *          the AABB to test
     * @return <code>true</code> iff this AABB contains the AABB; <code>false</code> otherwise
     */
    boolean containsAABB(AABBdc aabb);

    /**
     * Check if this AABB contains the given <code>AABB</code>.
     *
     * @param aabb
     *          the AABB to test
     * @return <code>true</code> iff this AABB contains the AABB; <code>false</code> otherwise
     */
    boolean containsAABB(AABBfc aabb);


    /**
     * Check if this AABB contains the given <code>AABB</code>.
     *
     * @param aabb
     *          the AABB to test
     * @return <code>true</code> iff this AABB contains the AABB; <code>false</code> otherwise
     */
    boolean containsAABB(AABBic aabb);

    /**
     * Apply the given {@link Matrix4dc#isAffine() affine} transformation to this {@link AABBd}
     * and store the resulting AABB into <code>dest</code>.
     * <p>
     * The matrix in <code>m</code> <i>must</i> be {@link Matrix4dc#isAffine() affine}.
     *
     * @param m
     *          the affine transformation matrix
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBd transform(Matrix4dc m, AABBd dest);

}
