class Node {
    int val;
    Node next;
}

class MyLinkedList {
    Node head;
    MyLinkedList() {
      head = null;  
        
    }
    
    public int get(int index) {
        Node cur = head;
        if(cur == null){
            return -1;
        }
        else{
           for(int i=0;i<index && cur!=null;i++){
               cur = cur.next;
           }
            return cur.val;
        }

        
    }
    
    public void addAtHead(int val) {
        Node n = new Node();
        n.val = val;
        if(head != null){
            n.next = head;
            head = n;
        }
        else{
            head = n;
            }
    }

    public void show(){
        System.out.println("show method");
        Node n = head;

        while(n.next != null){
            // System.out.print("inside how method");
            System.out.println(n.val);
            n = n.next;
        }
        System.out.println(n.val);
    }

    public void addAtTail(int val) {
        Node n = new Node();
        n.val =  val;
        Node curr = head;
        if(curr != null){
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = n;
        }
        else{
            head = n;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node prev = head;
        // Node n = new Node();
        // n.val = val;
        if(index ==0 ){
            addAtHead(val);
        }
        else{
            for(int i = 0;i<index-1 && prev!=null;i++){
                prev = prev.next;
            }
            if(prev == null){
                return;
            }
            Node cur = new Node();
            cur.val = val;

            // System.out.println("prev value "+prev.val);

            
            cur.next = prev.next;
            prev.next = cur;
            
        }
    }

    
    public void deleteAtIndex(int index) {
        Node prev = head;
        if(index == 0 ){
            if(prev.next == null){
                head = null;
            }
            else{
                head = prev.next;
            }
        }
        else{
            for(int i = 0;i<index-1 && prev != null ; i++){
                prev = prev.next;
            }
            if(prev.next == null){
                return;
            }
            Node cur = prev.next;
            prev.next = cur.next;
        }
    }
}
public class linked{
    public static void main(String args[]){
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(2);
        obj.deleteAtIndex(1);
        // obj.show();
        // obj.addAtTail(3);
        // // obj.show();
        // obj.addAtIndex(1, 2);
        // // obj.show();
        // System.out.println("after adding "+obj.get(1));
        // obj.deleteAtIndex(0);
        System.out.println("after deleting "+obj.get(0));
        // ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","
        // addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
        // [[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
        // obj.addAtHead(10);
        // obj.addAtHead(20);
        // obj.addAtHead(30);
        // // obj.show();

        // obj.addAtTail(100000);
        // // obj.show();
        // obj.addAtIndex(2,200000);
        // obj.show();
        // System.out.print("deleteing elemnet");
        // obj.deleteAtIndex(2);
        // obj.show();
        // while(obj.next){
        //     System.out.print(obj.val);
        // }
        // for(int i = 0;i<obj;i++){
        //     System.out.println(obj.val);
        // }
        // System.out.println(obj);
        //  int param_1 = obj.get(index);
        //  obj.addAtHead(val);
        //  obj.addAtTail(val);
        //  obj.addAtIndex(index,val);
        //  obj.deleteAtIndex(index);  
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