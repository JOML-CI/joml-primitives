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

import java.text.NumberFormat;

import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3fc;

/**
 * Interface to a read-only view of an axis-aligned box defined via the minimum
 * and maximum corner coordinates as single-precision floats.
 */
public interface AABBfc extends Shape3D {

    /**
     * @return The x coordinate of the minimum corner.
     */
    float minX();

    /**
     * @return The y coordinate of the minimum corner.
     */
    float minY();

    /**
     * @return The z coordinate of the minimum corner.
     */
    float minZ();

    /**
     * @return The x coordinate of the maximum corner.
     */
    float maxX();

    /**
     * @return The y coordinate of the maximum corner.
     */
    float maxY();

    /**
     * @return The z coordinate of the maximum corner.
     */
    float maxZ();

    /**
     * Check whether <code>this</code> rectangle represents a valid AABB.
     *
     * @return <code>true</code> iff this rectangle is valid; <code>false</code> otherwise
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
    float getMax(int component);

    /**
     * Get the minimum corner coordinate of the given component.
     *
     * @param component
     *          the component, within <code>[0..2]</code>
     * @return the maximum coordinate
     * @throws IllegalArgumentException if <code>component</code> is not within <code>[0..2]</code>
     */
    float getMin(int component);

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
    AABBf union(float x, float y, float z, AABBf dest);

    /**
     * Compute the union of <code>this</code> and the given point <code>p</code> and store the result in <code>dest</code>.
     *
     * @param p
     *          the point
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBf union(Vector3fc p, AABBf dest);

    /**
     * Compute the union of <code>this</code> and <code>other</code> and store the result in <code>dest</code>.
     *
     * @param other
     *          the other {@link AABBf}
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBf union(AABBf other, AABBf dest);

    /**
     * Translate <code>this</code> by the given vector <code>xyz</code> and store the result in <code>dest</code>.
     *
     * @param xyz
     *          the vector to translate by
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBf translate(Vector3fc xyz, AABBf dest);

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
    AABBf translate(float x, float y, float z, AABBf dest);

    /**
     * Compute the AABB of intersection between <code>this</code> and the given AABB.
     * <p>
     * If the two AABBs do not intersect, then the minimum coordinates of <code>this</code>
     * will have a value of {@link Float#POSITIVE_INFINITY} and the maximum coordinates will have a value of
     * {@link Float#NEGATIVE_INFINITY}.
     *
     * @param other
     *           the other AABB
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBf intersection(AABBfc other, AABBf dest);

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
     * {@link AABBf} and store the resulting AABB into <code>dest</code>.
     * <p>
     * The matrix in <code>m</code> <i>must</i> be {@link Matrix4fc#isAffine() affine}.
     *
     * @param m
     *          the affine transformation matrix
     * @param dest
     *          will hold the result
     * @return dest
     */
    AABBf transform(Matrix4fc m, AABBf dest);

    /**
     * Return a string representation of this AABB by formatting the vector components with the given {@link NumberFormat}.
     *
     * @param formatter
     *          the {@link NumberFormat} used to format the vector components with
     * @return the string representation
     */
    String toString(NumberFormat formatter);
}
