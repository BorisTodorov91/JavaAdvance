package Exercice.DefiningClass.P06PokemonTrainer;

public class Pokemon {
    private String pokemonName;
    private String pokemonElement;
    private int pokemonHealthy;

    public Pokemon(String pokemonName, String pokemonElement, int pokemonHealthy) {
        this.pokemonName = pokemonName;
        this.pokemonElement = pokemonElement;
        this.pokemonHealthy = pokemonHealthy;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonElement() {
        return pokemonElement;
    }

    public void setPokemonElement(String pokemonElement) {
        this.pokemonElement = pokemonElement;
    }

    public int getPokemonHealthy() {
        return pokemonHealthy;
    }

    public void setPokemonHealthy(int pokemonHealthy) {
        this.pokemonHealthy = pokemonHealthy;
    }
}
