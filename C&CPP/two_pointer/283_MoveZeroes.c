void swap(void *p, void *q, int size){
    void *tmp = malloc(size);
    memcpy(tmp, p, size);
    memcpy(p, q, size);
    memcpy(q, tmp, size);
    free(tmp);
}

void moveZeroes(int* nums, int numsSize) {
    int firstZeroIndex = 0;
    for (int i = 0; i<numsSize; i++){
        if (nums[i]!=0){
            swap(nums+i, nums+firstZeroIndex, sizeof(nums[i]));
            firstZeroIndex++;
        }
    }
}
