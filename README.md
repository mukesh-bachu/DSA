# DSA

DSA


Arrays
   1. insert(int val) - inserts the value after the last element in the array
   2. removeAt(int index) - removes a value at a given index and updates the elements right to it to correct positions
   3. indexOf(int val) - returns the index of a given value, if the element is not present, returns -1
   4. max() - returns the maximum element in the array
   5. intersect(int[] items1) - prints the elements that are common from the given array
   6. reverse() - reverses the array in place
   7. insertAt(int item, int index) - inserts the element at the given index and rearranges the elements right to it
   8. print() - prints the elements in the array


LinkedList
   1. addLast(int value) - adds a new node to the tail and updates the tail
   2. addFirst(int value) - adds a  new node to the head and updates the head
   3. isEmpty() - check if the linked list is empty
   4. indexOf(int value) - return the index of the node which contains the given value
   5. contains(int value) - checks if the given value is in any node of the list
   6. removeFirst() - removes the head node and updates the head node
   7. size() - returns the size of the list
   8. toArray() - converts the linked list to an array
   9. getPrev(Node node) - return the node that is previous to the given node
   10. reverse() - reverses the linked list in one pass
   11. getKthNodeFromLast(int k) - returns the kth node from the end of the list in one pass
   12. printMiddle() - prints the middle of the element in one pass
   13. hasLoop() - checks if the linked list has a loop


Stack
   1. StringReverser - provides a method called "reverse" which will return the reversal of the input string
   2. BalancedExpressions - provides a method called "isBalanced" which will return if the given input string is valid
   3. Stack  - Implemented the operation push, pop, peek, empty of  a stack using an array
   4. TwoStacks - Implemented two stacks with all the operations of a stack using a single array in space sufficient manner
   5. MinStack - Implemented a stack that supports push, pop, and retrieving the minimum value in constant time


Queues 
   1. ReversingQueue - Implemented the method to reverse any given queue
   2. ArrayQueue - Implemented enqueue, dequeue, peek, isFull, and isEmpty operations of a queue using an array
   3. PriorityQueue - Implemented  Priority Queue using an array
   4. QueueWithTwoStacks - Implemented queue with two stacks supporting all the operations of a queue
   5. QueueReverser - Implemented the reverse method to reverse the first k elements of a given queue
   6. LinkedListQueue - Implemented queue using a linked list supporting all the operations of a queue
   7. StackWithTwoQueues - Implemented a stack using two queues supporting all the operations of a stack


Hash Tables

   1. CharFinder - Implements two methods to find the first repeating character and first non-repeating character
   2. CountPairs - Implements method to find the unique number of pairs in a given array with k difference
   3. HashTable - Implements operations like put, remove, and get of a HashTable from scratch using chaining
   4. MostFrequentElement - Implements method to find the most repeating character in a given array
   5. TwoSum - Implements method to find the pair of integers in a given array which sum up to given target


Binary Tress

   1. insert(int value) - inserts the given value in the correct position in a BST
   2. find(int value)  - return true if the given value in the BST
   3. traversePreOrder() - prints the pre-order traversal of elements in a binary tree
   4. traverseInOrder() - prints the inorder traversal of elements in a binary tree
   5. traversePostOrder() - prints the post-order traversal of elements in a binary tree
   6. height() - returns the height of a binary tree
   7. min() - return the minimum value in the binary tree
   8. equals(Tree other) - returns true if the given tree is the same as the binary tree
   9. isBST() - returns true if the binary tree is a BST
   10. getNodesAtDistance(int distance) - return a list of integers that are present at a given distance from the root
   11. traverseLevelOrder() - prints the level order traversal of elements in the binary tree
   12. minBST() - returns the minimum value in a BST
   13. maxBST() - returns the maximum value in a BST
   14. size()- returns the number of nodes in a binary tree
   15. countLeaves() - returns the number of leaf nodes in a binary tree
   16. contains(int val) - returns true if the given value is in the binary tree( implemented using recursion)
   17. areSibling(int val1, int val2) - returns true if the given values are present in any siblings nodes of a binary tree
   18. getAncestors(int val) - return the list of ancestors of a given value if it is present in a binary tree
   19. isBalanced() - returns true if the binary tree is balanced(i.e difference in the height of right & left subtree is less than 1)
   20. isPerfect() - returns true if the binary tree is a perfect tree i.e every level (except the last level) is full of nodes

AVLTrees
    Implemeted insert method to build an AVL tree which is self balanced. It includes several private methods to track the height of each AVL Node, 
balance factor, and implemented methods for left rotation, and right rotation.

Heaps

   1. Heap - Implemented Heap class with methods to support add, remove, and isEmpty operations
   2. MaxHeap - Implemented heapify method to convert any given array of integers to a max heap
   3. MinHeap -Implemented MinHeap class with a private node class to heapify based on the key of a node
   4. MinPriorityQueue -Implemented priority queue using MinHeap class and storing the elements based on their key value
   5. PriorityQueueWithHeap - Implemented priority queue using the heap class



Trie

   1. insert(String word) - inserts the given word into the trie
   2. lookUp(String word) - returns true if the given word is present in trie
   3. traverse() - traverse the trie and print the characters 
   4. remove(String word) - removes the given word from trie if it exists
   5. findWords(String prefix) - return a list of all words that contain the given prefix
   6. containsRecursive(String word) - returns true if the given word is present in the trie
   7. countWords() - return the numbers of words in the trie

Graphs

   1. addNode(String label) - creates a new node with given value and add it to the graph
   2. addEdge(String from, String to) - created an edge between two nodes if the two nodes are present in graph
   3. print() - prints the info about the nodes and their graphs
   4. removeNode(String label) - removes the node from graph and all the edges connected to the given node
   5. removeEdge(String from, String to) - removes the edge if present from the adjancey list
   6. traverseDepthFirstRec(String root) - traveses the graph using dfs traversal recursively
   7. traverseDepthFirst(String root) - traveses the graph using dfs traversal iteratively
   8. traverseBreadthFirst(String root) - traverse the graph using bfs
   9. topologicalSort() - implemented  topological sort traversal on graphs without any cycles
   10. hasCycle() - detects and returns true if the graph has  a cycle

Weighted Graphs

   1. addNode(String label) - creates and adds a new node to the graph
   2. addEdge(String from, String to, int weight) - adds two edges both from and to in the graph
   3. print() - prints the adjancey list of the graph
   4. getShortestPath(String from, String to) -   Implemented Dijkstra's algorithm to find the shortest path between given nodes
   5. hasCycle() -returns true of the graph has a cycle
   6. getMinimumSpanningTree() - Implemented Primms algorithm to find the minimum spanning tree
   7. containsNode(String label) - return true if the graph has give node




Sorting Algos

   1. Bubble Sort - sorts the given array using Bubble sort technique
   2. Selection sort - sorts the given array using Selection sort technique
   3. Insertion sort - sorts the given array using Insertion sort technique
   4. Merge Sort - sorts the given array using Merge sort technique
   5. Quick Sort - sorts the given array using Quick sort technique
   6. Bucket Sort - sorts the given array using Bucket sort technique
   7. Counting Sort - sorts the given array using Counting sort technique

