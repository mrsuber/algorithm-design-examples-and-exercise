## Dissect everything including two demo projects about linked list

1.) what are linked list?

2.)why study linked list?

3.)types of linked list?

4.)how to manipulate the different type of linked list.

5.)demo project using all types of linked list and their different manipulation

6.)demo project 2 using all types of linked list and their different manipulation.

## Notes
**1.) what are linked list?**
Linked list is a linear data structure. It is a collection of data elements, called nodes pointing to the next node by means of a pointer. Linked list is used to create trees and graphs and other abstract data types(stacks, quese,hash tables etc). In linked list, each node consists of its own data and the address of the next node and forms a chain.


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
