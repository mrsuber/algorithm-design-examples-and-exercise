example folder is about testing the examples in the book
## Sumary of algorithms
There are two important points to note about algorithms,
1.)its correctness{it is obvious is not a proof of how correct an algorithm is}
2.) its efficiency (time complexity,)

## Names of Algorithms
1.)**nearest-neighbor heuristic**
Starting from some point p 0 , we walk
first to its nearest neighbor p 1 . From p 1 , we walk to its nearest unvisited neighbor,
thus excluding only p 0 as a candidate. We now repeat this process until we run
out of unvisited points, after which we return to p 0 to close off the tour.

Written{
in pseudo-code, the nearest-neighbor heuristic looks like this:
NearestNeighbor(P )
Pick and visit an initial point p 0 from P
p = p 0
i =0
While there are still unvisited points
i = i +1
Select p i to be the closest unvisited point to p i−1
Visit p i
Return to p 0 from p n−1
}


The nearest-neighbor rule is reasonably efficient, for it looks at each pair of points
(p i , p j ) at most twice: once when adding p i to the tour, the other when adding p j .

***Against all these positives there is only one problem. This algorithm is completely
wrong.***

## Example 01 : insersion sort
**Insertion sort**
 is a simple sorting algorithm that allows for efficient, in-place sorting of the array, one element at a time. By in-place sorting, we mean that the original array is modified and no temporary structures are needed.
 ***worse case time complexity of O(n^2) and best time complexity of O(n)
