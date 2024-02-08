package jv;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        if (target != color) dfs(image, sr, sc, target, color);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int colour, int newColour) {
        if (image[r][c] == colour) {
            image[r][c] = newColour;
            if (r >= 1) {
                dfs(image, r - 1, c, colour, newColour);
            }
            if (c >= 1) {
                dfs(image, r, c - 1, colour, newColour);
            }
            if (c + 1 < image[0].length) {
                dfs(image, r, c + 1, colour, newColour);
            }
            if (r + 1 < image.length) {
                dfs(image, r + 1, c, colour, newColour);
            }
        }
    }
}
