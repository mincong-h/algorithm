class Solution {
    public List<List<Integer>> permute(int[] nums) {
        TreeNode[] roots = new TreeNode[nums.length];

        // Create tree
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int[] seeds = newArr(nums, x);
            roots[i] = new TreeNode(x, seeds);
            fillChildren(roots[i]);
        }

        // Create permutation
        List<List<Integer>> permutations = new LinkedList<>();
        for (TreeNode root : roots) {
            for (List<Integer> p : newPermutations(root)) {
                permutations.add(p);
            }
        }
        return permutations;
    }

    private LinkedList<LinkedList<Integer>> newPermutations(TreeNode root) {
        LinkedList<LinkedList<Integer>> permutations = new LinkedList<>();
        if (root.children == null) {
            LinkedList<Integer> permutation = new LinkedList<>();
            permutation.add(root.val);
            permutations.add(permutation);
            return permutations;
        }
        for (TreeNode child : root.children) {
            for (LinkedList<Integer> p : newPermutations(child)) {
                p.addFirst(root.val);
                permutations.add(p);
            }
        }
        return permutations;
    }

    private void fillChildren(TreeNode root) {
        if (root == null || root.seeds.length == 0) {
            return;
        }
        root.children = new TreeNode[root.seeds.length];
        for (int i = 0; i < root.seeds.length; i++) {
            int s = root.seeds[i];
            int[] newSeeds = newArr(root.seeds, s);
            TreeNode node = new TreeNode(s, newSeeds);
            fillChildren(node);
            root.children[i] = node;
        }
    }

    /**
     * Creates a new array based on array {@code nums},
     * without element with value {@code x}.
     *
     * @param nums the array to be copied
     * @param x the element value to be exclude
     * @return a new array
     */
    private int[] newArr(int[] nums, int x) {
        int[] copy = new int[nums.length - 1];
        int i = 0; // nums
        int j = 0; // copy
        while (i < nums.length) {
            if (nums[i] == x) {
                i++;
            } else {
                copy[j] = nums[i];
                i++;
                j++;
            }
        }
        return copy;
    }

    private static class TreeNode {
        public int val;
        public int[] seeds;
        public TreeNode[] children;

        public TreeNode(int val, int[] seeds) {
            this.val = val;
            this.seeds = seeds;
        }
    }
}
