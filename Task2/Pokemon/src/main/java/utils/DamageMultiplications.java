package utils;

import java.util.List;

public class DamageMultiplications {
    String attackerType;
    //TODO can be switch to a map and add all types wit multiplications - easier and faster for calculatingh
    List<String> noDmg;
    List<String> halfDmg;
    List<String> doubleDmg;

    public DamageMultiplications(String attackerType, List<String> noDmg, List<String> halfDmg, List<String> doubleDmg) {
        this.attackerType = attackerType;
        this.noDmg = noDmg;
        this.halfDmg = halfDmg;
        this.doubleDmg = doubleDmg;
    }

    public double getDmgMultiplication(String type){
        if(noDmg.contains(type)){
            return 0;
        } else if(halfDmg.contains(type)){
            return 0.5;
        } else if(doubleDmg.contains(type)) {
            return 2;
        } else {
            return 1;
        }
    }
}
