import java.util.Scanner;

public class Cat_and_mouse {
    public static void catandmouse(int catA,int catB,int Mouse){
        int count=0;
        int count1=0;
        // for catA and mouse;
        if(Mouse>catA){
            for(int i=catA;i<=Mouse;i++){
                count++;
                if(i==Mouse){
                    break;
                }
            }
        }
        else{
            for(int i=Mouse;i<=catA;i++){
                count++;
                if(i==Mouse){
                    break;
                }
            }
        }
        // for catb and mouse;
        if(Mouse>catB){
            for(int i=catB;i<=Mouse;i++){
                count1++;
                if(i==Mouse){
                    break;
                }
            }
        }
        else{
            for(int i=Mouse;i<=catB;i++){
                count1++;
                if(i==catB){
                    break;
                }
            }
        }
        // output
        if(count>count1){
            System.out.println("catB");
        } else if (count==count1) {
            System.out.println("mouse");
        }
        else {
            System.out.println("catA");
        }
    }
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int cata=10;
        int catb=100;
        int mouse=62;
        catandmouse(cata,catb,mouse);
    }
}
