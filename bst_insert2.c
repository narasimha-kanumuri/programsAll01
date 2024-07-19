#include<stdio.h>
#include<stdlib.h>

/**
 * @brief 
 * 
 */
typedef struct node{
    int data;
    struct node *left;
    struct node *right;
}bst;

/**
 * @brief Create a Node object
 * 
 * @param data 
 * @return bst* 
 */
bst* createNode(int data){
    bst* temp=(bst*)malloc(sizeof(bst));
    temp->data=data;
    temp->left=NULL;
    temp->right=NULL;
    return temp;
}

 void insert_node(bst **root,int val){
    if(*root==NULL){
        *root= createNode(val);
    }
    if(val<(*root)->data){
        insert_node(&((*root)->left),val);
    }
    else if(val>(*root)->data){
        insert_node(&((*root)->right),val);
    }
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
    insert_node(&root,100);
    insert_node(&root,50);
    insert_node(&root,150);

    inorder(root);

}




