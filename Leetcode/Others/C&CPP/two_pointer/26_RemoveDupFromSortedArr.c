int removeDuplicates(int* nums, int numsSize) {
    int dup_count = 0;
    for (int i=1; i<numsSize; i++){
        if( *(nums+i-1) == *(nums+i) )
            dup_count+=1;
        *(nums+i-dup_count) = *(nums+i);
    }
    return numsSize-dup_count;
}
