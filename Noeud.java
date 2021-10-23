public class Noeud{
    private char lettre; 
    private Noeud next;

    public Noeud(char lettre, Noeud next){
        this.lettre = lettre;
        this.next = next;
    }

    public char getLettre(){
        return this.lettre;
    }

    public Noeud getNext(){
        return this.next;
    }
    public setLettre(char lettre){
        this.lettre = lettre;
    }

    public setNext(Noeud next){
        this.next = next;
    }
}

