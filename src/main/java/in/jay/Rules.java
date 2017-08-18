package in.jay;


import java.util.ArrayList;
import java.util.List;

public class Rules {

    public static List<Rule> make(){
        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new FizzBuzzRule());
        rules.add(new BuzzRule());
        rules.add(new FizzRule());

        return rules;
    }
}
