// Input from user
// create newNode for every element.
// Insert new element from the end
// traverse for printing

//Insert at End
#include<stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
}sll;

sll *createNode(int);
sll *insertAtEnd(sll *head, int data);
void display(sll *head);

int main(void)
{
    sll *head = NULL;

    int data = 10;
    head = insertAtEnd(head, data);
    insertAtEnd(head, 20);
    insertAtEnd(head, 30);
    insertAtEnd(head, 40);
    insertAtEnd(head, 50);
    insertAtEnd(head, 60);

    display(head);
    return 0;
    }

    sll *createNode(int data)
    {
        sll *newNode = (sll *)malloc(sizeof(sll));
        newNode->data = data;
        newNode->next = NULL;

        return newNode;
    }

    sll *insertAtEnd(sll * head, int data)
    {
        sll *temp = head;
        if (temp == NULL)
        {
            temp = createNode(data);
        }
        else
        {
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = createNode(data);
        }

        return temp;
    }

    void display(sll * head)
    {
        sll *temp = head;

        while (temp)
        { // temp != NULL
            printf("%d ", temp->data);
            temp = temp->next;
        }
    }