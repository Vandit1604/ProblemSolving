#include<stdio.h>
void main()
{
    int n,a,i;
    int arr[5];
    printf("Enter the array element:\n");
     for(i=0;i<5;i++)
    {
       scanf("%d",&arr[i]);
    }
    printf("Enter the element to replace:\n");
    scanf("%d",&a);
    printf("Enter the position at element is replace:\n");
    scanf("%d",&n);

    arr[n-1]=a;
     for(i=0;i<5;i++)
    {
       printf("%d",arr[i]);
       printf(" ");
    }

}
