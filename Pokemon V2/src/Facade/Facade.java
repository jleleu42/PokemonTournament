package Facade;

import exceptions.ErrorAddException;
import exceptions.LimitMaxException;
import objects.Jeu;
import objects.Pokemon;
import objects.Tournament;


public class Facade {
    private Tournament tournoi;

    public Facade() {
    }

    public void createTournoi(String name, int maxPokemon){
        this.tournoi = new Tournament(name,maxPokemon);
    }

    public void addPokemonToList(String name, int lifeLevel, int powerLevel, String powerType, String shoutBattle, String shoutVictory, String shoutLoose){
        try {
            tournoi.addPokemon(new Pokemon(name,lifeLevel,powerLevel,powerType,shoutBattle,shoutVictory,shoutLoose));
        } catch (ErrorAddException e) {
            System.out.println(e.getMessage());
        } catch (LimitMaxException e) {
            System.out.println(e.getMessage());
        }
    }

    public void go(){
        Jeu jeu = new Jeu(tournoi);
        jeu.lancement();
    }



}
