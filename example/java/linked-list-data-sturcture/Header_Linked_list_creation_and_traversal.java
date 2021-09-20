// Java program to illustrate creation
// and traversal of Header Linked List

class Header_Linked_list_creation_and_traversal{
// Structure of the list
static class link {
    int info;
    link next;
};

// Empty List
static link start = null;

// Function to create header of the
// header linked list
static link create_header_list(int data)
{

    // Create a new node
    link new_node, node;
    new_node = new link();
    new_node.info = data;
    new_node.next = null;

    // If it is the first node
    if (start == null) {

        // Initialize the start
        start = new link();
        start.next = new_node;
    }
    else {

        // Insert the node in the end
        node = start;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new_node;
    }
    return start;
}

// Function to display the
// header linked list
static link display()
{
    link node;
    node = start;
    node = node.next;

    // Traverse until node is
    // not null
    while (node != null) {

        // Print the data
        System.out.printf("%d ", node.info);
        node = node.next;
    }
    System.out.printf("\n");

    // Return the start pointer
    return start;
}

// Driver Code
public static void main(String[] args)
{
    // Create the list
    create_header_list(11);
    create_header_list(12);
    create_header_list(13);

    // Print the list
    System.out.printf("List After inserting"+ " 3 elements:\n");
    display();
    create_header_list(14);
    create_header_list(15);

    // Print the list
    System.out.printf("List After inserting"+ " 2 more elements:\n");
    display();

}
}

// This code is contributed by 29AjayKumar
