class ElementListy {
    int wartosc;
    ElementListy previous;
    ElementListy next;
    public ElementListy(int wartosc) {
        this.wartosc = wartosc;
        this.previous = null;
        this.next = null;
    }
}
class Stos {
    private ElementListy top;
    public Stos() {
        this.top = null;
    }
    public void push(int wartosc) {
        ElementListy nowyElement = new ElementListy(wartosc);
        nowyElement.next = top;
        if (top != null) {
            top.previous = nowyElement;
        }
        top = nowyElement;
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stos jest pusty.");
        }
        int wartosc = top.wartosc;
        top = top.next;
        if (top != null) {
            top.previous = null;
        }
        return wartosc;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public boolean isFull() {
        return top != null;
    }
    public int getSize() {
        int size = 0;
        ElementListy current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    public int index() {
        return getSize() - 1;
    }
}
class ListaJednokierunkowa {
    private ElementListy head;

    public ListaJednokierunkowa() {
        this.head = null;
    }
    public void dodajElement(int wartosc) {
        ElementListy nowyElement = new ElementListy(wartosc);
        if (head == null) {
            head = nowyElement;
        } else {
            ElementListy current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nowyElement;
        }
    }
    public void usunElement(int wartosc) {
        if (head == null) {
            return;
        }
        if (head.wartosc == wartosc) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            }
            return;
        }
        ElementListy current = head;
        while (current.next != null && current.next.wartosc != wartosc) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            if (current.next != null) {
                current.next.previous = current;
            }
        }
    }
    public void przegladajListe() {
        ElementListy current = head;
        while (current != null) {
            System.out.print(current.wartosc + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class ListaDwukierunkowa {
    private ElementListy head;
    private ElementListy tail;
    public ListaDwukierunkowa() {
        this.head = null;
        this.tail = null;
    }
    public void dodajElement(int wartosc) {
        ElementListy nowyElement = new ElementListy(wartosc);
        if (head == null) {
            head = nowyElement;
            tail = nowyElement;
        } else {
            nowyElement.previous = tail;
            tail.next = nowyElement;
            tail = nowyElement;
        }
    }
    public void usunElement(int wartosc) {
        if (head == null) {
            return;
        }
        if (head.wartosc == wartosc) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            }
            if (head == null) {
                tail = null;
            }
            return;
        }
        ElementListy current = head;
        while (current != null && current.wartosc != wartosc) {
            current = current.next;
        }
        if (current != null) {
            if (current.previous != null) {
                current.previous.next = current.next;
            }
            if (current.next != null) {
                current.next.previous = current.previous;
            }
            if (current == tail) {
                tail = current.previous;
            }
        }
    }
    public void przegladajListe() {
        ElementListy current = head;
        while (current != null) {
            System.out.print(current.wartosc + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Zadanie11 {
    public static void main(String[] args) {
        Stos stos = new Stos();
        stos.push(10);
        stos.push(20);
        stos.push(30);
        System.out.println("Ostatni element na stosie: " + stos.pop());
        System.out.println("Rozmiar stosu po usunięciu: " + stos.getSize());
        System.out.println("Numer pozycji wierzchołka stosu: " + stos.index());
        System.out.println("Czy stos jest pusty? " + stos.isEmpty());
        System.out.println("Czy stos jest pełny: " + stos.isFull());

        // Lista jednokierunkowa
        ListaJednokierunkowa listaJednokierunkowa = new ListaJednokierunkowa();
        listaJednokierunkowa.dodajElement(5);
        listaJednokierunkowa.dodajElement(10);
        listaJednokierunkowa.dodajElement(15);
        System.out.println("Lista przed usunięciem elementu:");
        listaJednokierunkowa.przegladajListe();
        listaJednokierunkowa.usunElement(10);
        System.out.println("Lista po usunięciu elementu:");
        listaJednokierunkowa.przegladajListe();

        // Lista dwukierunkowa
        ListaDwukierunkowa listaDwukierunkowa = new ListaDwukierunkowa();
        listaDwukierunkowa.dodajElement(100);
        listaDwukierunkowa.dodajElement(200);
        listaDwukierunkowa.dodajElement(300);
        System.out.println("Lista przed usunięciem elementu:");
        listaDwukierunkowa.przegladajListe();
        listaDwukierunkowa.usunElement(200);
        System.out.println("Lista po usunięciu elementu:");
        listaDwukierunkowa.przegladajListe();
    }
}