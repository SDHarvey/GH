package com.example.billsu.ghosthunter;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Random;

/**
 * Created by lukebotti on 3/31/15.
 */
public class Person  {
    private double x;
    private double y;
    private double viewDistance;

    private Rect hitbox;

    private double tX;
    private double tY;
    private double speed;


    public Person(double xval, double yval) {


        this.x = xval;
        this.y = yval;
        this.speed = (1);

        this.tX = this.x;
        this.tY = this.y;
        this.hitbox = new Rect((int) (x), (int) (y), (int)x+30, (int)y+60);



    }

    public void move(float time) {
        // calculate velocities
        double deltaX = this.tX - this.x;
        double deltaY = this.tY - this.y;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        double xSpeed = 0;
        double ySpeed = 0;
        if (distance > 0) {
            xSpeed = this.speed * (deltaX / distance);
            ySpeed = this.speed * (deltaY / distance);
        }
        // actually move now
        this.x = this.x + xSpeed * time;
        this.y = this.y + ySpeed * time;
        this.hitbox = new Rect((int) (x), (int) (y), (int) x + 30, (int) y + 60);
        // System.out.println("Human Moved By:" + this.targetX + " " + this.x);
    }

    public void setTarget(double x, double y) {
        this.tX = x;
        this.tY = y;
    }




    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(double viewDistance) {
        this.viewDistance = viewDistance;
    }

    public Rect getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rect hitbox) {
        this.hitbox = hitbox;
    }

    public double gettX() {
        return tX;
    }

    public void settX(double tX) {
        this.tX = tX;
    }

    public double gettY() {
        return tY;
    }

    public void settY(double tY) {
        this.tY = tY;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


}
