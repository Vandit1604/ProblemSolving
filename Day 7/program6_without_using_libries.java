import java.util.Scanner;

public class program6_without_using_libries {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=input.nextLine();
        System.out.println("Enter the second string");
        String str2=input.nextLine();
        int determinor1=0;
        int determinor2=0;
        int count=0;
        int count1=0;
        for(char c: str1.toCharArray()){
            count++;
        }
        for(char c: str2.toCharArray()){
            count1++;
        }
        if(count>count1){
            System.out.println(str1+" is greater than "+ str2);
        }
        else if(count<count1){
            System.out.println(str2+" is greater than "+str1);
        }
        else{
            for(int i=0;i<count;i++){
                determinor1=determinor1+(int)str1.charAt(i);
                determinor2=determinor2+(int)str2.charAt(i);
            }
            if(determinor1==determinor2){
                System.out.println("Both string is equal");
            }
            else{
                System.out.println("Both string is not equal");
            }
        }

    }
}
