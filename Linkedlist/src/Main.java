import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(4);
        myDLL.append(2);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printElement();


        System.out.println("Element removed from the end");
        System.out.println("Element deleted is "+myDLL.removeLast().value);
        System.out.println("Element deleted is "+myDLL.removeLast().value);
       // System.out.println("Element deleted is "+myDLL.removeLast().value);
        myDLL.prepend(6);
        myDLL.prepend(12);
       // myDLL.printElement();
      //  System.out.println("Element deleted is "+myDLL.RemoveFirst().value);
        //myDLL.set(1,4);
        //myDLL.printElement();
        myDLL.insert(1,5);
        myDLL.remove(1);
        myDLL.printElement();

       // System.out.println("Element deleted is "+myDLL.get(1).value);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How many elements do you need");
//        int n = sc.nextInt();
//        System.out.println("Please enter the elements");
//        int[] arr = new int[n];
//        arr[0] = sc.nextInt();
//        DoublyLinkedList myLink = new DoublyLinkedList(arr[0]);
//        for(int i=1; i < n; i++){
//            arr[i] = sc.nextInt();
//            myLink.append(arr[i]);
//        }
//        System.out.println("Did you forget any item? i can add it to the front of list enters Y/N");
//        sc.nextLine();
//
//        String s = sc.nextLine();
//
//        if(s.equals("Y")){
//            System.out.print("Enter the element which was missed: ");
//            int x = sc.nextInt();
//            myLink.prepend(x);
//        }
//        else if(s.equals("N")){
//            System.out.println("Sure let's go ahead and display the linked list!");
//        }
//        else{
//            System.out.println("Oops wrong input entered anyways let's display the stats");
//        }

        //  LinkedList myLink = new LinkedList(4);
        // myLink.printElement();
//        System.out.println("deleted value : "+myLink.RemoveLast().value);
//        myLink.printElement();
//        System.out.println("deleted value : "+myLink.RemoveLast().value);
//        myLink.printElement();
//        System.out.println("deleted value : "+myLink.RemoveLast().value);
//        myLink.printElement();
// myLink.printElement();
//        myLink.append(5);
//        myLink.append(10);
        //myLink.removeFirst();
//        myLink.getHead();
//        myLink.getTail();
//        myLink.getLength();
//        myLink.printElement();
//
//        myLink.insert(2,4);

//        System.out.println("Enter the Index you want to search in the range "+0 + " to "+n);
//        int t = sc.nextInt();
//        System.out.println(myLink.get(t).value);
//        System.out.println("Do you want to update any value? ");
//        int index = sc.nextInt();
//        int val = sc.nextInt();
//        System.out.println(myLink.set(index,val));
//        myLink.printElement();

//        System.out.println("New Functions");
//        myLink.remove(1);
//        myLink.printElement();
//
//        System.out.println("Reverse");
//        myLink.reverse();
//        myLink.printElement();



        //System.out.println();
        
    }
}