package com.company;

public class DecompositionTask8 {

     static void builder(int[] array, int[] tree, int v, int lr, int tr) {

        if (lr == tr) {

            tree[v] = array[lr];

        } else {
            int tm = (lr + tr) / 2;
            builder(array, tree, 2 * v + 1, lr, tm);
            builder(array, tree,2 * v + 2, tm + 1, tr);
            tree[v] = tree[2 * v + 1] + tree[2 * v + 2];

        }


    }

    public static int[] buildSegmentTree(int[] array) {
        // Complete to power of 2
        // int n = 1 << (int) (Math.log(array.length - 1) + 1);
        // P.S.  I allocate empirically 4 * n + 4 memory where n is length of array. At least it's still linear memory
        int[] tree = new int[4 * array.length + 4];
        builder(array, tree, 0, 0, array.length - 1);

        return tree;
    }

    // l and r are query
    // lr and tr are bounds of current segment
    public static int getSum(int[] tree, int v, int l, int r, int lr, int tr) {
         if (l <= lr && tr <= r) {
             return tree[v];
         }

         if (tr < l || r < lr) {
             return 0;
         }

         int tm = (lr + tr) / 2;

         return getSum(tree, 2 * v + 1, l, r, lr, tm) + getSum(tree, 2 * v + 2, l, r, tm + 1, tr);
    }
    void update(int[] array, int[] tree, int i, int v, int lr, int tr, int val) {
         // If we are in leaf we just switch value in array and leaf of segment tree.
         if(i == lr && i == tr) {
             array[i] = val;
             tree[v] = val;
         }
        // If we are out of left or right boundary, we just skip this step and go further by tree
        if (tr < i || i < lr) {
            return;
        }

        int tm = (lr + tr) / 2;
        // Go to descendants and repeat previous procedure. Firstly recursion will unwrap and then sums will be recalculated
        update(array, tree, i, v * 2 + 1, lr, tm, val);
        update(array, tree, i,v * 2 + 2, tm + 1, tr, val);
        tree[v] = tree[v * 2 + 1] + tree[v * 2 + 2];
    }

    public static void main(String[] args) {

         int[] testArray = new int[] {8, 0, 3, 10, 9, 4, 9, 5, 6, 6, 9, 7, 6, 3, 4};
         int[] segTree = buildSegmentTree(testArray);
         System.out.println(getSum(segTree, 0, 1, 3, 0, testArray.length - 1));
         System.out.println(getSum(segTree, 0, 0, 2, 0, testArray.length - 1));
         System.out.println(getSum(segTree, 0, 0, 14, 0, testArray.length - 1));

    }
}
