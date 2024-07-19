import java.util.Scanner;

class ArrayLeftRotation{
    
    public void printArray(int[] arr, int size){
        for(int i=0;i<size;i++){
            System.out.printf("%d ",arr[i]);
        }
    } 

    public int[] leftRotate(int[] arr,int size,int d){
        int[] ans = new int[size];
        int i; 
        for(i = d; i < size;i++ ){
            ans[i-d] = arr[i];
        }
        for(int j=0;j < d;++j,++i){
            ans[i-d] = arr[j];
        }
        return ans;
    }
    public static list

    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayLeftRotation obj;
        obj = new ArrayLeftRotation();
        int[] ans;
        ans = obj.leftRotate(arr, size, d);
        obj.printArray(ans,size);
    }       
}