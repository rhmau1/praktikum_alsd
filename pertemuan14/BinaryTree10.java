public class BinaryTree10 {
    Node10 root;

    BinaryTree10() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    Node10 addRekursif(Node10 root, Mahasiswa10 data) {
        Node10 newNode = new Node10(data);
        if (root == null) {
            root = newNode;
        } else if (newNode.data.ipk < root.data.ipk) {
            root.left = addRekursif(root.left, data);
        } else if (newNode.data.ipk >= root.data.ipk) {
            root.right = addRekursif(root.right, data);
        }
        return root;
    }

    Node10 cariMinIPK() {
        Node10 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    Node10 cariMaxIPK() {
        Node10 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    void tampilMahasiswaIPKdiAtas(double ipk, Node10 node) {
        if (node == null) {
            return;
        }
        if (node.data.ipk > ipk) {
            tampilMahasiswaIPKdiAtas(ipk, node.left);
            node.data.tampilInformasi();
        }
        tampilMahasiswaIPKdiAtas(ipk, node.right);
    }

    void add(Mahasiswa10 data) {
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node10 current = root;
            Node10 parent = null;
            while (true) {
                parent = current;
                if (data.ipk < current.data.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node10 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.data.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node10 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node10 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.tampilInformasi();
        }
    }

    void traverseInOrder(Node10 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    Node10 getSuccessor(Node10 del) {
        Node10 successor = del.right;
        Node10 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari node current yang akan dihapus
        Node10 parent = root;
        Node10 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data.ipk == ipk) {
                break;
            } else if (ipk < current.data.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.data.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // penghapusan
        if (current == null) {
            System.out.println("data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak leaf maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // jika punya 1 anak kanan
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // jika punya 1 anak kiri
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // jika punya 2 anak
                Node10 successor = getSuccessor(current);
                System.out.print("jika 2 anak, current = ");
                successor.data.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
