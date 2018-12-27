char* reverseString(char* s) {
    int l = strlen(s);
    char* p = malloc((l+1)*sizeof(char));
    p[l] = '\0';
    while(*s){
        p[--l] = *(s++);
    }
    return p;
}
