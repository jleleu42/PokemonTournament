package go;


import Facade.Facade;

public class Main {
    public static void main(String[] args) {


        Facade facade = new Facade();

        facade.createTournoi("Le tournoi pour la vie",4);

        facade.addPokemonToList("Stallone",999,1,"Force","Adrienne","Stallone Winner","Stallone perdu");
        facade.addPokemonToList("Schwarzenegger",50,10,"Force","Terminator va gagner","schwarzi Winner","schwarzi perdu");
        facade.addPokemonToList("Willis", 50, 6,"Force","Une belle journée pour mourir","willis winner","willis perdu");
        facade.addPokemonToList("James Bond",1000,1,"All","Mon nom est Bond, James Bond", "Bond winner","Bond perdu");



        System.out.println("_____________");

        facade.go();

    }
}
