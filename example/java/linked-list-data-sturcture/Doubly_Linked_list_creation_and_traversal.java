// Java program to illustrate
// creation and traversal of
// Doubly Linked List
import java.util.*;
class Doubly_Linked_list_creation_and_traversal{

// Doubly linked list
// node
static class Node
{
  int data;
  Node next;
  Node prev;
};

static Node head_ref;

// Function to push a new
// element in the Doubly
// Linked List
static void push(int new_data)
{
  // Allocate node
  Node new_node = new Node();

  // Put in the data
  new_node.data = new_data;

  // Make next of new node as
  // head and previous as null
  new_node.next = head_ref;
  new_node.prev = null;

  // Change prev of head node to
  // the new node
  if (head_ref != null)
    head_ref.prev = new_node;

  // Move the head to point to
  // the new node
  head_ref = new_node;
}

// Function to traverse the
// Doubly LL in the forward
// & backward direction
static void printList(Node node)
{
  Node last = null;

  System.out.print("\nTraversal in forward" +" direction \n");
  while (node != null)
  {
    // Print the data
    System.out.print(" " +  node.data +" ");
    last = node;
    node = node.next;
  }

  System.out.print("\nTraversal in reverse" +" direction \n");

  while (last != null)
  {
    // Print the data
    System.out.print(" " +  last.data + " ");
    last = last.prev;
  }
}

// Driver Code
public static void main(String[] args)
{
  // Start with the empty list
  head_ref = null;

  // Insert 6.
  // So linked list becomes
  // 6.null
  push(6);

  // Insert 7 at the beginning.
  // So linked list becomes
  // 7.6.null
  push(7);

  // Insert 1 at the beginning.
  // So linked list becomes
  // 1.7.6.null
  push(1);

  System.out.print("Created DLL is: ");
  printList(head_ref);
}
}

// This code is contributed by Princi Singh
