import java.util.Scanner;

public class printing_pattern_18 {
    public static void main(String[] args) {
        // triangle shrinking downward;
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter the name: ");
//        String name = input.next();
        String name="Geeks";
        System.out.println(name);
      for(int i=1;i<name.length();i++){
          for(int j=1;j<=i;j++){
              System.out.print(".");
          }
          for(int j=i;j<name.length();j++){
              System.out.print(name.charAt(j));
          }
          System.out.println();
      }

    }
}
