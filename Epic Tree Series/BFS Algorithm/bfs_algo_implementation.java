import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_algo_implementation {

    class TreeNode<E>{
        TreeNode left;
        TreeNode right;
        E data;

        //constructor
        public TreeNode(E data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    

    public static void main(String[] args) {

        bfs_algo_implementation tree = new bfs_algo_implementation();
        TreeNode<Integer> root = tree.new TreeNode<>(1);
        root.left = tree.new TreeNode<>(2);
        root.right = tree.new TreeNode<>(3);
        root.left.left = tree.new TreeNode<>(4);
        root.left.right = tree.new TreeNode<>(5);

        ArrayList<Integer> result = tree.BFS(root);
        System.out.println(result);

    }
    public ArrayList<Integer> BFS(TreeNode<Integer>root){
        ArrayList<Integer> res = new ArrayList<>();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> node = queue.poll();
            res.add(node.data);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }

        return res;
        
    }
}