public class LinkedListInsertAfterValue {
    public static void main(String...args){
        LinkedList l1 = new LinkedList(10);
        LinkedList l2 = new LinkedList(100);

        l1.insertAfterValue(10, 20);
        l1.insertAfterValue(10, 30);
        l1.insertAfterValue(10, 40);
        l1.insertAfterValue(40, 50);

        l1.display();

        l2.insertAfterValue(100, 200);
        l2.insertAfterValue(100, 300);
        l2.insertAfterValue(100, 400);
        l2.insertAfterValue(400, 500);

        l2.display();

    }
}

class sll{
    int data;
    sll next;
    sll(int data, sll next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    sll head;
    sll newNode;

    LinkedList(int data){
        this.newNode = null;
        this.createNode(data);
        this.head = this.newNode;
        this.newNode = null;
    }

    public void createNode(int data){
        this.newNode = new sll(data,null);
    }

    public void insertAfterValue(int key,int data){
        this.createNode(data);
        //temp != null covers the case if list is empty

        //Search for key
        sll temp = this.head;
        while(temp != null && temp.data != key){
            temp = temp.next;
        }

        //check if key exists
        if(temp != null){
            this.newNode.next = temp.next;
            temp.next = this.newNode;
        }else {
            System.out.printf("%s NOT FOUND",key);
        }
    }

    public void display(){
        sll temp = this.head;

        while(temp != null){
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}