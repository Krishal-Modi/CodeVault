#include<stdio.h>

int main(){
    int i,j,k;
    
    // Upper part of X
    for(i=5;i>=1;i--){
        for(j=5;j>i;j--){
            printf(" ");
        }
        for(k=1;k<(i*2);k++){
            if(k==1 || k==(i*2)-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n"); 
    }   
    
    // Lower part of X
    for(i=2;i<=5;i++){
        for(j=5;j>i;j--){
            printf(" ");
        }
        for(k=1;k<(i*2);k++){
            if(k==1 || k==(i*2)-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n"); 
    }   
    
    return 0;
}

