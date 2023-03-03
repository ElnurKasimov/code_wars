package Kju_7;

//He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
// His mother looks out of a window 1.5 meters from the ground.
//How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing?
// Three conditions must be met for a valid experiment:
//Float parameter "h" in meters must be greater than 0
//Float parameter "bounce" must be greater than 0 and less than 1
// Float parameter "window" must be less than h.
//If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
// Note:
//The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.
// Examples:
// - h = 3, bounce = 0.66, window = 1.5, result is 3
// - h = 3, bounce = 1, window = 1.5, result is -1
// (Condition 2) not fulfilled).

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        int count = 0;
        double hight = h;
        if (h>0 && (bounce>0 && bounce<1) &&window<h) {
            do {
                count++;
                if (hight*bounce  > window) {count++;}
                hight *=bounce;
            } while (hight > window);
            return count;
        } else    return -1;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(0, 0.3,1.4));
        System.out.println(bouncingBall(8, 0.,1.4));
        System.out.println(bouncingBall(8, 1.,1.4));
        System.out.println(bouncingBall(3, 0.66,1.5));
        System.out.println(bouncingBall(3, 0.66,2.));
    }
}

// BEST solution
//    public static int bouncingBall(double h, double bounce, double window) {
//        if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
//            return -1;
//        int seen = -1;
//        while (h > window) {
//            seen += 2;
//            h = h * bounce;
//        }
//        return seen;
//
//    }