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

int* partitionLabels(char* S, int* returnSize) {
    int map[26] = {0}, last=0, *res;
    *returnSize = 0;
    res = malloc( (*returnSize)  * sizeof(int) );
    char *p;  p = S;
    while(*p){
        map[(int)(*p-'a')] = last;
        p ++;
        last++;
    }

    int start = 0, end = 0, end1;
    for (int i = 0; i<last;){
        start = i;
        end = map[(int)(S[i]-'a')];
        while(end > i){
                i++;
                end1 = map[(int)(S[i]-'a')];
                end = (end1>end)? end1: end;
            }
            i = end +1;
            printf("%d\n",end -start+1 );
            res = addToArray(res, end-start+1, returnSize);
        }
    return res;
}
