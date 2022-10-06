class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;
        
        Node(int val){
            this.val = val;
            this.prev = null;            
            this.next = null;
        }
    }
    
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
        
    }
    
    public int get(int index) {
        //if(empty list)
        if(head == null)
            return -1;
        
        //else if(invalid index)
        else if(index<0 || index>=size)
            return -1;
        
        //elseif(1st val)
        else if(index == 0)
            return head.val;
        
        //else if(last val)
        else if(index == size-1)
            return tail.val;
        
        //else(return val)
        else{
            Node temp = head;
            for(int i=0; i<index; i++)
                temp = temp.next;
            return temp.val;
        }
    }
    
    
    
    public void addAtHead(int val) {
        Node node = new Node(val);

        //if(empty list)
        if(head == null){
            head = tail = node;
            size++;
            return;
        }
        
        //else(add node at head)
        else{
            head.prev = node;
            node.next = head;
            head = node;
            size++;
            return;
        }
        
    }
    
    
    
    public void addAtTail(int val) {
        Node node = new Node(val);

        //if(empty list)
        if(head == null){
            head = tail = node;
            size++;
            return;
        }
        
        //else(add node at tail)
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
            return;
        }
        
        
    }
    
    
    
    public void addAtIndex(int index, int val) {
        
        //if(invalid index)
        if(index<0 || index>size){
            return;
        }
        
        //else if(add at head)
        else if(index == 0)
            addAtHead(val);
        
        //else if(add at tail)
        else if(index == size)
            addAtTail(val);
        
        //else(add at index)
        else{
            Node node = new Node(val);
            Node temp = head;
            size++;
            for(int i=0; i<index-1; i++)
                temp = temp.next;
            temp.next.prev = node;
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            return;
        }
        
    }
    
    
    
    public void deleteAtHead(){
        //if(empty list)
        if(head == null)
            return;
        
        //else if(only one element)
        else if(head.next == null){
            head = tail = null;
            size--;
            return;
        }
        
        //else(delete at head)
        else{
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        
    }
    
    
    
    public void deleteAtTail(){
        //if(empty list)
        if(head == null)
            return;
        
        //else if(only one element)
        else if(head.next == null){
            head = tail = null;
            size--;
            return;
        }
        
        //else(delete at tail)
        else{
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
    }
    
    
    
    public void deleteAtIndex(int index) {
        //if(invalid index)
        if(index<0 || index>=size)
            return;
        
        //else if(delete at head)
        else if(index == 0)
            deleteAtHead();
        
        //else if(delete at tail)
        else if(index == size-1)
            deleteAtTail();
        
        //else(delete at index)
        else{
            Node temp = head;
            size--;
            for(int i=0; i<index-1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            temp.next.prev = temp;
            return;
        }
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