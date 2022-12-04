public class printing_patter_4 {
    public static void main(String[] args) {
        // for printing the given pattern row(i)=4;
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                int n= 64+i+j;
                char alphabet=(char)n;// type casting from ascii to char;
                System.out.print(alphabet);
            }
            System.out.println();
        }
    }
}
