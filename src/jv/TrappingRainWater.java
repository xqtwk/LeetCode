package jv;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater t = new TrappingRainWater();
        int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(t.trap(h));
    }
    public int trap(int[] height) {
        int trapped = 0;
        int length = height.length;
        for (int i = 0; i < length; i++) {
            int left = height[i];
            int right = height[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, height[j]);
            }
            for (int j = i + 1; j < length; j++) {
                right = Math.max(right, height[j]);
            }
            trapped += Math.min(left, right) - height[i];
        }
        return trapped;
    }
}
