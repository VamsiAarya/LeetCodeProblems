package org.vamsi;

public class LargestAndSmallestInt {

    public static int getLargest(int[] nums){

        int max = Integer.MIN_VALUE;

        for(Integer num : nums){
            if(num > max){
                max = num;
            }
        }

        return max;
    }


    public static int getSmallest(int[] nums){

        int min = Integer.MAX_VALUE;

        for(Integer num : nums){
            if(num < min){
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {

//        int[] nums = {5,6,9,10,4,3,12,2,7};
        int[] nums = {5,6,-3,9,234,121,0,-25,7,2,-25};

        int maxNum = getLargest(nums);
        int minNum = getSmallest(nums);

        System.out.println("Max: "+ maxNum +", Min: "+ minNum);

    }
}
