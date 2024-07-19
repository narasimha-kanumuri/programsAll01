#include <stdio.h>
typedef struct node
{
    struct node *left;
    int data;
    struct node *right;
} tree;

tree *createNode(int data)
{
    tree *newNode = (tree *)malloc(sizeof(tree));
    newNode->data = data;
    newNode->left = newNode->right = NULL;

    return newNode;
}

tree *insert(tree *root, int data)
{
    if (root == NULL)
        return createNode(data);
    if (data < root->data)
        root->left = insert(root->left, data);
    if (data > root->data)
        root->right = insert(root->right, data);

    return root;
}

int main(void)
{

    printf("\n");
    preOrder(root);

    return 0;
}

// lRr
int inOrder(tree *root)
{
    if (root == NULL)
        return 0;
    inOrder(root->left);
    printf("%d ", root->data);
    inOrder(root->right);
}

int preOrder(tree *root)
{
    if (root == NULL)
        return 0;
    printf("%d ", root->data);
    inOrder(root->left);
    inOrder(root->right);
}