import static org.junit.Assert.*;
import org.junit.*;

public class copyListTest {
    Integer[] arr = {1,2,3,4,5};
    copyList listTest;
    private void setUp(){
        listTest = new copyList(arr);
    }


    
    @Test
    public void sizeTester(){
        setUp();
        assertEquals("expected", 5,listTest.returnSize()); //should pass
    }

    
}
