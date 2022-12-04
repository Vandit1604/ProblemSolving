public class printing_pattern_6_usingLoop2 {
    public static void main(String[] args) {
        int n=4;
        int revtraversing_val=0;
        int d=0;
        // printing desire pattern code of complexity O(n^2+n+n);
        for(int i=0;i<n;i++){
            for(int j=0;j<=(n-1);j++){
                if(j<(n-1)-d){
                    System.out.print(" ");
                }
            }
            for(int j=0;j<1+d;j++){
                revtraversing_val =1+j+d;
                System.out.print(revtraversing_val);
            }
            for(int j=0;j<d;j++){
                System.out.print(revtraversing_val-1);
                revtraversing_val--;
            }
            d++;
            System.out.println();
        }
    }
}
