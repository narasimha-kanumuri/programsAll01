#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}sll;

sll* createNode(int data){
    sll *temp = (sll *)malloc(sizeof(sll));

    if(temp == NULL){
        printf("No Memory");
        exit(0);
    }

    temp->data = data;
    temp->next = NULL;

    return temp;
}

void insert_at_begin(sll **node,int data){
    sll *newNode = createNode(data);

    if(*head == NULL){
        *node = newNode;
    }
    else {

    }


}

void display(sll *head){

    sll *temp = head;
    while(temp->next != NULL){
        printf("%d->",temp->data);
        temp = temp->next;
    }
    printf("%d",temp->data);

}

int main(void){
    sll *head = NULL;

    insert_at_begin(&head,10);
    insert_at_begin(&head,20);

}
