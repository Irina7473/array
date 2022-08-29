package org.example;

public class Array {
    int[] nums;
    int amount=0;

    public Array(int[] nums){
        this.amount=nums.length;
        this.nums = new int[amount];
        for (int i=0; i<amount; i++) this.nums[i] = nums[i];
    }

    public Array(int amount){
        this.amount=amount;
        this.nums = new int[amount];
    }

    public void FilArray(){
        for (int i=0; i<amount; i++)
            this.nums[i] = (int)(Math.random() * 100);
    }

    public void Show(){
        System.out.print("[ ");
        for (int i : nums) System.out.print(i + " ");
        System.out.println("]");
    }

    public int Max() {
        int max = 0;
        for (int i : nums)
            if (i > max) max = i;
        return max;
    }

    public int Min() {
        int min = (int)Double.POSITIVE_INFINITY;
        for (int i : nums)
            if (i < min) min = i;
        return min;
    }

    public int Summa() {
        int sum=0;
        for (int i : nums) sum +=i;
        return sum;
    }

    public float AVG() {
        return this.Summa() / amount;
    }

    public void SortAsc() {
        for(int i = amount-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++)
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
        }
    }

    public void SortDesc() {
        for(int i = amount-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++)
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
        }
    }
}
