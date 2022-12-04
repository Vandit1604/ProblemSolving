import java.util.Scanner;

public class absolute_difference_of_one {
    public static void absolute(int n){
        int ans= n;
        int length= String.valueOf(n).length();
      //  System.out.println(length);
        int arr1[]=new int[length];
        for(int i=0;i<length;i++){
            arr1[i]=n%10;
            n=n/10;
        }

        for(int i=0;i<length-1;i++){
            if(arr1[i]-arr1[i+1]==1 || arr1[i+1]-arr1[i]==1){
               System.out.println(ans);
            }
        }

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= input.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
             arr[i]=input.nextInt();
        }
        System.out.println("Enter the comparison no.");
        int lessNo= input.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]<lessNo) {
                absolute(arr[i]);
            }
        }

    }
}
