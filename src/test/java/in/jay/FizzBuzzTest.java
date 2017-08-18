package in.jay;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {


    private FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void test_1_shouldReturn_1(){
        String result = fizzBuzz.say(1);

        Assert.assertEquals(result, "1");
    }

    @Test
    public void test_2_shouldReturn_2(){
        String result = fizzBuzz.say(2);

        Assert.assertEquals(result, "2");
    }

    @Test
    public void test_3_shouldReturn_fizz(){
        String result = fizzBuzz.say(3);

        Assert.assertEquals(result, Answers.FIZZ);
    }

    @Test
    public void test_4_shouldReturn_4(){
        String result = fizzBuzz.say(4);

        Assert.assertEquals(result, "4");
    }

    @Test
    public void test_5_shouldReturn_buzz(){
        String result = fizzBuzz.say(5);

        Assert.assertEquals(result, Answers.BUZZ);
    }

    @Test
    public void test_6_shouldReturn_fizz(){
        String result = fizzBuzz.say(6);

        Assert.assertEquals(result, Answers.FIZZ);
    }

    @Test
    public void test_10_shouldReturn_buzz(){
        String result = fizzBuzz.say(10);

        Assert.assertEquals(result, Answers.BUZZ);
    }

    @Test
    public void test_15_shouldReturn_fizzbuzz(){
        String result = fizzBuzz.say(15);

        Assert.assertEquals(result, Answers.FIZZBUZZ);
    }
}
