package uk.ac.nulondon;

public class MySingleLinkList<T> {

    private Node<T> head;

    public MySingleLinkList() {
        head = null;
    }

    // Add an item to the front of the list
    public void add(T data) {
        // Make a new Node with data
        Node<T> temp = new Node<>(data);

        if(head == null) {
            head = temp;
        }
        // List is not empty
        else {
            temp.next = head;
            head = temp;
        }
    }

    // Remove the first item and return its value
    public T remove() {
        T val = head.data;
        head = head.next;
        return val;
    }

    // Get the value of the first element
    public T get( ) {
        return head.data;
    }

    // Get the length of the head
    public int length() {
        if(head == null) {
            return 0;
        }
        else {
            return length(head);
        }
    }

    // Get the length of the given node
    private int length(Node<T> h) {
        if(h == null) {
            return 0;
        }
        return 1 + length(h.next);
    }

    // Is the list empty?
    public boolean isEmpty() {
        return(head == null);
    }

    // Does the list contain the given element?
    public boolean contains(T elem) {
        return contains(elem, head);
    }

    private boolean contains(T elem, Node<T> h) {
        if(h == null) {
            return false;
        }

        if(h.data.equals(elem)) {
            return true;
        }
        return contains(elem, h.next);
    }

    // Insert the given value to the given element in the list
    // Returns true of the value was inserted into the list before element, false otherwise
    public boolean insertBefore(T elem, T value) {

        Node<T> temp = new Node<>(value);

        if(head == null) {
            return false;
        }

        if(elem == null)
        {
            if(head.data == null) {
                temp.next = head;
                head = temp;
                return true;
            }

            Node<T> iter1 = head;
            Node<T> iter2 = head.next;

            while(iter2!=null) {
                if(iter2.data == null) {
                    iter1.next = temp;
                    temp.next = iter2;
                    return true;
                }
                iter1 = iter1.next;
                iter2 = iter2.next;
            }
        }

        else {
            if((elem == null && head.data == null) || (head.data!=null && head.data.equals(elem)) )
                temp.next = head;
            head = temp;
            return true;
        }

        Node<T> iter1 = head;
        Node<T> iter2 = head.next;

        while(iter2  != null) {

            //what about data being null as well
            if(iter2.data!= null && iter2.data.equals(elem)) {
                iter1.next = temp;
                temp.next = iter2;
                return true;

            }
            iter1 = iter1.next;
            iter2 = iter2.next;
        }
        return false;
    }

    // Reverse a single link list
    public void reverse() {
        if(head == null) {
            return;
        }
        if(head.next == null) {
            return;
        }

        Node<T> iter1 = head;
        Node<T> iter2 = head.next;
        Node<T> iter3 = null;
        iter1.next = null;

        while(iter2 != null) {
            iter3 = iter2.next;
            iter2.next = iter1;
            iter1 = iter2;
            iter2 = iter3;
        }
        head = iter1;
    }

    //TODO: get the value at the given index
    public T getAt(int index) {
        Node<T> iter = head;
        for(int i = 0; i < index; i++) {
            iter = iter.next;
        }
        return iter.data;
    }


    // TODO: remove the node at the given index if it exists
    //  public boolean removeAt(int index): This method removes the node
    //  located at the given index if it exists. If there is no node at that
    //  index, the method throws an IndexOutOfBounds exception.
    public boolean removeAt(int index) {
        Node<T> iter = head;
        for(int i = 0; i < index; i++) {
            Node<T> temp = iter.next;
            iter.next = temp.next;

        }
        if(index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException();
        }

        return false;
    }

    // TODO: convert the values of the linked list to a string
    @Override
    public String toString() {
        String result = "";
        Node<T> iter = head;
        while(iter != null) {
            result += iter.data + " ";
            iter = iter.next;
        }
        return result;
    }


    public static void main(String[] args) {
    }
}
