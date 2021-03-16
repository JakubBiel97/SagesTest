import rest.PokemonAPIHandlerInt;
import service.PokemonDamageService;
import service.PokemonDamageServiceInt;

public class main {
    public static void main(String[] args) {

        PokemonDamageServiceInt pokemonDamageService = new PokemonDamageService();
        Double damageMultiplication = pokemonDamageService.getDamageMultiplication("fire", "grass");
        System.out.println("Damage multiplication: " + damageMultiplication);
    }
}
