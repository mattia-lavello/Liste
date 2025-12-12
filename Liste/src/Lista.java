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
        Nodo tmp = root;
        root = n;
        n.setNext(tmp);
    }

    public void add(String s) {
        Nodo n = new Nodo(s);
        addTail(n);
    }

    public void remove(String s) {
        if (root == null) {
            return;
        }
        if (root.getVal().equals(s)) {
            root = root.getNext();
            return;
        }
        Nodo prev = root;
        Nodo curr = root.getNext();
        while (curr != null) {
            if (curr.getVal().equals(s)) {
                prev.setNext(curr.getNext());
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }

    public boolean exists(String s) {
        Nodo tmp = root;
        while (tmp != null) {
            if (tmp.getVal().equals(s)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
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
