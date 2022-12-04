#include<stdio.h>
void main()
{
    int i,n;
    int ans=0;
    printf("Enter the size of array:\n");
    scanf("%d",&n);
    int a[n];
    printf("Enter the element of array:\n");
    for(i=0;i<n;i++){
        scanf(" %d",&a[i]);
    }
     for(i=0;i<n;i++){
           ans=ans+a[i];
    }
    printf("sum = %d",ans);

}
