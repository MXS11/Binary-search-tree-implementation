class BinarySearchTree {

        static class Node
        {
            String key;
            Node left, right;

            public Node(String item)
            {
                key = item;
                left = right = null;
            }
        }


        Node root;


        BinarySearchTree()
        {
            root = null;
        }
        public Node find(String key) {
            return findRec(root, key);
        }

        public Node findRec(Node root, String key) {
            if (root == null) {
                System.out.printf("Cant find Node with Value %s !\n", key);
                return new Node(key);
            }
            if (key.compareTo(root.key) < 0)
                return findRec(root.left, key);
            else if (key.compareTo(root.key) > 0)
                return findRec(root.right, key);
            else
                return root;
        }

        long n_startTime = System.nanoTime();


        void insert(String key)
        {
            root = insertRec(root, key);
        }


        Node insertRec(Node root, String key)
        {


            if (root == null)
            {
                root = new Node(key);
                return root;
            }

            if (key.compareTo(root.key) < 0)
                root.left = insertRec(root.left, key);
            else if (key.compareTo(root.key) > 0)
                root.right = insertRec(root.right, key);

            return root;
        }

        long n_stopTime = System.nanoTime();

        long elapsedTime = n_stopTime - n_startTime;

        void inorder()
        {
            inorderRec(root);
        }


        void inorderRec(Node root)
        {
            if (root != null) {
                inorderRec(root.left);
                System.out.println(root.key);
                inorderRec(root.right);
            }
        }
        long n_startTime_max = System.nanoTime();

        String findMax(Node node) {
            Node current = node;
            while (current.right != null) {
                current = current.right;
            }
            return (current.key);
        }

        long n_stopTime_max = System.nanoTime();

        long elapsedTime_max = n_stopTime_max - n_startTime_max;

        long n_startTime_min = System.nanoTime();

        String findMin(Node node) {
            Node current = node;


            while (current.left != null) {
                current = current.left;
            }
            return (current.key);
        }

        long n_stopTime_min = System.nanoTime();

        long elapsedTime_min = n_stopTime_min - n_startTime_min;

        int maxDepth(Node node) {
            if (node == null)
                return 0;
            else {
                int lDepth = maxDepth(node.left);
                int rDepth = maxDepth(node.right);

                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }

        boolean isLeaf(Node node) {
            if (node == null)
                return false;
            return node.right == null && node.left == null;
        }


        long n_startTime_size = System.nanoTime();

        int size() {
            return size(root);
        }


        int size(Node node) {
            if (node == null)
                return 0;
            else
                return (size(node.left) + 1 + size(node.right));
        }

        long n_stopTime_size = System.nanoTime();

        long elapsedTime_size = n_stopTime_size - n_startTime_size;



        public static void main(String[] args)
        {
            BinarySearchTree tree = new BinarySearchTree();



        }
    }



