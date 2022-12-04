#include<stdio.h>
void main()
{
    int n,i,a;
    printf("Enter the size of array:\n");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the element of array:\n");
    // input the array element;
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the position of deletion:\n");
    scanf("%d",&a);
    for(i=a;i<n;i++)
    {
        arr[i-1]=arr[i];
    }
    for(i=0;i<n-1;i++)
    {
        printf("%d",arr[i]);
        printf(" ");
    }
}
