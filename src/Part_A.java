import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Part_A {


    public static void main(String[] args) throws IOException {
        BinarySearchTree bst = new BinarySearchTree();

        // Scanner for user input
        Scanner user = new Scanner(System.in);
        String inputFileName, outputFileName;

        // prepare the input file
        System.out.print("Please enter the directory of a data file with names to store: ");
        inputFileName = user.nextLine().trim();
        File input = new File(inputFileName);


        BufferedReader br = new BufferedReader(new FileReader(input));
        ArrayList<String> in1 = new ArrayList<String>();
        String st1;
        while ((st1 = br.readLine()) != null) {
            if (!st1.isEmpty()) {
                in1.add(st1);
            }

        }

        // prepare the output file
        System.out.print("Please enter the directory of a data file with names to search for: ");
        outputFileName = user.nextLine().trim();
        File output = new File(outputFileName);


        BufferedReader ts = new BufferedReader(new FileReader(output));


        ArrayList<String> in2 = new ArrayList<String>();
        String st2;
        while ((st2 = ts.readLine()) != null) {
            if (!st2.isEmpty()) {
                in2.add(st2);
            }
        }

        for (String i : in1) {
            bst.insert(i);
        }

        for (String i : in2) {
            bst.find(i);
        }


        System.out.println("Insertion Operation executed in: " + bst.elapsedTime + " nanoSeconds");
        System.out.println("Maximum element is " + bst.findMax(bst.root) + " in " + bst.elapsedTime_max + " nanoseconds.");
        System.out.println("Minimum element is " + bst.findMin(bst.root) + " in " + bst.elapsedTime_min + " nanoseconds.");
        System.out.println("\nInorder traversal of binary tree is: ");
        bst.inorder();
        System.out.println("\n*******************************************************************************************");
        stepFiveSearch(bst, in2);
    }

    static void stepFiveSearch(BinarySearchTree bst, ArrayList<String> lst) {
        for (String st : lst) {
            BinarySearchTree.Node test = bst.find(st);
            System.out.println("\nNode: " + test.key);
            System.out.println("The depth of the node is :" + bst.maxDepth(test));
            System.out.println("Leaf is: " + bst.isLeaf(test));
            System.out.println("The size of binary tree is : " + bst.size(test) + ". It was executed in " + bst.elapsedTime_size + " nanoseconds");


        }
        //System.out.println();
        bst.find("test");

    }
}
