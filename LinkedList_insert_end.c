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

void insert_at_end(sll **node,int data){
    sll *newNode = createNode(data);

    if(*node == NULL){
        *node = newNode;
    }
    else {
        sll *temp = *node;
        
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newNode;
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

    insert_at_end(&head,10);
    insert_at_end(&head,20);
    insert_at_end(&head,30);
    insert_at_end(&head,40);
    insert_at_end(&head,50);

    display(head);
    return 0;
}
