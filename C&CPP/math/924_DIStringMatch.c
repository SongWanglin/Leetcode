/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *diStringMatch(char *S, int *returnSize) {
    *returnSize = strlen(S) + 1;
    int *res, num1 = 0, num2 = (*returnSize)-1, index = 0;
    res = malloc(*returnSize * sizeof(int));
    while (*S) {
        if (*(S++) == 'I'){ res[index++] = num1++;}
        else {res[index++] = num2--;}
    }
    res[index] = num2;
    return res;
}
