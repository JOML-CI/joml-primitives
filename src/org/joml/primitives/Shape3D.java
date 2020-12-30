package org.joml.primitives;

import org.joml.Vector2d;
import org.joml.Vector3dc;

public interface Shape3D {

    /**
     * Test whether the point <code>(x, y, z)</code> lies inside this {@link Shape3D}.
     *
     * @param x
     *          the x coordinate of the point
     * @param y
     *          the y coordinate of the point
     * @param z
     *          the z coordinate of the point
     * @return <code>true</code> iff the given point lies inside this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean containsPoint(double x, double y, double z);

    /**
     * Test whether the point <code>(x, y, z)</code> lies inside this {@link Shape3D}.
     *
     * @param x
     *          the x coordinate of the point
     * @param y
     *          the y coordinate of the point
     * @param z
     *          the z coordinate of the point
     * @return <code>true</code> iff the given point lies inside this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean containsPoint(float x, float y, float z);

    /**
     * Test whether the given point lies inside this {@link Shape3D}.
     *
     * @param point
     *          the coordinates of the point
     * @return <code>true</code> iff the given point lies inside this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean containsPoint(Vector3dc point);

    /**
     * Test whether the plane given via its plane equation <code>a*x + b*y + c*z + d = 0</code> intersects this {@link Shape3D}.
     * <p>
     * Reference: <a href="http://www.lighthouse3d.com/tutorials/view-frustum-culling/geometric-approach-testing-boxes-ii/">http://www.lighthouse3d.com</a> ("Geometric Approach - Testing Boxes II")
     *
     * @param a
     *          the x factor in the plane equation
     * @param b
     *          the y factor in the plane equation
     * @param c
     *          the z factor in the plane equation
     * @param d
     *          the constant in the plane equation
     * @return <code>true</code> iff the plane intersects this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean intersectsPlane(double a, double b, double c, double d);


    /**
     * Test whether the given plane intersects this {@link Shape3D}.
     * <p>
     * Reference: <a href="http://www.lighthouse3d.com/tutorials/view-frustum-culling/geometric-approach-testing-boxes-ii/">http://www.lighthouse3d.com</a> ("Geometric Approach - Testing Boxes II")
     *
     * @param plane
     *          the plane
     * @return <code>true</code> iff the plane intersects this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean intersectsPlane(Planed plane);


    /**
     * Test whether <code>this</code> and <code>other</code> intersect.
     *
     * @param other
     *          the other {@link Shape3D}
     * @return <code>true</code> iff both {@link Shape3D}s intersect; <code>false</code> otherwise
     */
    boolean intersectsAABB(AABBdc other);

    /**
     * Test whether <code>this</code> and <code>other</code> intersect.
     *
     * @param other
     *          the other {@link Shape3D}
     * @return <code>true</code> iff both {@link Shape3D}s intersect; <code>false</code> otherwise
     */
    boolean intersectsAABB(AABBfc other);

    /**
     * Test whether this {@link Shape3D} intersects the given sphere with equation
     * <code>(x - centerX)^2 + (y - centerY)^2 + (z - centerZ)^2 - radiusSquared = 0</code>.
     * <p>
     * Reference: <a href="http://stackoverflow.com/questions/4578967/cube-sphere-intersection-test#answer-4579069">http://stackoverflow.com</a>
     *
     * @param centerX
     *          the x coordinate of the center of the sphere
     * @param centerY
     *          the y coordinate of the center of the sphere
     * @param centerZ
     *          the z coordinate of the center of the sphere
     * @param radiusSquared
     *          the square radius of the sphere
     * @return <code>true</code> iff this {@link Shape3D} and the sphere intersect; <code>false</code> otherwise
     */
    boolean intersectsSphere(double centerX, double centerY, double centerZ, double radiusSquared) ;

    /**
     * Test whether this {@link Shape3D} intersects the given sphere.
     * <p>
     * Reference: <a href="http://stackoverflow.com/questions/4578967/cube-sphere-intersection-test#answer-4579069">http://stackoverflow.com</a>
     *
     * @param sphere
     *          the sphere
     * @return <code>true</code> iff this {@link Shape3D} and the sphere intersect; <code>false</code> otherwise
     */
    boolean intersectsSphere(Spheref sphere);

    /**
     * Test whether the given ray with the origin <code>(originX, originY, originZ)</code> and direction <code>(dirX, dirY, dirZ)</code>
     * intersects this {@link Shape3D}.
     * <p>
     * This method returns <code>true</code> for a ray whose origin lies inside this {@link Shape3D}.
     * <p>
     * Reference: <a href="https://dl.acm.org/citation.cfm?id=1198748">An Efficient and Robust Ray–Box Intersection</a>
     *
     * @param originX
     *          the x coordinate of the ray's origin
     * @param originY
     *          the y coordinate of the ray's origin
     * @param originZ
     *          the z coordinate of the ray's origin
     * @param dirX
     *          the x coordinate of the ray's direction
     * @param dirY
     *          the y coordinate of the ray's direction
     * @param dirZ
     *          the z coordinate of the ray's direction
     * @return <code>true</code> if this {@link Shape3D} and the ray intersect; <code>false</code> otherwise
     */
    boolean intersectsRay(double originX, double originY, double originZ, double dirX, double dirY, double dirZ) ;

    /**
     * Test whether the given ray intersects this {@link Shape3D}.
     * <p>
     * This method returns <code>true</code> for a ray whose origin lies inside this {@link Shape3D}.
     * <p>
     * Reference: <a href="https://dl.acm.org/citation.cfm?id=1198748">An Efficient and Robust Ray–Box Intersection</a>
     *
     * @param ray
     *          the ray
     * @return <code>true</code> if this {@link Shape3D} and the ray intersect; <code>false</code> otherwise
     */
    boolean intersectsRay(Rayd ray);

    /**
     * Determine whether the given ray with the origin <code>(originX, originY, originZ)</code> and direction <code>(dirX, dirY, dirZ)</code>
     * intersects this {@link Shape3D}, and return the values of the parameter <i>t</i> in the ray equation
     * <i>p(t) = origin + t * dir</i> of the near and far point of intersection.
     * <p>
     * This method returns <code>true</code> for a ray whose origin lies inside this {@link Shape3D}.
     * <p>
     * Reference: <a href="https://dl.acm.org/citation.cfm?id=1198748">An Efficient and Robust Ray–Box Intersection</a>
     *
     * @param originX
     *              the x coordinate of the ray's origin
     * @param originY
     *              the y coordinate of the ray's origin
     * @param originZ
     *              the z coordinate of the ray's origin
     * @param dirX
     *              the x coordinate of the ray's direction
     * @param dirY
     *              the y coordinate of the ray's direction
     * @param dirZ
     *              the z coordinate of the ray's direction
     * @param result
     *              a vector which will hold the resulting values of the parameter
     *              <i>t</i> in the ray equation <i>p(t) = origin + t * dir</i> of the near and far point of intersection
     *              iff the ray intersects this {@link Shape3D}
     * @return <code>true</code> if the given ray intersects this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean intersectsRay(double originX, double originY, double originZ, double dirX, double dirY, double dirZ, Vector2d result);


    /**
     * Determine whether the given ray intersects this {@link Shape3D}, and return the values of the parameter <i>t</i> in the ray equation
     * <i>p(t) = origin + t * dir</i> of the near and far point of intersection.
     * <p>
     * This method returns <code>true</code> for a ray whose origin lies inside this {@link Shape3D}.
     * <p>
     * Reference: <a href="https://dl.acm.org/citation.cfm?id=1198748">An Efficient and Robust Ray–Box Intersection</a>
     *
     * @param ray
     *              the ray
     * @param result
     *              a vector which will hold the resulting values of the parameter
     *              <i>t</i> in the ray equation <i>p(t) = origin + t * dir</i> of the near and far point of intersection
     *              iff the ray intersects this {@link Shape3D}
     * @return <code>true</code> if the given ray intersects this {@link Shape3D}; <code>false</code> otherwise
     */
    boolean intersectsRay(Rayd ray, Vector2d result);

    /**
     * Determine whether the undirected line segment with the end points <code>(p0X, p0Y, p0Z)</code> and <code>(p1X, p1Y, p1Z)</code>
     * intersects this {@link Shape3D}, and return the values of the parameter <i>t</i> in the ray equation
     * <i>p(t) = origin + p0 * (p1 - p0)</i> of the near and far point of intersection.
     * <p>
     * This method returns <code>true</code> for a line segment whose either end point lies inside this {@link Shape3D}.
     * <p>
     * Reference: <a href="https://dl.acm.org/citation.cfm?id=1198748">An Efficient and Robust Ray–Box Intersection</a>
     *
     * @param p0X
     *              the x coordinate of the line segment's first end point
     * @param p0Y
     *              the y coordinate of the line segment's first end point
     * @param p0Z
     *              the z coordinate of the line segment's first end point
     * @param p1X
     *              the x coordinate of the line segment's second end point
     * @param p1Y
     *              the y coordinate of the line segment's second end point
     * @param p1Z
     *              the z coordinate of the line segment's second end point
     * @param result
     *              a vector which will hold the resulting values of the parameter
     *              <i>t</i> in the ray equation <i>p(t) = p0 + t * (p1 - p0)</i> of the near and far point of intersection
     *              iff the line segment intersects this {@link Shape3D}
     * @return {@link Intersectiond#INSIDE} if the line segment lies completely inside of this {@link Shape3D}; or
     *         {@link Intersectiond#OUTSIDE} if the line segment lies completely outside of this {@link Shape3D}; or
     *         {@link Intersectiond#ONE_INTERSECTION} if one of the end points of the line segment lies inside of this AABB; or
     *         {@link Intersectiond#TWO_INTERSECTION} if the line segment intersects two sides of this {@link Shape3D} or lies on an edge or a side of this AABB
     */
    int intersectsLineSegment(double p0X, double p0Y, double p0Z, double p1X, double p1Y, double p1Z, Vector2d result) ;

    /**
     * Determine whether the given undirected line segment intersects this {@link Shape3D}, and return the values of the parameter <i>t</i> in the ray equation
     * <i>p(t) = origin + p0 * (p1 - p0)</i> of the near and far point of intersection.
     * <p>
     * This method returns <code>true</code> for a line segment whose either end point lies inside this {@link Shape3D}.
     * <p>
     * Reference: <a href="https://dl.acm.org/citation.cfm?id=1198748">An Efficient and Robust Ray–Box Intersection</a>
     *
     * @param lineSegment
     *              the line segment
     * @param result
     *              a vector which will hold the resulting values of the parameter
     *              <i>t</i> in the ray equation <i>p(t) = p0 + t * (p1 - p0)</i> of the near and far point of intersection
     *              iff the line segment intersects this {@link Shape3D}
     * @return {@link Intersectiond#INSIDE} if the line segment lies completely inside of this {@link Shape3D}; or
     *         {@link Intersectiond#OUTSIDE} if the line segment lies completely outside of this {@link Shape3D}; or
     *         {@link Intersectiond#ONE_INTERSECTION} if one of the end points of the line segment lies inside of this {@link Shape3D}; or
     *         {@link Intersectiond#TWO_INTERSECTION} if the line segment intersects two sides of this {@link Shape3D} or lies on an edge or a side of this AABB
     */
    int intersectsLineSegment(LineSegmentf lineSegment, Vector2d result);

}
