bool judgeCircle(char* moves) {
    int x = 0, y = 0;
    for (; *moves; moves++){
        switch(*moves){
        case 'U': y+=1; break;
        case 'D': y-=1; break;
        case 'L': x-=1; break;
        case 'R': x+=1; break;
        default: return 0;
        }
    }
    return x==0 && y==0;
}
