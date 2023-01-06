package com.company;

public class Main {

    public static void main(String[] args) {

       // System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width > 0 && height > 0) {
            double area = width * height;
            double remArea = area - (extraBuckets * areaPerBucket);
            int bucketsToBuy = (int) Math.ceil(remArea / areaPerBucket);
            return bucketsToBuy;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if(width > 0 && height > 0) {
            double area = width * height;
            int bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
            return bucketsToBuy;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area > 0) {
            int bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
            return bucketsToBuy;
        } else {
            return -1;
        }
    }
}
