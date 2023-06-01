package org.LeetCodeExercise.LinkedList;

public class DesignBrowserHistory1472 {
    private Node1472 curr;
    public DesignBrowserHistory1472(String homepage){
        curr = new Node1472(homepage);

    }

    public void visit(String url){
        curr.next = new Node1472(url);
        curr.next.prev = curr;
        curr = curr.next;
    }

    public String back(int steps){
        while(curr.prev != null && steps-- > 0){
            curr = curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps){
        while(curr.next != null && steps-- > 0){
            curr = curr.next;
        }
        return curr.url;
    }


}
class Node1472{
    public Node1472 prev;
    public Node1472 next;

    public final String url;

    public Node1472 (final String url){
        this.url = url;
    }

}