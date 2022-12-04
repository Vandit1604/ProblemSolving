public class printing_pattern_5 {
    public static void main(String[] args) {
       // variable and i is specified;
        for(int i=69;i>=65;i--){
            for(int j=0;j<70-i;j++){
                int n=i+j;
                char alphabet = (char)n;// typecasting from ascii to char;
                System.out.print(alphabet);
            }
            System.out.println();
        }
    }
}
