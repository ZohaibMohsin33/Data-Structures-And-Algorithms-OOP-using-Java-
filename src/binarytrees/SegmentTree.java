package binarytrees;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        SegmentTree st = new SegmentTree(arr);

        System.out.println(st.rootSum());

        System.out.println(st.query(3,7));

        st.update(3,8);
        System.out.println(st.rootSum());
        System.out.println(st.query(3,7));
    }

    SegmentTree(int[] arr){

        this.root = constructTree(arr,0,arr.length-1);
    }

    public Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node node = new Node(start,end);
            node.data = arr[start];
            return node;
        }

        Node node = new Node(start,end);
        int mid = start + (end-start)/2;

        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);
        node.data = node.left.data + node.right.data;

        return node;
    }

    public int rootSum (){
        return root.data;
    }

    public int query(int start, int end){
        return this.query(this.root,start,end);
    }

    private int query(Node node,int qsi,int qei){

        if(qei<node.startIndex || qsi>node.endIndex)
            return 0;

        if(node.startIndex >=qsi && node.endIndex<=qei)
            return node.data;

        return query(node.left,qsi,qei) + query(node.right,qsi,qei);
    }

    public void update (int index,int val){
        this.root.data = this.update(root,index,val);
    }

    private int update(Node node, int i,int val){

        if(i >= node.startIndex && i <= node.endIndex){
            if(node.startIndex == i && node.endIndex == i){
                node.data = val;
                return node.data;
            }
            else{
                int left = update(node.left,i,val);
                int right = update(node.right,i,val);

                return left+right;
            }
        }

        else{
            return node.data;
        }
    }


    Node root;
    private class Node{
        int data;
        int startIndex;
        int endIndex;

        Node left;
        Node right;

        Node(int startIndex,int endIndex){
            this.startIndex = startIndex;
            this.endIndex   = endIndex;
        }
    }


}
