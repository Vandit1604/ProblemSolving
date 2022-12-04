import java.util.Scanner;

public class finding_mean_median_of_five_number {
    public static void mean(int arr[],int n){
        int ans= 0;
        for(int i=0;i<n;i++){
            ans=ans+arr[i];
        }
        System.out.println("mean:-"+ans/2);
    }
    public static void median(int arr[],int n){
        int ans=0;
        int pos= (n+1)/2;
        if(n%2==0){
            for(int i=0;i<2;i++){
               ans=ans+arr[pos+i-1];
            }
            System.out.println("median is:-"+ans/2);
        }
        else{
            System.out.println("median is:-"+arr[pos-1]);
        }

    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        System.out.println("Enter the 5 no. for mean and median");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        mean(arr,n);
        median(arr,n);
    }
}
