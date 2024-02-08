package jv;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1Length = nums1.length;
        int n2Length = nums2.length;
        
        int[] merged = new int[n1Length + n2Length];
        int mergedLength = merged.length;
        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;
        while (firstIndex < nums1.length && secondIndex < nums2.length) {
            if (nums1[firstIndex] < nums2[secondIndex]) {
                merged[mergedIndex++] = nums1[firstIndex++];
            } else {
                merged[mergedIndex++] = nums2[secondIndex++];
            }
        }

        while (firstIndex < nums1.length) {
            merged[mergedIndex++] = nums1[firstIndex++];
        }

        while (secondIndex < nums2.length) {
            merged[mergedIndex++] = nums2[secondIndex++];
        }

        if (mergedLength % 2 == 0) {
            return (double) (merged[mergedLength / 2] + merged[mergedLength / 2 - 1]) / 2;
        } else {
            return merged[(int) Math.ceil(mergedLength / 2)];
        }
    }
}
