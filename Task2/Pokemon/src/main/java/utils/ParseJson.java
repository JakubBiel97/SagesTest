package utils;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParseJson {
    public static DamageMultiplications parse(String attackerType, JSONObject jsonObject){

        List<String> noDmg = new ArrayList<>();
        List<String> halfDmg = new ArrayList<>();
        List<String> doubleDmg = new ArrayList<>();

        //TODO - parse provided JsonObject and get noDmg/halfDmg/DoubleDmg

        return new DamageMultiplications(attackerType, noDmg, halfDmg, doubleDmg);
    }
}
