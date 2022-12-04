#include<stdio.h>
void main()
{
    int a,n,i,arr[5],arr1[5+1],t,k=0;
    printf("Enter the sorted array:\n");
    for(i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to be inserted:\n");
    scanf("%d",&a);
    if(a>0)
    {
        for(i=0;i<5;i++)
        { k++;
            if(a<arr[i])
            {
                t=arr[i];
                arr1[i]=a;
                break;
            }

            else{
                arr1[i]=arr[i];
            }

    }
    }

    for(i=k;i<=5;i++)
    {
        arr1[i]=arr[i-1];
    }

    for(i=0;i<5+1;i++)
    {
        printf("%d",arr1[i]);
        printf(" ");
    }

}
