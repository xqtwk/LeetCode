package jv;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        for ( int i = 0; i < length; i++) {
            if ( (i-1 < 0 ? 0 : flowerbed[i-1]) == 0 && flowerbed[i] == 0
                    && (i+1 >= length ? 0 : flowerbed[i+1]) == 0) {
                count++;
                flowerbed[i] = 1;
            }
        }
        return count == n || count > n ? true : false;
    }
}
