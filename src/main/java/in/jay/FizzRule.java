package in.jay;

public class FizzRule implements  Rule {

    public boolean isAccept(int number) {
        return number %3 == 0;
    }

    public String getAnswer() {
        return Answers.FIZZ;
    }
}
