import java.util.Scanner;

class MaxMin {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newnode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 1)
            System.out.println("Invalid Input");
        else if (n == 1) {
            int x = sc.nextInt();
            System.out.println("Maxima: " + x);
            System.out.println("Minima: " + x);
        } else {
            if (n == 2) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x > y) {
                    System.out.println("Maxima: " + x);
                    System.out.println("Minima: " + y);
                } else {
                    System.out.println("Maxima: " + y);
                    System.out.println("Minima: " + x);
                }
            }
            if (n > 2) {

                MaxMin List = new MaxMin();

                for (int i = 0; i < n; i++) {
                    List.add(sc.nextInt());
                }
                int maxima = Integer.MIN_VALUE;
                int minima = Integer.MAX_VALUE;

                Node temp = List.head;

                while (temp.next != null) {

                    maxima = Math.max(maxima, temp.data);
                    minima = Math.min(minima, temp.data);

                    temp = temp.next;
                }
            }
            sc.close();
        }

    }

}