#include <stdio.h>

typedef struct node
{
    int data;
    struct node *next;
} sll;

sll *createNode(int);
sll *insertAtBegin(sll *head, int data);
void display(sll *head);

int main(void)
{
    sll *head = NULL;

    int data = 10;
    head = insertAtBegin(head, data);
    head = insertAtBegin(head, 20);
    head = insertAtBegin(head, 30);
    head = insertAtBegin(head, 40);
    head = insertAtBegin(head, 50);
    head = insertAtBegin(head, 60);

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

sll *insertAtBegin(sll *head, int data){
    if (head == NULL)
    {
        head = createNode(data);
    }
    else
    {
        sll *temp = head;
        head = createNode(data);
        head->next = temp;
    }

    return head;
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