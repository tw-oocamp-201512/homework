import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jsun on 12/3/15.
 */
public class LengthTest {
    @Test
    public void testEquals5cmEquals50mm(){
        int value = 5;
        Length length1 = new Length(value, LengthUnit.CM);
        Length length2 = new Length(50, LengthUnit.MM);
        assertEquals(length1,length2);
    }
}
