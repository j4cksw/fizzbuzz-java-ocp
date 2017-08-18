package in.jay;

public class FizzBuzz {

    public String say(int number) {

        for (Rule rule: Rules.make()) {
            if (rule.isAccept(number)){
                return rule.getAnswer();
            }
        }

        return Integer.toString(number);
    }

}