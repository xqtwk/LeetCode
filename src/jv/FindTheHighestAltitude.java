package jv;

public class FindTheHighestAltitude {
    public static void main(String[] args) {

    }
    public int largestAltitude(int[] gain) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < gain.length; i++) {
            count+= gain[i];
            result = Math.max(result, count);
        }
        return result;
    }
}
