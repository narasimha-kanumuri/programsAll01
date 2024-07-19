
interface MyInterface { }
class Parent { }
class Child extends Parent implements MyInterface { }


public class Program_008 {

    public int[] prefixPostfix(int number) {
        int temp = number;
        int[] arr = new int[4];

        arr[0] = ++temp;
        temp = number;

        arr[1] = --temp;
        temp = number;

        arr[2] = temp++;
        temp = number;

        arr[3] = temp--;

        return arr;
    }

    public Boolean[] instanceofDemo() {
        Parent obj1= new Parent();
        Child obj2 = new Child();
        Parent obj3 = new Child();

        Boolean[] arr = new Boolean[9];

        arr[0] = obj1 instanceof Parent;
        arr[1] = obj1 instanceof Child;
        arr[2] = obj1 instanceof MyInterface;

        
        arr[3] = obj2 instanceof Parent;
        arr[4] = obj2 instanceof Child;
        arr[5] = obj2 instanceof MyInterface;

        arr[6] = obj3 instanceof Parent;
        arr[7] = obj3 instanceof Child;
        arr[8] = obj3 instanceof MyInterface;

        return arr;
    }


    public void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }

    //Method Overloading - Data type
    public void printArray(Boolean[] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        for (int i = 3; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 6; i < 9; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Program_008 op = new Program_008();
        //int[] arr = op.prefixPostfix(10);
        //op.printArray(arr);
        op.printArray(op.instanceofDemo());

    }
}
