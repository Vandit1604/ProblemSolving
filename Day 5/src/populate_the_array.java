import java.util.Scanner;

public class populate_the_array {
    public static int  populateTheArray(int arr[],int n){
        int j=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                arr[j]=i;
                j++;
            }
            else{
                System.out.print(i+" ");
            }
        }
        return j;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input ");
        int n= input.nextInt();
        int arr[]=new int[n];
       int even= populateTheArray(arr,n);
       for(int i=even;i>0;i--){
           System.out.print(arr[i-1]+" ");
       }

    }
}
