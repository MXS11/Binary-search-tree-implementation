# Binary-search-tree-implementation

[![license](https://img.shields.io/badge/license-MIT-%23F65314?style=flat-square)](LICENSE)

In this part, your job will be to implement various forms of tree data structures and various related algorithms. You will create a binary search tree.

### Overview 

1) Your program should be set up to receive two command line arguments. 

These two arguments will specify two input files for your program. Both input files will match the format of starwars.txt. 

The two arguments will represent the following: 

 - A data file with names to store.
 
 - A data file with names to search for. (We will be testing your program with our own test files. Make sure your program can handle input files of any length.) 
 
2) Your program will store the data from the first file into various data structures and then read the data from the second file and search for each name in it in your previously built structures.

For duplicates, report the first hit.

1) Create a binary search tree class. Again, this will be of an explicit representation.

2) Again, insert all of the names in the first array into your search tree and report the average time it takes to do so.

3) Print out the contents of the tree with an inorder traversal. 

4) Again, print the minimum and maximum values stored in the tree and output the time taken to find each. 

5) Again, search for each name from the second array and report:

    - The depth of the node. (The root node has a depth of 0). 

    - Whether the node is a leaf node or not. 
    
    - The size of the subtree where the name was found.

    - The time it took to find the name. 

6) Make sure to account for when names are not found. For duplicates, report the first hit.
