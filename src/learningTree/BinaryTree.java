
package learningTree;

/**
 *
 * @author aaronyang
 */
public class BinaryTree<T> {
    
    /*----------nested TreeNode class----------*/
    public class TreeNode<T>{
        private int index;
        private T data;
        private TreeNode leftChild;
        private TreeNode rightChild;
        
        public TreeNode(int index, T data){
            this.index = index;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
        
        public int getIndex(){
            return index;
        }
        
        public T getData(){
            return data;
        }

    } /* --------- end of nested class ------------ */
    
    private TreeNode<String> root = null;
    
    public BinaryTree(){
        root = new TreeNode(1, "A");
    }
    
    public void createBinaryTree(){
        TreeNode nodeB = new TreeNode(2, "B");
        TreeNode nodeC = new TreeNode(3, "C");
        TreeNode nodeD = new TreeNode(4, "D");
        TreeNode nodeE = new TreeNode(5, "E");
        TreeNode nodeF = new TreeNode(6, "F");
        root.leftChild = nodeB;
        root.rightChild = nodeC;
        nodeB.leftChild = nodeD;
        nodeB.rightChild = nodeE;
        nodeC.rightChild = nodeF;
    }
    
    /* return the height of the tree */
    public int getHeight(TreeNode node){
        if(node == null)
            return 0;
        else{
            int i = getHeight(node.leftChild);
            int j = getHeight(node.rightChild);
            return ( i < j )? j + 1 : i + 1;
        }
    }
    public int getHeight(){
        return getHeight(root);
    }
    
    /* get number of nodes */
    public int getSize(){
        return getSize(root);
    }
    private int getSize(TreeNode node){
        if(node == null)
            return 0;
        else{
            return 1 + getSize(node.leftChild) + getSize(node.rightChild);
        }
    }
    
    /* preorder traversal: recursion */
    public void preOrder(TreeNode<String> node){
        if(node == null)
            return;
        else{
            System.out.println("preOrder data: " + node.getData());
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }
    
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("treeHeight: " + binaryTree.getHeight());
        System.out.println("treeSize: " + binaryTree.getSize());
        binaryTree.preOrder(binaryTree.root);
    }
    
    
    
}
