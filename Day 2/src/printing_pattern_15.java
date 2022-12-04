public class printing_pattern_15{
    public static void main(String[] args) {
        // look and say pattern;
        int n=3;
        int a=1;
        int k=0;
        int arr[]= new int[10];
        for(int i=1;i<=n;i++){
            int count =0;
            for(int j=1;j<=2;j++){
                if(a==j){
                    count++;
                    arr[k]=j;
                    arr[k+1]=j;
                    //System.out.print(j+" "+count);
                    k++;
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
}
