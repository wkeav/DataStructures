/*
 * Open an ice cream shop with three values : strawberry, banana and coconut.
 * The nodes will connect different orders together - sundae, single cup, etc
 */
public class Node {
    public String data;   
    private Node next; 

    //constructor
    public Node(String data){
    this.data = data;
    this.next = null;
    }

    public void setNextNode(Node node){
        this.next = node;
    }

    public Node getNextNode(){
        return this.next;
    }
public static void main(String[] args) {
    // Node firstNode = new Node("I am a Node!");
    // Node secondNode = new Node("I am the second node!");
	// System.out.println(firstNode.data);
    // System.out.println(firstNode.getNextNode().data);

    //sundae 
    Node strawberry = new Node("Berry Tasty");
    Node banana = new Node("Banana-rama");
    Node coconut = new Node("Nuts for Coconut");

    strawberry.setNextNode(banana);
    banana.setNextNode(coconut);

    Node currentNode = strawberry;
    while (currentNode != null) {
        System.out.println(currentNode.data);
        currentNode = currentNode.getNextNode();
    }

    //one cup
    System.out.println("\n" + strawberry.data);
	}
}