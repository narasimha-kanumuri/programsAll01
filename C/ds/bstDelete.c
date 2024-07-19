tree* delete(tree* root, int data){
    if (root == NULL)
        return root;

    if (data < root->data)
    {
        root->left = delete (root->left, data);
        return root;
    }

    if (data > root->data)
    {
        root->right = delete (root->right, data);
        return root;
    }
    if (root->left == NULL)
    {
        tree *temp = root->right;
        free(root);
        return temp;
    }
    if (root->right == NULL)
    {
        tree *temp = root->left;
        free(root);
        return temp;
    }

    tree *parent = root;
    tree *next = root->right;

    while (next->left != NULL)
    {
        parent = next;
        next = next->left;
    }

    root->data = next->data;

    parent->left = next->right;

    free(next);

    return root;
}