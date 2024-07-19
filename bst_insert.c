#include<stdio.h>
#include<stdlib.h>

typedef struct node{
    int data;
    struct node *left;
    struct node *right;
}bst;

bst* createNode(int data){
    bst* temp=(bst*)malloc(sizeof(bst));
    temp->data=data;
    temp->left=NULL;
    temp->right=NULL;
    return temp;
}

bst* insert_node(bst *root,int val){
    if(root==NULL){
        return createNode(val);
    }
    if(val<root->data){
        root->left=insert_node(root->left,val);
    }
    else if(val>root->data){
        root->right=insert_node(root->right,val);
    }
    return root;
}

void inorder(bst *root){
    if(root==NULL)
        return;
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);

}

int main(void)
{
    bst *root=NULL;
    root=insert_node(root,10);
    root = insert_node(root,5);
    root = insert_node(root,15);

    inorder(root);

}




