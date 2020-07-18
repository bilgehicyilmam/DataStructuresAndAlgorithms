package algorithms;

public class BinarySearchTree {
	
		private static TreeNode root;

		public BinarySearchTree() {
			root=null;
		}
		 
		public class TreeNode {
			private int data;
			private TreeNode left;
			private TreeNode right;

		    public TreeNode(int data) {
			this.data=data;
			left=right=null;
			}     
		}

		public void add(int value) {  //add nodes to tree with the given value
			root=add(root, value);
		} 
		
		private TreeNode add(TreeNode root, int value) {
			if (root == null) {
				root = new TreeNode(value);
			}else if (value <= root.data) {
				root.left = add(root.left, value);
			}else { 
				root.right = add(root.right, value);
			}
			return root;
		}
		
		public void remove(int value) {  // removes node from tree with the given value
			root= remove(root,value);
		}
		
		private TreeNode remove(TreeNode root, int value) {
			if(root==null) {
				return null;
			}else if(value<root.data) {
				root.left=remove(root.left, value);
			}else if(value>root.data){
				root.right = remove(root.right, value);
			}else if (value==root.data){
				if(root.left==null && root.right==null) { //node has no child
					root=null;
				}else if(root.left!=null && root.right==null) { //node has only left child
					root=root.left;
				}else if(root.right!=null && root.left==null) { // node has only right child
					root=root.right;
				}else if (root.left!=null && root.right!=null) { //node has two children
					int minValue=min(root.right); //find minimum value of right, to change with the root
					root.data=minValue; //change root data with minimum value of right
					root.right=remove(root.right,minValue); // call remove method to delete node
				}
			}
			return root;
		}
		
		private int min(TreeNode root) {  // returns minimum value in right part of tree
			if (root.left == null) {
				return root.data;
			}
			return min(root.left);
		}

		public boolean search(int value) { // returns true or false if the given value is in 
			return search(root,value);     // tree or not
		}
		
		private boolean search(TreeNode root,int value) { 
			if(root==null) {
				return false;
			}else if(value==root.data) {
				return true;
			}else if(value<root.data) {
				return search(root.left, value);
			}else if(value>root.data) {
				return search(root.right, value);
			}
			return false;
		}
		
		
		public void inPrint(){  //prints out BinarySearchTree in ascending order
			inPrint(root);
		}
		
		private void inPrint(TreeNode root) {
			if(root!=null) {
				inPrint(root.left);
				System.out.print(root.data + " ");
				inPrint(root.right);
			}
		}
		
		public int size() {   // returns total number of nodes in tree
			return size(root);
		}
		
		private int size(TreeNode root) {
			if(root==null) {
				return 0;
			}else {
				return 1 + size(root.left) + size(root.right);
			}
		}
		
		
	    public static void main(String[] args) {
	    	 
	    	BinarySearchTree tree=new BinarySearchTree();
	    	tree.add(10);
	    	tree.add(20);
	        tree.add(30);
	        tree.add(40);
	        tree.add(50);
	        tree.add(90);
	        tree.add(100);
	        tree.add(70);
	        tree.add(5);
	        tree.add(80);
	        System.out.println("Size of the BinarySearchTree is: " + tree.size());
	        System.out.println("Is the value " + 5 + " in the tree? " + tree.search(5));
	        System.out.println("Please remove the value 30 from BinarySearchTree!");
	        tree.remove(root,30);
	        System.out.println("Is the value " + 30 + " in the tree? " + tree.search(30));
	        System.out.print("BinarySearchTree in ascending order is: ");
	        tree.inPrint();
	}
}
		
		
