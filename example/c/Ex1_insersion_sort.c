#include <stdio.h>

int main (void)
{
    int s[] = {5,2,3,7,6};
    int n=5
  insertion_sort( s,n ){
        int i,j;
        /* counters */
        for (i=1; i<n; i++) {
          j=i;
          while ((j>0) && (s[j] < s[j-1])) {
            swap(&s[j],&s[j-1]);
              j = j-1;
          }
        }

        printf (s);
      }


  return 0;


}
