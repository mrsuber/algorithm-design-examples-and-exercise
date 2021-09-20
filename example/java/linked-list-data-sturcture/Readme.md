## Dissect everything including two demo projects about linked list

1.) what are linked list?

2.)why study linked list?

3.)types of linked list?

4.)how to manipulate the different type of linked list(create and traverse through).

5.)demo project using all types of linked list and their different manipulation

6.)demo project 2 using all types of linked list and their different manipulation.

## Notes
**1.) what are linked list?**
Linked list is a linear data structure. It is a collection of data elements, called nodes pointing to the next node by means of a pointer{where each node contains a data field and a reference(link) to the next node in the list}. Linked list is used to create trees and graphs and other abstract data types(stacks, queues,hash tables etc). In linked list, each node consists of its own data and the address of the next node and forms a chain.

The field of each node that contains the address of the next node is usually called the 'next link' or 'next pointer'. The remaining fields are known as the 'data', 'information', 'value', 'cargo', or 'payload' fields.


***To understand linked list you need to understand what data structure is***
Simply put, a data structure is how data is stored and organized.(data is unprocessed information so data structure organises this unprocessed information to make sense out of it)

***Why refer to linked list as Linear Order***
Storing elements in a linear order means organising them in a sequential order such that there is:
->Only one first element and it has only one next element
->Only one last element and it has only one previous element
->All other elements have a previous and next element

***if both arrays and linked list are linear data structure, why study linked list in the first place?***
While arrays offer very fast indexed access and assignment of elements, they have fixed, immutable lengths. That means that they cannot grow or shrink, and it is impossible to append or insert items. Consequently, we must know how many elements we want to store when creating an array, which might cause certain issues depending on the problem at hand.


Despite both linked lists and arrays being linear data structures, a linked list maintains the linear order of its elements using pointers (as compared to the indices in arrays). The use of pointers allows us to insert or remove nodes at arbitrary positions more efficiently than we could with arrays.

***Structure of linked list***
->Objects called Nodes with the attributes: (a) Item, which is assigned the data that it stores (required), (b) Next pointer, which points to the next Node in the linear order (required) and (c) Previous pointer, which points to the previous Node in the linear order (not required).
->A pointer to the head of the list (required)
->A pointer to the tail of the list (not required)

Since the position of a node in the list is stored in the pointer of the previous node, the nodes of a linked list do not necessarily have to be organised consecutively in memory. In fact, it can be stored anywhere in memory.

***Inserting at the tail***
To insert a node that carries integer 50 at the tail of the linked list, we do the following:
->Create a new node with its item = 50
->Let its next pointer point to None
->Let the current tail node point to this new node instead of None
->Reset the tail pointer of the linked list to point to this newly created node
***Inserting at the head***
->Create a new Node
->Let its next pointer point to the current head of the linked list
->Reset the head pointer of the linked list to point to this newly created node

**2.)why study linked list?**

They are a dynamic in nature which allocates the memory when required. Insertion and deletion operations can be easily implemented. Stacks and queues can be easily executed. Linked List reduces the access time.

Linked Lists are used to create trees and graphs.(other abstract data structures)

***Aplication of linked list***
->implementation of stacks and queues
->Implementation of graphs : Adjacency list representation of graphs is most popular which is uses linked list to store adjacent vertices.
->Dynamic memory allocation : We use linked list of free blocks.
->Maintaining directory of names
->Performing arithmetic operations on long integers
->Manipulation of polynomials by storing constants in the node of linked list
representing sparse matrices


***Applications of linked list in real world-***
->Image viewer – Previous and next images are linked, hence can be accessed by next and previous button.
->Previous and next page in web browser – We can access previous and next url searched in web browser by pressing back and next button since, they are linked as linked list.
->Music Player – Songs in music player are linked to previous and next song. you can play songs either from starting or ending of the list.

***Applications of Circular Linked Lists:***
->Useful for implementation of queue. Unlike this implementation, we don’t need to maintain two pointers for front and rear if we use circular linked list. We can maintain a pointer to the last inserted node and front can always be obtained as next of last.
->Circular lists are useful in applications to repeatedly go around the list. For example, when multiple applications are running on a PC, it is common for the operating system to put the running applications on a list and then to cycle through them, giving each of them a slice of time to execute, and then making them wait while the CPU is given to another application. It is convenient for the operating system to use a circular list so that when it reaches the end of the list it can cycle around to the front of the list.
->Circular Doubly Linked Lists are used for implementation of advanced data structures like Fibonacci Heap.
***An example problem:***
Design a data structure that supports following operations efficiently.
->getMin : Gets minimum
->extractMin : Removes minimum
->getMax : Gets maximum
->extractMax : Removes maximum
->insert : Inserts an item. It may be assumed that the inserted item is always greater than maximum so far. For example, a valid insertion order is 10, 12, 13, 20, 50.

Doubly linked list is the best solution here. We maintain head and tail pointers, since inserted item is always greatest, we insert at tail. Deleting an item from head or tail can be done in O(1) time. So all operations take O(1) time.


**3.)types of linked list?**

->Singly Linked list
->Doubly Linked list
->Circular Linked list
->Doubly Circular Linked list
->Header Linked list

***Singly Linked list***

Singly Linked List: It is the simplest type of linked list in which every node contains some data and a pointer to the next node of the same data type. The node contains a pointer to the next node means that the node stores the address of the next node in the sequence. A single linked list allows traversal of data only in one way.

![alt text](./images/Singly-Linked-List1.png?raw=true)

***Doubly Linked list***
Doubly Linked List: A doubly linked list or a two-way linked list is a more complex type of linked list which contains a pointer to the next as well as the previous node in sequence, Therefore, it contains three parts are data, a pointer to the next node, and a pointer to the previous node. This would enable us to traverse the list in the backward direction as well.
![alt text](./images/Doubly-Linked-List.png?raw=true)

***Circular linked list***
Circular Linked List: A circular linked list is that in which the last node contains the pointer to the first node of the list. While traversing a circular liked list, we can begin at any node and traverse the list in any direction forward and backward until we reach the same node we started. Thus, a circular linked list has no beginning and no end.
![alt text](./images/Circular-Linked-List.png?raw=true)
***Double Circular Linked list***
Doubly Circular linked list: A Doubly Circular linked list or a circular two-way linked list is a more complex type of linked-list that contains a pointer to the next as well as the previous node in the sequence. The difference between the doubly linked and circular doubly list is the same as that between a singly linked list and a circular linked list. The circular doubly linked list does not contain null in the previous field of the first node.
![alt text](./images/Doubly-Circular-Linked-List.png?raw=true)

***Header Linked list***
Header Linked List: A header linked list is a special type of linked list which contains a header node at the beginning of the list. So, in a header linked list START will not point to the first node of the list but START will contain the address of the header node
![alt text](./images/Grounded-Headed-Linked-List.png?raw=true)
