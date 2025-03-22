public class LinkedList {
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node temp = new Node(value);
        if(length==0){
            head = temp;
            tail = temp;
            length++;
        }
        else{
            tail.next = temp;
            tail=temp;
            length++;
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for(int i=0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public boolean insert(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }

        if(index==length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0) return removeFirst();
        if(index == length-1) return RemoveLast();

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node RemoveLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre=temp;
            temp=temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node temp = new Node(value);
        if(length == 0){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0; i < index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }
        Node temp = head;
        for(int i=0; i < index; i++){
            temp=temp.next;
        }
        temp.value = value;
        return true;
    }

    public void getHead(){
        System.out.println("Head: "+head.value);
    }

    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }

    public void getLength(){
        System.out.println("Length: "+ length);
    }


    public void printElement(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
