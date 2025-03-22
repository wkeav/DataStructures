package LinkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
    
      //linking new head to old head
        if(currentHead != null){
            this.head.setNextNode(currentHead);
        }
        this.size ++;
    }

    public void addToTail(String data){
        Node tail = this.head;
        if(tail == null){ //if head is empty
            this.head = new Node(data);
        }else{
            while(tail.getNextNode() != null){
            tail = tail.getNextNode();
        }
        tail.setNextNode(new Node(data));
        this.size ++;
        }
    }

    public String removeHead(){
        Node removedHead = this.head;
        if(removedHead == null){  //if first head is empty
            return null;
        }
    
        this.head = removedHead.getNextNode();
        this.size --;
        return removedHead.data;
    }

    public String removeTail(){
        
    }

    public int size(){
        return this.size;
    }

    public String getData(int index){
        if(index < 0 || index >= size()){
            return "invalid index!";
        }
        Node currentNode = this.head;
        //traverse to the node at specific index
        for(int i = 0 ; i < index; i++ ){
            currentNode = currentNode.getNextNode();
        }
        return currentNode.data;
    }

    public boolean contains(String data){
        if (data == null){
            return false; 
        }
        Node currentNode = this.head;
        for(int i = 0 ; i < size(); i++){
            if(data.equals(currentNode.data) || (data != null && data.equals(currentNode.data))){
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }



    public String printList(){
        String output = "<head> ";
        Node currentNode = this.head;
    
        //get data
        while(currentNode != null){
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output; 
    }

    public static void main(String []args) {
        // LinkedList seasons = new LinkedList();
        // seasons.printList();
        // seasons.addToHead("summer");
        // seasons.addToHead("spring");
        // seasons.addToTail("fall");
        // seasons.addToTail("winter");
        // seasons.printList();
        // seasons.removeHead();
        // seasons.printList();
        // System.out.println("\n" + seasons.getData(2));
        // System.out.println("\n" + seasons.size());



    }
}
