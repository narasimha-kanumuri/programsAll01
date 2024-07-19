If(temp == NULL && k > 1)
    Return "position do not exist"
if(k == 1){
    temp1 = newNode();
    temp1->next = head;
    head = temp1;
}
    Int count = 1;
While(temp != NULL && count < k - 1) {
    Temp = temp->next;
    Count += 1;
}

If(temp == NULL)
    Return "pos no Exist"
