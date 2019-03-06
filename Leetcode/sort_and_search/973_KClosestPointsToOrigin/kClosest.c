/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *columnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int distance(int* p){
    return p[0]*p[0]+p[1]*p[1];
}

void swap(int** points, int i, int j){
    int* p;
    p = points[i]; points[i]=points[j]; points[j]=p;
}

void heapify(int** points, int n, int i) {
    int largest = i;
    int l = 2*i + 1,  r = 2*i + 2;

    if (l < n && distance(points[l]) > distance(points[largest])  ){
        largest = l;
    }

    if (r < n && distance(points[r]) > distance(points[largest]) ){
        largest = r;
    }
    // If largest is not root
    if (largest != i)
    {
        swap(points, i, largest);
        heapify(points, n, largest);
    }
}

void heapSort(int** arr, int n)
{
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    for (int i=n-1; i>=0; i--)
    {
        swap(arr, 0, i);
        heapify(arr, i, 0);
    }
}
/*/
void print(int** points, int pointsRowSize, int pointsColSizes){
    for (int i = 0; i<pointsRowSize; i++){
    for (int j = 0; j< pointsColSizes; j++){
        printf("%d ", points[i][j]);
        }
        printf("\n");
    }
}
/*/
int** kClosest(int** points, int pointsRowSize, int *pointsColSizes, int K, int** columnSizes, int* returnSize) {
    heapSort(points, pointsRowSize);
    //print(points, pointsRowSize, *pointsColSizes);
    int **res = (int **)malloc(K * sizeof(int *));
    int *cols = (int*) malloc(K*sizeof(int*));
    for (int i = 0; i<K; i++){
         *(res+i) = (int*)malloc( (*pointsColSizes)*sizeof(int));
        for (int j = 0; j<*pointsColSizes; j++){
            *(*(res+i)+j) = points[i][j];
        }
        cols[i] = *pointsColSizes;
    }
    //print(res, K, *pointsColSizes);
    *columnSizes = cols;
    *returnSize = K;
    return res;
}
