public class Q4
{

    public static void hello(int size){
        for(int i=0; i<size; i++){
            
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int size = 5;
		hello(size);
	}
}
