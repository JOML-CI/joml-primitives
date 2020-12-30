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

import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector3ic;

/**
 * Interface to a read-only view of an axis-aligned box defined via the minimum
 * and maximum corner coordinates as ints.
 */
public interface AABBic extends Shape3D {

    /**
     * @return The x coordinate of the minimum corner.
     */
    int minX();

    /**
     * @return The y coordinate of the minimum corner.
     */
    int minY();

    /**
     * @return The z coordinate of the minimum corner.
     */
    int minZ();

    /**
     * @return The x coordinate of the maximum corner.
     */
    int maxX();

    /**
     * @return The y coordinate of the maximum corner.
     */
    int maxY();

    /**
     * @return The z coordinate of the maximum corner.
     */
    int maxZ();

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
    int getMax(int component);


    /**
     * Get the minimum corner coordinate of the given component.
     *
     * @param component
     *          the component, within <code>[0..2]</code>
     * @return the maximum coordinate
     * @throws IllegalArgumentException if <code>component</code> is not within <code>[0..2]</code>
     */
    int getMin(int component);


    /**
     * Return the center of the aabb
     *
     * @param dest will hold the result
     * @return dest
     */
    Vector3f center(Vector3f dest);


    /**
     * Return the center of the aabb
     *
     * @param dest will hold the result
     * @return dest
     */
    Vector3d center(Vector3d dest);


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
    AABBi union(int x, int y, int z, AABBi dest);

    /**
     * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
     *
     * @param p
     *          the point
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBi union(Vector3ic p, AABBi dest);



    /**
     * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
     *
     * @param other
     *          the other {@link AABBi}
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBi union(AABBic other, AABBi dest);

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
    AABBi translate(int x, int y, int z, AABBi dest);


    /**
     * Compute the AABB of intersection between <code>this</code> and the given AABB.
     * <p>
     * If the two AABBs do not intersect, then the minimum coordinates of <code>this</code>
     * will have a value of {@link Integer#MAX_VALUE} and the maximum coordinates will have a value of
     * {@link Integer#MIN_VALUE}.
     *
     * @param other
     *           the other AABB
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBi intersection(AABBic other, AABBi dest);


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
     * Apply the given {@link Matrix4fc#isAffine() affine} transformation to this
     * {@link AABBi} and store the resulting AABB into <code>dest</code>.
     * <p>
     * The matrix in <code>m</code> <i>must</i> be {@link Matrix4fc#isAffine() affine}.
     *
     * @param m
     *          the affine transformation matrix
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBi transform(Matrix4fc m, AABBi dest);

}
