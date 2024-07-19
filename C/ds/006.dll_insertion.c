#include <stdio.h>

typedef struct node{
    struct node *prev;
    int data;
    struct node *next;
} dll;

dll *createNode(int);
dll* insertAtEnd(dll*, int);
void display(dll *);

int main(void){
    dll *head = NULL;

    head = insertAtEnd(head, 10);
    insertAtEnd(head, 20);
    insertAtEnd(head, 30);
    insertAtEnd(head, 40);
    insertAtEnd(head, 50);
    insertAtEnd(head, 60);
    insertAtEnd(head, 70);
    insertAtEnd(head, 80);

    display(head);
    return 0;
}

dll * createNode(int data){
   dll* newNode = (dll *) malloc(sizeof(dll));
   newNode->prev = newNode->next = NULL;
   newNode->data = data;

   return newNode;
}

dll* insertAtEnd(dll* head, int data){
    dll* newNode = createNode(data);
    if(head == NULL) return newNode;

    dll *temp = head;
    while(temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = newNode;
    newNode->prev = temp;
}