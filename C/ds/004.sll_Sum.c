
// Insert at End
#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
} sll;

sll *createNode(int);
sll *insertAtEnd(sll *head, int data);
void display(sll *head);
int length(sll *);

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
    insertAtEnd(head, 70);
    insertAtEnd(head, 80);
    insertAtEnd(head, 90);
    insertAtEnd(head, 100);
    insertAtEnd(head, 110);
    insertAtEnd(head, 120);
    insertAtEnd(head, 130);
    insertAtEnd(head, 140);
    insertAtEnd(head, 150);
    insertAtEnd(head, 160);
    insertAtEnd(head, 170);
    insertAtEnd(head, 180);

    display(head);
    printf("%d\n", length(head));
    return 0;
}

sll *createNode(int data)
{
    sll *newNode = (sll *)malloc(sizeof(sll));
    newNode->data = data;
    newNode->next = NULL;

    return newNode;
}

sll *insertAtEnd(sll *head, int data)
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

void display(sll *head)
{
    sll *temp = head;

    while (temp)
    { // temp != NULL
        printf("%d ", temp->data);
        temp = temp->next;
    }
}

int length(sll *head)
{
    sll *temp = head;
    int count = 1;

    if (temp == NULL)
    {
        return 0;
    }
    while (temp != NULL && temp->next != NULL)
    {
        count += 2;
        temp = temp->next->next;
    }

    if (temp == NULL)
        return count - 1;
    else if (temp->next == NULL)
        return count;
}