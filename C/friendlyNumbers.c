#include<stdio.h>

int sumOfFactors(int);
int isFriendlyPair(int, int);

int main(void){
    
    if(isFriendlyPair(6,28))
        printf("Yes");
        else printf("No");
    return 0;

}

int isFriendlyPair(int x, int y){
    return ((sumOfFactors(x) / x) == (sumOfFactors(y) / y));

    //return ((sumOfFactors(x) / x) == (sumOfFactors(y) / y)) ? 1 : 0;
}

int sumOfFactors(int x){
    int sum = 1 + x;
    for (int i = 2; i <= (int) x/2; i++){
        if(x % i == 0)
            sum += i;
    }
    return sum;
}