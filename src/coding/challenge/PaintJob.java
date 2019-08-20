package coding.challenge;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width>0 && height>0 && areaPerBucket>0 && extraBuckets>=0){
            double totalArea = width * height;
            int totalBucketsNeeded = (int) Math.ceil(totalArea/areaPerBucket);
            if(totalBucketsNeeded>extraBuckets){
                return totalBucketsNeeded-extraBuckets;
            }
            return 0;
        }
        return -1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width>0 && height>0 && areaPerBucket>0){
            double totalArea = width * height;
            int totalBucketsNeeded = (int) Math.ceil(totalArea/areaPerBucket);
            return totalBucketsNeeded;
        }
        return -1;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area>0 && areaPerBucket>0){
            int totalBucketsNeeded = (int) Math.ceil(area/areaPerBucket);
            return totalBucketsNeeded;
        }
        return -1;
    }
}
