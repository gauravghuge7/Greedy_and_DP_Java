public class frog_jump_naukari {


    private static int canJump(int index, int[] height) {

        if(index == 0) return 0;

        int ones = canJump(index - 1, height) + Math.abs(height[index] - height[index - 1]);
        int twos = canJump(index - 2, height) + Math.abs(height[index] - height[index - 2]);

        return Math.min(ones, twos);
    }

    public static int frogJump(int n, int heights[]) {

        // Write your code here..


        return canJump(n-1, heights);

    }

    public static void main(String[] args) {

    }
}
