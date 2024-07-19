//Reverse string
//Reverse words
//Reverse letter of words
//Ths is a sample string

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char *strRev(char *);
char* wordsRev(char *);
char* lettersOfWordRev(char *);

int main(void){
    char *str = "Madam Malayalam nurssessrun aibohpphobia";

    printf("%s", strRev(str));
    print("%s", wordsRev(str));
    printf("%s", lettersOfWordRev(str));

    return 0;
}

char * strRev(char *str){
    // for(int i = 0; str[i]; i++){
    //     printf("%c", str[strlen(i) - i]);
    // }

    int len = strlen(str);
    char *temp = (char *)malloc(strlen(str));
    for (int i = 0; str[i]; i++){
        temp[i] = str[len - i];
    }
    return temp;
}

char* wordsRev(char *str){
    int len = strlen(str);
    char *temp = (char *)malloc(len);

    for (int i = len-1; i >= 0; i--){
        if(str[i] == ' ' ){
            int subL = 
            strcpy(temp+i-len, &str[i+1]);
            str[i] = '\0';
        }
    }
    strcpy(temp,str);


    return temp;
}