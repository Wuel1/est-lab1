public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int Contador;

    public ListaArray(){
        elementos = new int[10];
        Contador = 0;
    }

    @Override
    public boolean insert(int chave){              
        for(int i = 0; i < elementos.length; i++){           
            if(elementos[Contador] == 0 && Contador < elementos.length){
                elementos[Contador] = chave;
                Contador += 1;
                return true;                                
            }            
        }
        return false;
    }
    public boolean delete(int chave){
        for(int i = 0; i < Contador; i++){
            if(elementos[i] == chave){
                elementos[i] = 0;
                for(int j = i; j < Contador;j++){
                    int controle = elementos[j];
                    elementos[j] = elementos[j+1];
                    elementos[j+1] = controle;               
                }
             Contador -= 1;
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
        int min = elementos.length;
        for(int i = 0; i < Contador; i++){
            if(min > elementos[i]){                
                min = elementos[i];
            }
        }
        return min;
    }
    public int maximum(){
        int max = 0;
        for(int i = 0; i < Contador; i++){
            if(max < elementos[i]){
                max = elementos[i];
            }            
        }
        return max;     
    }
    public int sucessor(int chave){
        int sucessor =  0;
        if(search(chave)){
            for(int i = 0; i < Contador; i++){
                if(elementos[i] == chave){
                    sucessor = elementos[i+1];
                    return sucessor;
                }
            }
        }
        return sucessor;
    }
    public int prodessor(int chave){
        int prodessor =  0;
        if(search(chave)){
            for(int i = 0; i < Contador; i++){
                if(elementos[i] == chave){
                    prodessor = elementos[i-1];
                    return prodessor;
                }
            }
        }
        return prodessor;
    }
    
    public void mostrar(){
        for(int i = 0; i < elementos.length; i++){
            System.out.println(elementos[i]);
        }
    }


    public static void main(String[] args) {
        ListaArray teste = new ListaArray();
        teste.insert(10);
        teste.insert(11);
        teste.insert(12);
        teste.insert(13);
        teste.insert(15);
        teste.insert(19);
        teste.insert(47);
        teste.insert(15);
        teste.insert(20);    
    
        
        System.out.println(teste.maximum());
        System.out.println(teste.minimum());
        System.out.println(teste.sucessor(13));
        System.out.println(teste.prodessor(15));
        System.out.println(teste.search(11));
        teste.delete(47);
        System.out.println(teste.maximum());        
        }
}

