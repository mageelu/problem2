import java.util.HashMap;

public abstract class Pizza {
    String desc = "Generic pizza";

    public String getDesc(){
        return desc;
    }
    public abstract double cost();

    public String prettyPrint() {
        HashMap<String, Integer> parsedToppings = new HashMap<String, Integer>();
        String[] fetchToppings = desc.split(", ");
        if (fetchToppings.length == 1) {
            return getDesc() + ", for $" + cost();
        }
        for (String thisTopping : fetchToppings){
            if (!parsedToppings.containsKey(thisTopping)) {
                parsedToppings.put(thisTopping, 0);
            }
            Integer thisCount = parsedToppings.get(thisTopping);
            parsedToppings.replace(thisTopping, thisCount + 1);
        }
        StringBuilder res = new StringBuilder(desc + " with");
        String[] keys = parsedToppings.keySet().toArray(new String[10]);
        for (int i = 0; i < keys.length; i++) {
            if ((i + 1) == keys.length) { res.append(", and"); }
            switch (parsedToppings.get(keys[i])){
                case 1:
                    res.append(", ").append(keys[i]);           //Fix PrettyPrint. Looks like an issue with
                case 2:                                         //this chunk of code, based on the output.
                    res.append(", double ").append(keys[i]);
                case 3:
                    res.append(", triple ").append(keys[i]);
                default:
                    res.append(", lots of ").append(keys[i]);
            }
        }
        return res + ", for $" + cost();
        }
    }