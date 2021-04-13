package garadicorsa;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        
        Corridore.metri = 100;
        Corridore.stampaArrivo = true;
        Corridore.ogniQuantoStampare = 10;
        
        ArrayList<Corridore> lista = new ArrayList<>();
        int n = 7;
        
        for(int i = 0; i < n; i++){
            lista.add(new Corridore("Corridore-" + (i+1)));
                    
        }
        
        for(Corridore c : lista) c.start();
        for (Corridore c : lista) try{c.join();}catch(Exception e){}
        
        Corridore.stampaClassifica();
    }
    
}
