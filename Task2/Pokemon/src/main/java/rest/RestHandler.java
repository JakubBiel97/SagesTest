package rest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class RestHandler implements RestHandlerInt {
    public HttpResponse<JsonNode> callService(String address){
        try {
            return Unirest.get(address)
                    .header("accept", "application/json")
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }
    }
}
