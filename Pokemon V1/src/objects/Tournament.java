package objects;

import java.util.ArrayList;

public class Tournament {
    private String name;
    private int maxPokemon;
    private ArrayList<Pokemon> fighter;

    public Tournament(String name, int maxPokemon) {
        this.name = name;
        this.maxPokemon = maxPokemon;
        fighter = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPokemon() {
        return maxPokemon;
    }

    public void setMaxPokemon(int maxPokemon) {
        this.maxPokemon = maxPokemon;
    }

    public ArrayList<Pokemon> getFighter() {
        return fighter;
    }

    public void setFighter(ArrayList<Pokemon> fighter) {
        this.fighter = fighter;
    }

    public boolean addPokemon(Pokemon poke){
        boolean retour = false;
        if (fighter.size()==this.getMaxPokemon()){
            //TODO : ajouter exception du nb max
            System.out.println("Le nombre max de pokemon est déjà atteint");
            retour = false;
        }
        else if (fighter.add(poke)){
            System.out.println("Pokemon ajouté");
            retour = true;
        }
        else{
            // TODO : ajouter exception d'erreur d'ajout
            retour = false;
        }
        return retour;
    }


}
