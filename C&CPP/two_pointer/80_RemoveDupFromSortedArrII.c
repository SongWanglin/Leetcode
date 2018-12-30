int removeDuplicates(int* nums, int numsSize) {
    int firstValIndex = 1;
    if(numsSize == 0 || numsSize==1)
        return numsSize;
    for (int i=2; i<numsSize; i++){
        if(nums[firstValIndex-1]==nums[i] && nums[firstValIndex]==nums[i])
            continue;
        firstValIndex+=1;
        nums[firstValIndex] = nums[i];
    }
    return firstValIndex+1;
}

