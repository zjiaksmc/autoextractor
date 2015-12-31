package edu.usc.cs.autoext.tree;

/**
 * Created by tg on 12/30/15.
 */
public class DefaultEditCost implements EditCost {

    private int insertCost = 1;
    private int removeCost = 1;
    private int replaceCost = 1;
    private int noEditCost = 0;

    @Override
    public double getInsertCost(TreeNode node) {
        return insertCost;
    }

    @Override
    public double getRemoveCost(TreeNode node) {
        return removeCost;
    }

    @Override
    public double getReplaceCost(TreeNode node1, TreeNode node2) {
        return replaceCost;
    }

    @Override
    public double getNoEditCost() {
        return noEditCost;
    }
}
