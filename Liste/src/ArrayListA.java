public class ArrayListA {
    public static void main(String[] args) throws Exception {
        Lista l1 = new Lista();
        l1.addTail(new Nodo("Mario"));
        l1.addTail(new Nodo("Giulio"));
        l1.addTail(new Nodo("Francesco"));
        l1.addHead(new Nodo("Luca"));
        l1.addHead(new Nodo("Ludovica"));
        l1.addHead(new Nodo("Sanji"));
        l1.add("Rayan");
        l1.remove("Sanji");
        l1.exists("Ludovica");
        
        System.out.println("Ho trovato: " + l1.find("Ludovica") + "\n");
        System.out.println(l1);
        l1.isEmpty();
        
    }
}

