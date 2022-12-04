import javax.swing.colorchooser.ColorChooserComponentFactory;
import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n='C';
       // int n= input.next().charAt(0); // taking input char and type casting into int;
        for(int i=1;i<=n-64;i++){  // complexity is O(n*n);
            for(int j=0;j<i;j++){
                int p=64+i;
                char alphabet= (char)p; // type casting from ascii to char;
                System.out.print(alphabet);
            }
            System.out.println();

//            this code print pattern like
//                    A
//                    BB
//                    CCC
        }
    }
}
