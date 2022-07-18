public List<Integer> preorderTraversal1(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    dfs(root, ret);
    return ret;
}

private void dfs(TreeNode root, List<Integer> ret) {
    if (root != null) {
        ret.add(root.val);
        dfs(root.left, ret);
        dfs(root.right, ret);
    }
}
