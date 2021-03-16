package service;

import org.json.JSONObject;
import rest.PokemonAPIHandler;
import rest.PokemonAPIHandlerInt;
import utils.DamageMultiplications;
import utils.ParseJson;

public class PokemonDamageService implements PokemonDamageServiceInt {

    PokemonAPIHandlerInt pokemonAPIHandler = new PokemonAPIHandler();

    @Override
    public Double getDamageMultiplication(String attacker, String defender) {
        JSONObject damageRelationsFromAttacker = pokemonAPIHandler.getDamageRelationsFromType(attacker);
        DamageMultiplications damageMultiplicationsObject = ParseJson.parse(attacker,damageRelationsFromAttacker);

        return damageMultiplicationsObject.getDmgMultiplication(defender);

    }
}
