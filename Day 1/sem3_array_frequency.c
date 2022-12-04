#include<stdio.h>
void main()
{
    int a[5]={3,5,2,2,5};//frequency array{1,2,3,3,2,2,3}
    int c;
    int f[5];
    int v=-1;
    for(int i=0;i<5;i++)
    {
        c=1;
        for(int j=i+1;j<5;j++){
            if(a[i]==a[j]){
                f[j]=v;
                c++;
            }
            if(f[i]!=v){
                f[i]=c;
            }
        }
        for(i=0;i<5;i++){
                if(f[i]!=v){
        printf("frequency of %d is: %d\n",a[i],c);
                }
        }
}
}
