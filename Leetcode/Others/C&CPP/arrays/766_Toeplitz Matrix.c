bool isToeplitzMatrix(int** matrix, int matrixRowSize, int *matrixColSizes) {

    for (int i = 0; i<matrixRowSize-1; i++){
        for (int j = 0; j<*matrixColSizes-1; j++){
            if (*( *(matrix+i) +j) != *( *(matrix+i+1) +j+1)){
                return 0;
            }
        }
    }
    return 1;
}
