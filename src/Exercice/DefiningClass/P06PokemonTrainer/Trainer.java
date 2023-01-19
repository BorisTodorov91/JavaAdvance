package Exercice.DefiningClass.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String trainerName;
    private int trainerNumOfBadges;
    private List<Pokemon> pokemons;


    public Trainer(String trainerName) {
        this.trainerName = trainerName;
        this.trainerNumOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getTrainerNumOfBadges() {
        return trainerNumOfBadges;
    }

    public void setTrainerNumOfBadges(int trainerNumOfBadges) {
        this.trainerNumOfBadges = trainerNumOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void checkElement(List<Pokemon> pokemons, String elements) {
        boolean hasElement = false;
        for (Pokemon pokemon : pokemons) {

            if (pokemon.getPokemonElement().equals(elements)) {
                hasElement = true;
                break;
            }
        }
        if (!hasElement) {
            for (int i = pokemons.size() - 1; i >= 0; i--) {
                Pokemon pokemon = pokemons.get(i);
                pokemon.setPokemonHealthy(pokemon.getPokemonHealthy() - 10);
                if (pokemon.getPokemonHealthy() <= 0) {
                    pokemons.remove(pokemon);
                }
            }


        } else {
            this.trainerNumOfBadges += 1;
        }

    }
}