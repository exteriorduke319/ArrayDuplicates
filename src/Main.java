public class Main {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean foundBefore;
        boolean foundDup = false;
        int count;

        for(int i = 0; i< nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < nums.length; i++) {
            foundBefore = false;
            count = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    foundBefore = true;
                }
            }

            if (!foundBefore) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println("The number " + nums[i] + " occurs " + count + " times.");
                    foundDup = true;
                }
            }
        }
        if (!foundDup) {
            System.out.println("There aren't any duplicates in the array.");
        }

    }
}