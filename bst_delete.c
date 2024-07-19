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

bst* deleteNode(bst *root,int key){
    if(root==NULL){
        return root;
    }
    if(key<root->data){
        root->left=deleteNode(root->left,key);
        return root;
    }
    if(key>root->data){
        root->right=deleteNode(root->right,key);
        return root;
    }
    else{
        //node with one or no child
        if(root->left==NULL){
            bst *temp=root->right;
            free(root);
            return temp;
        }
        else if(root->right==NULL){
            bst *temp=root->left;
            free(root);
            return temp;
        }
        else {
            bst *parent=root;
            bst *child=root->right;
            
            while(child->left!=NULL){
                parent=child;
                child=child->left;
            }
            if(parent!=root){
                parent->left=child->right;
                }
            else {
                parent->right=child->right;
            }

            root->data=child->data;
            free(child);
            return root; 
        }
    }
}

int main(void)
{
    bst *root=NULL;
    insert_node(&root,100);
    insert_node(&root,50);
    insert_node(&root,150);

    printf("List is:");
    inorder(root);
    printf("\n");

    root = deleteNode(root,100);
    
    inorder(root);
}




