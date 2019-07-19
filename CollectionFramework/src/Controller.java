
import java.util.Collection;
import java.util.Scanner;

public class Controller {


    int integerValue;
    String stringValue;
    Arraylist arraylist = new Arraylist();
    Linkedlist linkedlist = new Linkedlist();
    stack s = new stack();
    vector v = new vector();
    Hashset hashset = new Hashset();
    Linkedhashset linkedhashset = new Linkedhashset();
    Treeset treeset = new Treeset();
    Priorityqueue priorityqueue = new Priorityqueue();
    Arraydeque arraydeque = new Arraydeque();


    public static void main(String[] args) {

        mainMenu();


    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        short options;
        Controller controller = new Controller();

        while (true) {
            System.out.println("***************Collection Framework*****************");
            System.out.println("Select the type of collection you want to work with");
            System.out.println("1.Array List\n2.Linked List\n3.Vector\n4.Stack\n5.HashSet\n6.Linked HashSet\n7.TreeSet\n8.Priority Queue\n9.Array Deque\n10.To exit");
            options = input.nextShort();
            switch (options) {
                case 1:
                    controller.arrayListImplementation();
                    break;
                case 2:
                    controller.linkedListImplementation();
                    break;
                case 3:
                    controller.vectorImplementation();
                    break;
                case 4:
                    controller.stackImplementation();
                    break;
                case 5:
                    controller.hashsetImplementation();
                    break;
                case 6:
                    controller.linkedHashsetImplementation();
                    break;
                case 7:
                    controller.treesetImplementation();
                    break;
                case 8:
                    controller.priorityQueueImplementation();
                    break;
                case 9:
                    controller.arraydequeImplementation();
                    break;
                case 10:
                    System.exit(0);

            }

        }


    }


    public void arrayListImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter numbers to add ");
                integerValue = input.nextInt();
                arraylist.addNumbersToList(integerValue);
                break;
            case 2:
                System.out.println("Enter number to remove from list");
                integerValue = input.nextInt();
                arraylist.removeFromList(integerValue);
                break;
            case 3:
                arraylist.getArrayList();
                break;
            case 4:
                break;
        }
        return;
    }

    public void linkedListImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                linkedlist.addToLinkedList(stringValue);
                break;
            case 2:
                System.out.println("Enter values to remove from list");
                stringValue = input.next();
                linkedlist.removeFromLinkedList(stringValue);
                break;
            case 3:
                linkedlist.getLinkedList();
                break;
            case 4:
                break;


        }
        return;


    }

    public void vectorImplementation() {
        System.out.println("Press :\n 1.To add \n2.To remove\n 3.To Print Collection\n4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                v.addToVector(stringValue);
                break;
            case 2:
                System.out.println("Enter values to remove from list");
                stringValue = input.next();
                v.removeFromVector(stringValue);
                break;
            case 3:
                v.getVector();
                break;
            case 4:
                break;

        }
        return;

    }

    public void stackImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                s.addToStack(stringValue);
                break;
            case 2:
                s.removeFromStack();
                break;
            case 3:
                s.getStack();
                break;
            case 4:
                break;

        }
        return;

    }

    public void hashsetImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                hashset.addtoHashset(stringValue);
                break;
            case 2:
                System.out.println("Enter values to remove from list");
                stringValue = input.next();
                hashset.removeFromHashset(stringValue);
                break;
            case 3:
                hashset.getHashset();
                break;
            case 4:
                break;

        }
        return;

    }

    public void linkedHashsetImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                linkedhashset.addToLinkedHashset(stringValue);
                break;
            case 2:
                System.out.println("Enter values to remove from list");
                stringValue = input.next();
                linkedhashset.removeFromLinkedHashset(stringValue);
                break;
            case 3:
                linkedhashset.getLinkedhashset();
                break;
            case 4:
                break;

        }
        return;

    }

    public void treesetImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                treeset.addToTreeset(stringValue);
                break;
            case 2:
                System.out.println("Enter values to remove from list");
                stringValue = input.next();
                treeset.removeFromTreeset(stringValue);
                break;
            case 3:
                treeset.getTreeset();
                break;
            case 4:
                break;

        }
        return;

    }

    public void priorityQueueImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter numbers to add ");
                stringValue = input.next();
                priorityqueue.addToQueue(stringValue);
                break;
            case 2:
                priorityqueue.removeFromQueue();
                break;
            case 3:
                priorityqueue.getQueue();
                break;
            case 4:
                new Controller().mainMenu();
                break;

        }
        return;

    }

    public void arraydequeImplementation() {
        System.out.println("Press :\n 1.To add \n 2.To remove\n 3.To Print Collection\n 4.TO RETURN TO MAIN MENU\n");

        Scanner input = new Scanner(System.in);
        short options;
        options = input.nextShort();
        switch (options) {

            case 1:
                System.out.println("Enter values to add ");
                stringValue = input.next();
                arraydeque.addToArrayDeque(stringValue);
                break;
            case 2:
                System.out.println("Enter values to remove from list");
                stringValue = input.next();
                arraydeque.removeFromArrayDeque(stringValue);
                break;
            case 3:
                arraydeque.getArrayDeque();
                break;
            case 4:
                new Controller().mainMenu();
                break;

        }
        return;

    }

}
