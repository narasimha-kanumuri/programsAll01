import java.util.Scanner;
import static java.lang.System.out;

class HelloWorld{
	
	public static void staticMethod(){
        System.out.println("Static Example!");
	}
	public void nonStaticMethod(){
		System.out.println("Non Static Example!");
	} 
    public void takeInput(String ch){
        Scanner sc;
        sc = new Scanner(System.in);

        switch(ch.toLowerCase()){
            case "int": sc.nextInt();
                        break;
            case "string": sc.nextLine();
                            break;
            case "Double": sc.nextDouble();
                            break;
            case "Float" : sc.nextFloat();
                            break;
            case "Boolean": sc.nextBoolean();
                            break;
            default: break;
        }
        sc.close();
    }
    
	public static void main(String args[]){
		out.printf("%s\n","Welcome to Main");
		
		HelloWorld.staticMethod();
		
		HelloWorld ref;
		ref = new HelloWorld();
		ref.nonStaticMethod();

        System.out.println("\nEnter the data data type you want to enter\n");
        
        ref.takeInput("STRING");
        
        System.out.println(type);

	}
}
/*
Two Ways to access methods
1. ClassName.methodName() 
	- only for static methods
2. ClassName ref = new ClassName();
		ref.methodName();
	- For all non-static methods
*/