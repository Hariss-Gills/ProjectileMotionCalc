package com.company;

public class Projectile {

    private String name;
    private double angle;
    private double initalVelocity;
    private double time;
    private final double g;

    public Projectile(String name, double angle, double initalVelocity, double time) {
        this.name = name;
        this.angle = angle;
        this.initalVelocity = initalVelocity;
        this.time = time;
        this.g = 9.81;
    }

    public Projectile(String name, double angle, double initalVelocity) {
        this(name, angle, initalVelocity, 0);
    }

    public double calculateVelocity() {
        double Vx = calculateVx();
        double Vy = calculateVy();
        double Velocity = Math.sqrt(Math.pow(Vx, 2) + Math.pow(Vy, 2));
        return Velocity;
    }

    public double calculateVx() {
        double Vx = initalVelocity * Math.cos(Math.toRadians(angle));
        return Vx;
    }

    public double calculateVy() {
        double Vy = -g * time + initalVelocity * Math.sin(Math.toRadians(angle));
        return Vy;
    }

    public double calculateX() {
        double x = initalVelocity * Math.cos(Math.toRadians(angle)) * time;
        return x;
    }

    public double calculateY() {
        double y = 0.0;
        y = -0.5 * g * Math.pow(time, 2) + (initalVelocity * Math.sin(Math.toRadians(angle))) * time;
        return y;
    }

    public double calculateDistance() {
        double distance = Math.sqrt(Math.pow(calculateX(), 2) + Math.pow(calculateY(), 2));
        return distance;
    }

    public double calculateAngle() {
        double angle = Math.atan(calculateVy() / calculateVx());
        return Math.toDegrees(angle);
    }

    public double calculateMaxHeight() {
        return initalVelocity * Math.sin(Math.toRadians(angle)) * timeatMaxHeight() - 0.5 * g * Math.pow(timeatMaxHeight(),2);
    }

    public double timeatMaxHeight() {
        double time = initalVelocity * Math.sin(Math.toRadians(angle)) / g;
        return time;
    }

    public String toString() {
        return this.name;
    }

}
