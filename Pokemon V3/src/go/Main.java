package go;


import Facade.Facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom du tournoi :");
        String nomTournoi = sc.nextLine();
        System.out.println("Nom du tournoi : " + nomTournoi);


        System.out.println("Veuillez saisir le nombre de participant au Pokemon Tournament :");
        int nbParticipant = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre de participant max : " + nbParticipant);

        Facade facade = new Facade();
        facade.createTournoi(nomTournoi,nbParticipant);


        for(int i = 0 ; i < nbParticipant ; i++){
            System.out.println("Veuillez saisir le nom du pokemon :");
            String name = sc.nextLine();
            System.out.println("Veuillez saisir le niveau de vie du pokemon :");
            int lifeLevel= sc.nextInt();
            sc.nextLine();
            System.out.println("Veuillez saisir le niveau de pouvoir du Pokemon :");
            int powerLevel = sc.nextInt();
            sc.nextLine();
            System.out.println("Veuillez saisir le type de pouvoir :");
            String powerType = sc.nextLine();
            System.out.println("Veuillez saisir le cris de combat :");
            String shoutBattle = sc.nextLine();
            System.out.println("Veuillez saisir le cris de victoire :");
            String shoutVictory = sc.nextLine();
            System.out.println("Veuillez saisir le cris de défaite :");
            String shoutLoose = sc.nextLine();
            facade.addPokemonToList(name,lifeLevel,powerLevel,powerType,shoutBattle,shoutVictory,shoutLoose);
        }


        /*
        Facade facade = new Facade();
        facade.createTournoi("Le tournoi pour la vie",4);
        facade.addPokemonToList("Stallone",999,300,"Force","Adrienne","Stallone Winner","Stallone perdu");
        facade.addPokemonToList("Schwarzenegger",50,10,"Force","Terminator va gagner","schwarzi Winner","schwarzi perdu");
        facade.addPokemonToList("Willis", 50, 6,"Force","Une belle journée pour mourir","willis winner","willis perdu");
        facade.addPokemonToList("James Bond",1000,200,"All","Mon nom est Bond, James Bond", "Bond winner","Bond perdu");
        */



        System.out.println("_____________");

        facade.go();

    }


}
