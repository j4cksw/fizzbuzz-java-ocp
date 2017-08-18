package in.jay;

public class FizzBuzzRule implements Rule{

    private final Rule buzzRule = new BuzzRule();
    private final Rule fizzRule = new FizzRule();

    public boolean isAccept(int number) {
        return buzzRule.isAccept(number) && fizzRule.isAccept(number);
    }

    public String getAnswer() {
        return Answers.FIZZBUZZ;
    }
}
