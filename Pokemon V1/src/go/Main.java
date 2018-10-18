package go;


import objects.Jeu;
import objects.Pokemon;
import objects.Tournament;

public class Main {
    public static void main(String[] args) {

        Tournament tournoi = new Tournament("Le tournoi pour la vie",4);

        Pokemon stallone = new Pokemon("Stallone",100,10,"Force","Adrienne","Stallone Winner","Stallone perdu");
        Pokemon schwarzenegger = new Pokemon("Schwarzenegger",50,10,"Force","Terminator va gagner","schwarzi Winner","schwarzi perdu");
        Pokemon willis = new Pokemon("Willis", 200, 6,"Force","Une belle journée pour mourir","willis winner","willis perdu");
        Pokemon bond = new Pokemon("James Bond",1000,500,"All","Mon nom est Bond, James Bond", "Bond winner","Bond perdu");

        tournoi.addPokemon(stallone);
        tournoi.addPokemon(schwarzenegger);
        tournoi.addPokemon(willis);
        tournoi.addPokemon(bond);


        System.out.println("_____________");

        Jeu jeu = new Jeu(tournoi);
        jeu.lancement();

    }
}
