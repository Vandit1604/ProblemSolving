#include<stdio.h>
#include<string.h>
void main()
{
    int basic,hra,da,allow,pf,totalSalary;
    char n;
    printf("Enter the basic salary:\n");
    scanf("%d/n",&basic);
    printf("Enter the grade in capital:\n");
    scanf(" %c",&n);
    //fgets(n,sizeof(n),stdin);
   // scanf("%c",&n);
    hra = basic/5;
    da= basic/2;
    pf = (11*basic)/100;
    if(n=='A'){
        totalSalary= (basic+hra+da-pf)+1700;
        printf("%d",totalSalary);
    }
    else if(n=='B'){
        totalSalary = (basic +hra +da-pf)+1500;
        printf("%d",totalSalary);
    }
    else if(n=='C'){
        totalSalary = (basic+hra+da-pf)+1300;
        printf("%d",totalSalary);

    }


}
