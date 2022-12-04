#include<stdio.h>
void main()
{
    int i,a,n;
    printf("Enter the size of array:\n");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the element of array:\n");
    // input the array element;
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the deletion position :");
    scanf("%d",&a);
    //
    for(i=0;i<n-1;i++)
    {
        if(i>=a-1)
        {
            arr[i]=arr[i+1];
        }
    }
    for(i=0;i<n-1;i++)
    {
        printf("%d",arr[i]);
        printf(" ");
    }
}


