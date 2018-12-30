void swap(void *p, void *q, int size){
    void *tmp = malloc(size);
    memcpy(tmp, p, size);
    memcpy(p, q, size);
    memcpy(q, tmp, size);
    free(tmp);
}

int removeElement(int* nums, int numsSize, int val) {
    int firstValIndex = 0;
    for (int i = 0; i<numsSize; i++){
        if (nums[i]!=val){
            swap(nums+i, nums+firstValIndex, sizeof(nums[i]));
            firstValIndex++;
        }
    }
    return firstValIndex;
}
