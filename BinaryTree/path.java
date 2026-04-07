package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class path 
{
    static class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
    
     static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> allPaths(TreeNode root) {
        dfs(root);
        return result;
    }

    private static List<List<Integer>> dfs(TreeNode node) {
        List<List<Integer>> paths = new ArrayList<>();
        if (node == null) return paths;

        // single node path
        paths.add(new ArrayList<>(List.of(node.val)));
        result.add(new ArrayList<>(List.of(node.val)));

        // get downward paths
        List<List<Integer>> left = dfs(node.left);
        List<List<Integer>> right = dfs(node.right);

        // extend left paths
        for (List<Integer> l : left) {
            List<Integer> newPath = new ArrayList<>();
            newPath.add(node.val);
            newPath.addAll(l);
            paths.add(newPath);
            result.add(new ArrayList<>(newPath));
        }

        // extend right paths
        for (List<Integer> r : right) {
            List<Integer> newPath = new ArrayList<>();
            newPath.add(node.val);
            newPath.addAll(r);
            paths.add(newPath);
            result.add(new ArrayList<>(newPath));
        }

        // combine left + node + right
        for (List<Integer> l : left) {
            for (List<Integer> r : right) {
                List<Integer> full = new ArrayList<>();
                Collections.reverse(l);
                full.addAll(l);
                full.add(node.val);
                full.addAll(r);
                result.add(full);
                Collections.reverse(l); // restore
            }
        }

        return paths;
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        //     1
        //    / \
        //   2   3
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        root.right = new TreeNode(3);
        root.left = b;
        b.left = c;

        List<List<Integer>> paths = allPaths(root);

        for (List<Integer> p : paths) {
            System.out.println(p);
        }
    }
}
