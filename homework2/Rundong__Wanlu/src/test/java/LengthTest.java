import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class LengthTest {

    private Length lengthM = new Length(1, LengthUnit.M);
    private Length length3M = new Length(3, LengthUnit.M);
    private Length lengthCM = new Length(100, LengthUnit.CM);
    private Length lengthMM = new Length(1000, LengthUnit.MM);


    @Test
    public void test1MEqualTo100CM() throws Exception {
        assertTrue(lengthM.equalTo(lengthCM));
    }

    @Test
    public void testConvert100CMTo1000MM() throws Exception {
        Length convertedLength = lengthCM.convert(LengthUnit.MM);
        assertEquals(1000, convertedLength.getValue(), 0.01);
        assertEquals(LengthUnit.MM, convertedLength.getLengthUnit());
    }

    @Test
    public void testAddInSameUnits() throws Exception {
        Length sum = lengthM.addInSameUnits(length3M);
        assertEquals(4, sum.getValue(), 0.01);
        assertEquals(LengthUnit.M, sum.getLengthUnit());
    }

    @Test
    public void testAddInDifferentUnits() throws Exception {
        Length sum = lengthCM.addInDiffUnits(lengthMM, LengthUnit.MM);
        assertEquals(2000, sum.getValue(), 0.01);
        assertEquals(LengthUnit.MM, sum.getLengthUnit());
    }

    @Test
    public void testSubtractInSameUnits() throws Exception {
        Length diff = length3M.subtractInSameUnits(lengthM);
        assertEquals(2, diff.getValue(), 0.01);
        assertEquals(LengthUnit.M, diff.getLengthUnit());
    }

    @Test
    public void testSubtractInDifferentUnits() throws Exception {
        Length diff = length3M.subtractInDiffUnits(lengthCM, LengthUnit.MM);
        assertEquals(2000, diff.getValue(), 0.01);
        assertEquals(LengthUnit.MM, diff.getLengthUnit());
    }

    @Test
    public void testMultiply() throws Exception {
        Length product = lengthCM.multiply(3);
        assertEquals(300, product.getValue(), 0.01);
        assertEquals(LengthUnit.CM, product.getLengthUnit());
    }

    @Test
    public void testDivide() throws Exception {
        Length product = lengthM.divide(4);
        assertEquals(0.25, product.getValue(), 0.01);
        assertEquals(LengthUnit.M, product.getLengthUnit());
    }
}