import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test 
    public void multiplication() {
        assertEquals(10, SkillDemo.multiply(5, 4)); //fails
    }  
}
