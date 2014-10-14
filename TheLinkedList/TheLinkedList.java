package com.company;

import java.io.FileNotFoundException;

/**
 * Created by willthammavong on 5/29/14.
 */
class Node
{
    private int data1;
    private double data2;
    protected Node nextNode;

    public Node(int d1, double d2)
    {
        data1 = d1;
        data2 = d2;
    }

    public void printNode()
    {
        System.out.println("[" + data1 + ", " + data2 + "]");
    }
}

class LinkList
{
    private Node first;

    public void linkList()
    {
        first = null;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d1, double d2)
    {
        Node node = new Node(d1, d2);
        node.nextNode = first;
        first = node;
    }

    // Deletes the node at the first of the list
    public Node delete()
    {
        Node temp = first;
        first = first.nextNode;
        return temp;
    }


    public void PrintList()
    {
        Node currentNode = first;
        System.out.println("List: ");
        while(currentNode != null)
        {
            currentNode.printNode();
            currentNode = currentNode.nextNode;
        }
    }

    // check to see if list is looping or not using tortoise and hare method
    public boolean hasLoop(Node first)
    {
        if(first == null)
            return false;

        Node slow, fast;

        slow = first;
        fast = first;

        while(true)
        {
            slow = slow.nextNode;

            if(fast.nextNode != null)
                fast = fast.nextNode.nextNode;
            else
                return false; // the next node is null so there is no loop

            if (slow == null || fast == null)
            {
                return false;
            }

            if (slow == fast)
                return true;

        }
    }

}

public class TheLinkedList {



    public static void main(String[] args) {

        LinkList theList = new LinkList();

        theList.insert(1, 2.3);
        theList.insert(2, 3.3);
        theList.insert(3, 8.3);
        theList.insert(4, 7.3);
        theList.insert(5, 5.3);

        theList.PrintList();

        while(!theList.isEmpty())
        {
            Node deletedNode = theList.delete();
            System.out.print("Deleted: ");
            deletedNode.printNode();

        }
        theList.PrintList();

    }
}