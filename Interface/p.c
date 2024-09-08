#include <stdio.h>
 int main() 
{

int arr[] = {1, 2, 3, 4, 5};
int *ptr = arr + 2;
printf("%d", *ptr);
return 0;
}