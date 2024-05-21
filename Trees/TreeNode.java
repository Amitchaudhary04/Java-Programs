package Trees;
import java.util.*;
public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }
    public void addChild(TreeNode node){
        this.children.add(node);
    }
    public String print(int level){
        String ret;
        ret = " ".repeat(level) + data + "\n";

        for(TreeNode node : this.children){
            ret += node.print(level+1);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode beers = new TreeNode("Beer");
        TreeNode tea = new TreeNode("Tea");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(beers);
        System.out.println(drinks.print(0));
    }
}
