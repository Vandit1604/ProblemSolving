import java.util.Scanner;

public class problem_1 {
       // ishaan loves the chocolate
    public static int ishaanloves(int arr[],int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= input.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the chocolate numbers.");
        for(int i=0;i<n;i++){
           arr[i]=input.nextInt();
        }
        System.out.println("here your chocolate number sis:- "+ishaanloves(arr,n));
    }
}
