package printing_table_by_user;

import java.util.Scanner;

public class table {
    public static void main(String[] args){
        // code for the table (n*1=n)
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            int b= num*i;
            System.out.println(num+"x"+i+"="+b);
        }

    }
}
