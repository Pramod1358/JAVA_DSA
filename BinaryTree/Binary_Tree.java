package BinaryTree;

import java.util.*;


public class Binary_Tree {
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;
        public static node Buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            node nn=new node(nodes[idx]);
            nn.left=Buildtree(nodes);
            nn.right=Buildtree(nodes);
            return nn;
        }
    }
    public static void inorder(node root){
        if(root == null){
            System.out.print(" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(node root){
        if(root == null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
       
        while(!q.isEmpty()){
            node curr=q.remove();
            if(curr == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }
    public static int height(node root){
        if(root == null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight, rightheight)+1;
    }
    public static int countofnodes(node root){
        if(root == null){
            return 0;
        }
        int left=countofnodes(root.left);
        int right=countofnodes(root.right);
        return left+right+1;
    }
    public static int sumofnodes(node root){
        if(root == null){
            return 0;
        }
        int left=sumofnodes(root.left);
        int right=sumofnodes(root.right);
        return  left+right+root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree bt=new BinaryTree();
        // node root=bt.Buildtree(nodes);
        // int a=sumofnodes(root);
        // System.out.println(a);
        node root = bt.Buildtree(nodes);
        preorder(root);

    }
}
