# recursive - java solution 

# Complexity
- Time complexity: O(h)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(h)
h is the height of BST
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            TreeNode cur = root.right; 
            while(cur.left != null ) {
                cur = cur.left;
            }
            root.val = cur.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
}
```