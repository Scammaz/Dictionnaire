import java.util.*;

public class Main{
    public public static void main(String[] args) {
        
        GenericTree tree = new GenericTree();
        }

        
    }

    class GenericTree{
        class Node{
            int data; 
            ArrayList <Node> enfants; 
            Node(int data){
                this.data = data;
                children = new ArrayList<>();

            }
        }
    }
    Private Node root;
    
    GenericTree(){
        
        Scanner s = new Scanner(System.in); // L'information a input
        this.root = constructGT(S, null, 0 );
    }

    private Node constructGT(Scanner s , Node parent, int i){
        if(parent == null){
            System.out.println("Enter the data for the root node");
        }
        else{
            System.out.println("Enter data for array node");
            int data = s.nextInt(); // La lettre qu'on va recevoir
            Node node = new Node(data);

            System.out.println("Enter number of chuildren for that node ");
            int nbrEnfant = s.nextInt();

            for(int i =0; i < nbrEnfant; i++){
                Node child = constructGT(s,node,i);
                node.children.add(child);
            }
            return node; 
        }
    }
}