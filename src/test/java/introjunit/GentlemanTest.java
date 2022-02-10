package introjunit;

import introunit.Gentleman;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testCreate(){
        Gentleman gentleman = new Gentleman();

        String greeting = gentleman.sayHello("Tibi");

        assertThat("Hello Tibi", equalTo(greeting))  ;
    }
}
