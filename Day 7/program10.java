import java.util.Scanner;

public class program10 {
    public static void frequency(String name) {
        StringBuilder sb=new StringBuilder(name);
        for(int i=0;i<sb.length();i++) {
            char sample = sb.charAt(i);
            int count = 0;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == sample) {
                    count++;
                    sb.setCharAt(j, '0');
                }
            }
            if (sample == '0') {
                    continue;
            }
            else {
                System.out.println(sample + ":" + count);

            }
        }
    }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the string ");
           String name = input.nextLine();
            System.out.println("frequencies are:");
            frequency(name);
        }
    }
