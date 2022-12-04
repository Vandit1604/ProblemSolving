#include<stdio.h>
void main()
{
    int i,n,t;
    printf("Enter the size of array:\n");
    scanf("%d",&n);
    int a[n];
    printf("Enter the element of array:\n");
    for(i=0;i<n;i++){
        scanf(" %d",&a[i]);
    }
    // bubble sorting
    for(i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++)
        {
            if(a[i]>a[i+1]){
                t = a[i];
                a[i]=a[i+1];
                a[i+1]= t;
            }
        }
    }
    // output
    printf("max no.=%d",a[n-1]);
}
