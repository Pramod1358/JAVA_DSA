package BinaryTree;
public class BST1 {
    static class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data = data;
    }
}
    public static node Buildtree(node root,int val){
        if(root == null){
            root = new node(val);
            return root;
        }

        if(val < root.data){
            root.left = Buildtree(root.left, val);
        }
        else{
            root.right = Buildtree(root.right, val);
        }
        return root;
    }
    public static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static boolean search(node root , int val){
        if(root == null){
            System.out.println("Not found");
            return false;
        }
        if(root.data == val){
            System.out.println("Found");
            return true;
        }

        if(root.data > val){
            search(root.left, val);
        }
        else{
            search(root.right, val);
        }
        return false;
       
    }
    public static node delete(node root , int val){
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }

        else{
            //case 1
            if(root.right == null && root.left == null){
                return null;
            }
            //case 2
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            //case 3
            else{
                node is=inOrderSuccesor(root.right);
                root.data = is.data;
                root.right = delete(root.right, is.data);

            }
        }
        return root;

    }
    public static node inOrderSuccesor(node root){

        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
     public static int height(node root){
        if(root == null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight, rightheight)+1;
    }
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right);
        return Math.max(diam3, Math.max(diam2, diam1)) + 1;

    }
    public static void main(String[] args) {
        int val[]={5 , 3 ,2 ,1 };
        node root = null;
        for(int i=0;i<val.length;i++){
           root=  Buildtree(root , val[i]);
        }
        inorder(root);
        if(search(root, 1)){
            System.out.println("Found");
        }
        root = delete(root, 5);
        inorder(root);
        int a = diameter(root);
        System.out.println("Diameter :"+a);
    }
}
