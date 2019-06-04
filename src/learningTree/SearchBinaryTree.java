package learningTree;
/**
 *
 * @author aaronyang
 */
public class SearchBinaryTree {
    
    public static void main(String[] args) {
        
    }
    
    class TreeNode{
        private int key;
        private TreeNode leftChild;
        private TreeNode rightChild;
        private TreeNode parent;
        private int data;
        
        public TreeNode(int key, int data){
            super();
            this.key = key;
            this.data = data;
            this. leftChild = null;
            this.rightChild = null;
            this.parent = null;
        }

        public int getKey() {
            return key;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public TreeNode getParent() {
            return parent;
        }

        public int getData() {
            return data;
        }  
        
    }
    
    private TreeNode root;
    
    public SearchBinaryTree(){}
    
    public TreeNode put(int data){
        
        TreeNode node = null;
        TreeNode parent = null;
        
        if(root == null){
            node = new TreeNode(0, data);
            root = node;
            return node;
        }
        
        while( node != null ){
            parent = node;
            if( data > node.data ){
                node = node.rightChild;
            } else {
                node = node.leftChild;
            }
        }
        
        node = new TreeNode(0, data);
        if(data < parent.data){
            parent.leftChild = node;
        } else {
            parent.rightChild = node;
        }
        return node;
    }
}
