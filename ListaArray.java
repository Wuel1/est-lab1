public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int Contador;

    public ListaArray(){
        this.elementos = new int[10];
        this.Contador = 0;
    }

    @Override
    public boolean insert(int chave){ 
        this.Contador = 0;       
        for(int i = 0; i < this.elementos.length; i++){           
            if(this.elementos[this.Contador] == 0 && this.Contador <= this.elementos.length){
                this.elementos[i] = chave;
                this.Contador += 1;
                return true;                     
            }
        }
        return false;
    }

    public boolean delete(int chave){
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] == chave){
                elementos[i] = -1;                
                for(int j = i; j < elementos.length; j++){
                    elementos[j] = elementos[j+1];
                }
                return true;
            }
        }
        return false;
    }
    public boolean search(int chave){
        for(int i = 0; i < elementos.length; i++){
            if (elementos[i] == chave){
                return true;
            }            
        }
        return false;        
    }
    public int minimum(){
        int i = 0;
        return i;
    }
    public int maximum(){
        int i = 0;
        return i;
    }
    public int sucessor(int chave){
        int i = 0;
        return i;
    }
    public int prodessor(int chave){
        int i = 0;
        return i;
    }
    public void mostrar(){

    }
    
    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        System.out.println(r.insert(1));
        System.out.println(r.insert(2));
        System.out.println(r.insert(3));        
        System.out.println(r.insert(4));        
        System.out.println(r.insert(5));
        System.out.println(r.delete(4));
    }
}
