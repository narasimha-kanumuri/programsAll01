#include<stdio.h>
#include<stdlib.h>

typedef struct node{
    int data;
    struct node *left;
    struct node *right;
    int height;
}avl;

avl* createNode(int val){
    avl* newNode=(avl*)malloc(sizeof(avl));
    newNode->data=val;
    newNode->left=NULL;
    newNode->right=NULL;
    newNode->height=1;
    return newNode;
}

avl *left_rotate(avl *grand_parent){
    avl *parent=grand_parent->right;
    avl *child=parent->left;

    //rotation
    parent->left=grand_parent;
    grand_parent->right=child;

    //height update
    grand_parent->height=heigth(grand_parent);
    parent->height=height(parent);

    return parent;
}

int height(){

}

avl* insert_node(avl *node,int val){
    if(node==NULL){
        return createnode(val);
    }
    if(val<node->data){
        node->left=insert_node(node->left,val);
    }
    else if(val>node->data){
        node->right=insert_node(node->right,val);
    }
    else { //equal values not allowed
        return node;
    }
    node->height=height(node);
    int balance=get_Balance(node);

    //LL
    if(balance>1 && val<node->left->data){
        return right_rotate(node);
    }

    //RR
    if(balance<-1 && val > node->right->data){
        return left_rotate(node);
    }

    //LR 
    if(balance>1 && val>node->left->data){
        node->left=left_rotate(node->left);
        return right_rotate(node);
    }
    
    //RL
    if(balance<-1 && val<node->right->data){
        node->right=right_rotate(node->right);
        return left_rotate(node);
    }
}

avl *rightrotate(){

}

int getBalance(avl *node){
    if(node==NULL){
        return 0;
    }
        return height(node->left)-height(node->right);
    
}

void inorder(avl *root){
    if(root==NULL)
        return;
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}

int main(){

}