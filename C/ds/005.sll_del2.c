

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
sll* delete2NodesBeforeVal(sll *, int);

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

    int val = 60;
    head = delete2NodesBeforeVal(head, val);
    printf("\n");
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

sll *delete2NodesBeforeVal(sll *head, int val)
{
    sll *temp = head;
    if (temp == NULL || temp->next == NULL || temp->next->next == NULL || temp-> data == val || temp-> next->data == val)
    {
        printf("Not possible");
        return head;
    }
    if (temp->next->next->data == val)
    {
        head = temp->next->next;
        free(temp->next);
        free(temp);
        return head;
    }

    sll *del1 = temp->next;
    sll *del2 = del1->next;

    while (del2->next->data != val)
    {
        if (del2->next == NULL)
            return head;
        temp = del1;
        del1 = del2;
        del2 = del2->next;
    }

    temp->next = del2->next;
    free(del1);
    free(del2);

    return head;
}
