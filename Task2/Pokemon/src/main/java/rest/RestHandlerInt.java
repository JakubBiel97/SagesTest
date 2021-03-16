package rest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public interface RestHandlerInt {
    HttpResponse<JsonNode> callService(String address);
}
