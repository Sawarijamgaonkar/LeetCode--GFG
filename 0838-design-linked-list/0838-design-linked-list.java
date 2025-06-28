class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
    public Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}
class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp=head;
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<=0){
            addAtHead(val);
            return;
        }
        if(index>size){
            return;
        }
        Node temp=head;
        Node newNode=new Node(val);
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 ||index>=size ||head==null){
            return;
        }
        if(index==0){
            head=head.next;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            if(temp.next!=null){
                temp.next=temp.next.next;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */