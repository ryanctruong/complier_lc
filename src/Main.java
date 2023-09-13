public class Main {
    public static void main(String[] args) {
        Main cls = new Main();

        int[] nums = {1,2,3,4};
        int a = cls.findIndex(nums, 3);

        System.out.println(a);
    }

    // leet code methods
    public int findIndex(int[] nums, int n ){
        int i = 0, j = nums.length-1;
        while(i <= j){
            int mid = (j + i) / 2;
            if(nums[i] > n){
                j = mid-1;
            } else if(nums[mid] < n) {
                i = mid+1;
            } else{
                return mid;
            }
        }

        return -1;
    }


}