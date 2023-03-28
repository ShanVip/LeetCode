package ConvertSortedArraytoBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        int[] nums ={-10,-3,0,5,9,10};

        int k = nums.length/2;

        System.out.println(k);

        TreeNode root = new TreeNode(nums[k]);
        TreeNode cursor = root;

    if (nums.length%2==0) {
        for (int i = 0; i < k; i++) {

            if (cursor.val > nums[i]) {
                TreeNode left = new TreeNode(nums[i]);
                cursor.left = left;
                cursor = left;
            } else {
                TreeNode right = new TreeNode(nums[i]);
                cursor.right = right;
                cursor = right;
            }
        }

        cursor = root;

        for (int i = k + 1; i < nums.length; i++) {

            if (cursor.val > nums[i]) {
                TreeNode left = new TreeNode(nums[i]);
                cursor.left = left;
                cursor = left;
            } else {
                TreeNode right = new TreeNode(nums[i]);
                cursor.right = right;
                cursor = right;
            }

        }
    } else {

        TreeNode buffer = new TreeNode(nums[0]);
        if (k==1){
            cursor.left=buffer;
        }
        for (int i = 1; i < k; i++) {

            if (i==1) {
                TreeNode left = new TreeNode(nums[i]);
                left.left= buffer;
                cursor.left = left;
                cursor = left;
                continue;
            }
            if (cursor.val > nums[i]) {
                TreeNode left = new TreeNode(nums[i]);
                cursor.left = left;
                cursor = left;
            } else {
                TreeNode right = new TreeNode(nums[i]);
                cursor.right = right;
                cursor = right;
            }
        }

        cursor = root;

        for (int i = k + 1; i < nums.length; i++) {

            if (cursor.val > nums[i]) {
                TreeNode left = new TreeNode(nums[i]);
                cursor.left = left;
                cursor = left;
            } else {
                TreeNode right = new TreeNode(nums[i]);
                cursor.right = right;
                cursor = right;
            }

        }

    }







    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

