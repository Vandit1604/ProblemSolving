import java.util.Scanner;

public class illuminate_the_room_problem {
    public static int roomlight(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = input.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the length of the candles");
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("room inlight :- " + roomlight(arr, n) +" days");
        }

}


