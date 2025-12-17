public class Lista {
    private Nodo root;

    public Lista() {
        root = null;
    }

    public int getLength() {
        Nodo tmp = root;
        int l = 0;
        while(tmp!=null) {
            l++;
            tmp = tmp.getNext();
        }
        return l;
    }
        
    public boolean isEmpty() {
        return root == null;
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

    public boolean remove(String s) {
        if (root == null) return false;
        if (root.getVal().equals(s)) {
            root = root.getNext();
            return true;
        }
        Nodo tmp = root, next = root.getNext();
        while (next != null) {
            if (next.getVal().equals(s)) {
                tmp.setNext(next.getNext());
                return true;
            }
            tmp = next;
            next = next.getNext();
        }
        return false;
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

    public Nodo find(String s) {
        Nodo tmp = root;
        while (tmp != null) {
            if (tmp.getVal().equals(s)) {
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
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
