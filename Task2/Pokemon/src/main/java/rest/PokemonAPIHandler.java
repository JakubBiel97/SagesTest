package rest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import org.json.JSONObject;

public class PokemonAPIHandler implements PokemonAPIHandlerInt {

    private final RestHandlerInt restHandlerInt = new RestHandler();
    private static final String SERVER_PATH = "https://pokeapi.co/api/v2/type/";

    @Override
    public JSONObject getDamageRelationsFromType(String type) {
        HttpResponse<JsonNode> jsonNodeHttpResponse = restHandlerInt.callService(SERVER_PATH + type);
        JSONObject fullJsonObject = jsonNodeHttpResponse.getBody().getObject();
        return fullJsonObject.getJSONObject("damage_relations");
    }
}
