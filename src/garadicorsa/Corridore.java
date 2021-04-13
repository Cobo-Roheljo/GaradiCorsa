/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

import java.io.PrintStream;
import java.util.ArrayList;

public class Corridore {
    
    public static int metri = 100;
    public static ArrayList<String> classifica = new Arraylist<>();
    public static boolean stampaArrivo = false;
    public static int ogniQuantoStampare =1;
    private static Object clasiffica;
    
    
    
    public Corridore(String nome){
        super(nome);
    }
    
    @Override
    public void run(){
        for(int i = 0; i < metri; i++){
            System.out.println(super.getNome() + " " + (i+1) + "m");
        }
        assegnazioneClassifica(super.getNome());
    }
    
    public static synchronized void assegnazioneClassifica(String nome){
        if(stampaArrivo) stampaArrivo(nome);
        classifica.add(nome);
    }
    
    public static void stampaArrivo(String nome){
        System.out.println("-------------"+ nome + " ha concluso la gara.");
    }
    
    public static void stampaClassifica(){
        for(int i = 0; i < classifica.size(); i++){
            PrintStream println;
            println = System.out.println("n." +(i+1) + " > "+ clasiffica.get(i));
        }
    }
    
    
}
