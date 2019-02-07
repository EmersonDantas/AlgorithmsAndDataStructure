#include <stdio.h>
#include "LinkedList.h"

void main(){
    int k;
    int numbers[5] = {4,5,2,3,1};
    node_t *list = init_node_t(4);
    int limit;
    limit = sizeof(numbers)/sizeof(int);
    for( k = 0; k < limit; k++){
        push_back(&list, numbers[k]);
    }
    printf("\ncheckpoint 1\n");
    fflush(stdout);
    print_list(list);
}

