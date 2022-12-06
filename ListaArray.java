import java.util.List;

public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int Contador;


    public ListaArray(){
        elementos = new int[1000];
        Contador = 0;
    }

    @Override
    public boolean insert(int chave){
        for(i = 0; i < elementos.lenght; i++){
            if(elementos[i] == 0){
                elementos[i] = chave;
                Contador += 1;          
            }
        }
        return false;
    }

    @Override
    public boolean delete(int chave) {
        for(i = 0; i < elementos.length; i++){
            if(elementos[i] == chave){
               elementos[i] = -1;               
            }

        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        for(i = 0; i < elementos.lenght; i++){
            if(elementos[i] == chave){
                return true;
            }
            else;
                return false;
        }        
    }

    // @Override
    // public int minimum() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    // @Override
    // public int maximum() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    // @Override
    // public int sucessor(int chave) {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    // @Override
    // public int prodessor(int chave) {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        r.delete(1);
    }
}
