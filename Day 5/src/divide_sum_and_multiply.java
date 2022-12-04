import java.util.Scanner;

public class divide_sum_and_multiply {
    public static int summultiply(int arr[],int n){
//        int substring1[]=new int[n/2];
//        int substring2[]= new int[n/2];
        int ans=0;
        int ans1=0;
      for(int i=0;i<n;i++){
          if(i<n/2){
//              substring1[i]=arr[i];
              ans= ans+arr[i];
          }
          else{
//              substring2[i]=arr[i];
              ans1=ans1+arr[i];
          }
      }
      return ans*ans1;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Ans is :-"+summultiply(arr,n));

    }
}
