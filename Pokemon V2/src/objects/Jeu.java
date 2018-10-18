package objects;

import exceptions.NbFighterException;
import exceptions.TooMuchFighterException;
import exceptions.ZeroFighterException;

import java.util.ArrayList;
import java.util.Iterator;

public class Jeu {
    private Tournament tournoi;



    public Jeu(Tournament tournoi) {
        this.tournoi = tournoi;
    }

    // si true alors on peut lancer les combats
    private boolean verification() throws TooMuchFighterException, NbFighterException, ZeroFighterException {
        boolean retour = false;
        if (tournoi.getMaxPokemon()<tournoi.getFighter().size()){
            throw new TooMuchFighterException();
        }
        // on verifie si on peut vraiment faire du 1 vs 1 -> en gros si on a un nombre pair
        else if((tournoi.getFighter().size() % 2) != 0){
            throw new NbFighterException();
        }
        else if(tournoi.getFighter().size() == 0){
            throw new ZeroFighterException();
        }
        else{
            retour = true;
        }
        return retour;
    }

    // Lance le jeu
    public void lancement(){
        // verification des parametres
        try {
            verification();
        } catch (TooMuchFighterException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        } catch (NbFighterException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        } catch (ZeroFighterException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        // cris de combat
        Iterator<Pokemon> it = tournoi.getFighter().iterator();
        while(it.hasNext()){
            Pokemon poke = it.next();
            System.out.println(poke.getShoutBattle());
        }
        System.out.println("_____________");
        System.out.println("morituri te salutant");
        System.out.println("_____________");

        // battle
        while (tournoi.getFighter().size() != 1){
            combat();
        }

        // cris du winner
        System.out.println(tournoi.getFighter().get(0).getShoutVictory());
    }

    // Fait se battre la liste des pokemon encore vivant sur ce tour
    private void combat(){
        ArrayList<Pokemon> listPokeMort = new ArrayList<>();
        for(int i = 0 ; i < tournoi.getFighter().size() ; i+=2){
            listPokeMort.add(versus(tournoi.getFighter().get(i),tournoi.getFighter().get(i+1)));
        }
        tournoi.getFighter().removeAll(listPokeMort);
    }


    // Fait se battre 2 pokemons passés en paramètre et renvoi le perdant
    private Pokemon versus(Pokemon p1, Pokemon p2){
        Pokemon pokeASuppr = null;
        int tour = 1;
        System.out.println("-> " + p1.getName() + " vs " + p2.getName());
        while(p1.getLifeLevel() > 0 && p2.getLifeLevel() > 0){
            p1.setLifeLevel(p1.getLifeLevel() - p2.getPowerLevel());
            p2.setLifeLevel(p2.getLifeLevel() - p1.getPowerLevel());
            System.out.println("  -------- TOUR " + tour + " --------");
            System.out.println("  - " + p1.getName() + " life level : " + p1.getLifeLevel());
            System.out.println("  - " + p2.getName() + " life level : " + p2.getLifeLevel());
            tour++;
        }

        if(p1.getLifeLevel() < 0){
            System.out.println("  " + p1.getShoutLoose());
            pokeASuppr = p1;
        }
        else{
            System.out.println("  " + p2.getShoutLoose());
            pokeASuppr = p2;
        }
        System.out.println("<- " + p1.getName() + " vs " + p2.getName() + "\r\n");
        return pokeASuppr;
    }

}
