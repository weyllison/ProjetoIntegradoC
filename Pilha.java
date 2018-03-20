package calculadoralogica;

public class Pilha {

    private String[] elementos;
    private int top = 0;

    public Pilha(int tam) throws Exception {   //construtor 
        
        if (tam <= 0)
            throw new Exception ("Capacidade invalida");

        this.elementos = new String[tam];
        
    }

    private boolean pilhaVazia() {  //verifica se a pilha está vazia
        if (this.top == -1) 
            return true;
        
        return false;
    }

    public void Empilhar(String ch) throws Exception { //empilha elemento
        
        if (ch == null)
            throw new Exception ("Falta o que guardar");
        
        if (this.top >= this.elementos.length - 1) 
            throw new Exception("Pilha cheia");

        this.elementos[this.top] = ch;
        top++;
    }

    public String Desempilhar() { //desempilha elemento 

        if (pilhaVazia()) 
            return null;
    
        return this.elementos[this.top--];
    }
    
    public String Recuperar() { //recupera elemento
        if(pilhaVazia())
            return null;
        
        return this.elementos[this.top];
    }

}
