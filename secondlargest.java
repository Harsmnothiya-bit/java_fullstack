class test {
    public static void main(String[] args) {
        int[] nums = { 7, 12, 9, 15, 19, 32, 56, 70 };

        int maxNum = nums[0];
        int secMaxNum = nums[0];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > maxNum) {
                secMaxNum = maxNum;
                maxNum = nums[i];
            }
        }
        System.out.println(maxNum);
        System.out.print(secMaxNum);
    }
}
