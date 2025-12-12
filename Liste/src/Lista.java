public class Lista {
    private Nodo root;

    public Lista() {
        root = null;
    }

    public void addTail(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo tmp = root;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
        }

    }

    public void addHead(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo tmp = root;
            while(tmp.getNext()!=null) {
                tmp=tmp.getNext();
            }
            tmp.setNext(n);
        }
    }

    @Override
    public String toString() {
        String s = "La lista contiene: ";
        Nodo tmp = root;
        while (tmp != null) {
            s += tmp.getVal() + " - ";
            tmp = tmp.getNext();
        }
        return s + "\n";
    }

}
