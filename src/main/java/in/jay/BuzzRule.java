package in.jay;

public class BuzzRule implements Rule {

    public boolean isAccept(int number) {
        return number % 5 == 0;
    }

    public String getAnswer() {
        return Answers.BUZZ;
    }
}
