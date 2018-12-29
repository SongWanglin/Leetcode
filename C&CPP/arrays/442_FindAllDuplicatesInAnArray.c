/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* addToArray(int* arr, int num, int *length){
    int* ptr1 = realloc(arr, ((*length)+1) * sizeof(int));
    if (ptr1 == NULL)
    {
        printf("\nExiting!!"); free(arr); exit(0);
    }
    else{
        arr = ptr1; arr[*(length)] = num;
        *length = (*length)+1;
    }
    return arr;
}

int* findDuplicates(int* nums, int numsSize, int* returnSize) {
     *returnSize = 0;
    int* res = malloc( (*returnSize)*sizeof(int) ), temp;
    for( int i=0; i<numsSize; i++){
        temp = abs(*(nums+i));
        if(*(nums+temp-1)>0){
            *(nums+temp-1) = -*(nums+temp-1);
        }else{
            res = addToArray(res, temp, returnSize);
        }
    }
    return res;
}
