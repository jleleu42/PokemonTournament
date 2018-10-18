package objects;

import exceptions.ErrorAddException;
import exceptions.LimitMaxException;

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


    public boolean addPokemon(Pokemon poke) throws ErrorAddException, LimitMaxException {
        boolean retour = false;
        if (fighter.size()==this.getMaxPokemon()){
            throw new LimitMaxException();
        }
        else if (fighter.add(poke)){
            System.out.println("Pokemon " + poke.getName() + " ajouté");
            retour = true;
        }
        else{
            throw new ErrorAddException();
        }
        return retour;
    }


}
