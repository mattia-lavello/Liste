public class Nodo {

    private String val;
    private Nodo next;

    public Nodo(String s) {
        val = s;
        next = null;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
