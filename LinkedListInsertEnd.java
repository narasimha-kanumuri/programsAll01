class LinkedListInsertEnd{
    public static void main(String args[]){
        SingleLinkedList ll = new SingleLinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);

        ll.display();
    }
}

class sll{
    int data;
    sll next;

    sll(int data,sll next){
        this.data = data;
        this.next = next;
    }
}

class SingleLinkedList{
    sll newNode;
    sll head;
    SingleLinkedList(){
        this.head = null;
        this.newNode = null;
    }

    void createNode(int data){
        this.newNode = new sll(data,null);
    }

    void insertAtEnd(int data){
        if(this.head == null){
            this.createNode(data);
            this.head = this.newNode;
        }
        else{
            sll temp;
            temp = this.head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = this.newNode;
        }
    }

    void display(){
        sll temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

