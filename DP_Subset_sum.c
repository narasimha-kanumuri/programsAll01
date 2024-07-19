//Tabulation
//Memoizatio


//Subset Sum Problem
/*
Input: 
arr = {3,1,8,2,4,7,5}, sum = 9
Output: True
Explanation: 
Possible subsets:
{7,2},{8,1},{5,4}{3,2,4},{1,3,5}
*/

#include<stdio.h>

int sub_sum(int sum,int arr[],int len){
    int possible_sum[sum + 1];
    possible_sum[0] = 1;

    for(int i = 0; i < len;i++){

        for(int j = sum; j >= arr[i]; j--){
            if(possible_sum[j - arr[i]] == 1){
                possible_sum[j] = 1;
            }
        }
    }

}

int main(void){
    int arr[] = {3,1,8,2,4,7,5};
    int len = sizeof(arr)/sizeof(arr[0]);
    int sum = 9;

    int ans = sub_sum(sum,arr,len);
    if (ans)
        printf("True");
    else
        printf("False");
}