bool isMonotonic(int* A, int ASize) {
    int diff = *(A+1)-*A;
    for (int i=0; i<ASize-1; i++){
        if (*(A+i+1) == *(A+i)) continue;
        if ( (*(A+i+1)-*(A+i))*diff < 0){
            return 0;
        }
        diff = (*(A+i+1) - *(A+i));
    }
    return 1;
}
