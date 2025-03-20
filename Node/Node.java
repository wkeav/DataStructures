/*
 * 
 */
public class Node {
    public String data;   
    private Node next; 

    public Node(String data){
    this.data = data;
    this.next = null;
    }

    private void setNextNode(Node node){
        this.next = node;
    }

    private Node getNextNode(){
        return this.next;
    }
public static void main(String[] args) {
    Node firstNode = new Node("I am a Node!");
    Node secondNode = new Node("I am the second node!");
	// System.out.println(firstNode.data);
    System.out.println(firstNode.next.data);

	}
}