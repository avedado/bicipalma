package edu.estatuas.bicicleta;

import edu.estatuas.domain.bicicleta.Bicicleta;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class BicicletaTest {

    @Test
    public void test_constructor_bicicleta(){
        //ARRANGE
        //int idExpected=101;
        //ACT
        Bicicleta bici = new Bicicleta(101);
        //ASSERT
        assertEquals(101, bici.getId());
    }

    @Test
    public void test_toString_bicicleta(){
        //ARRANGE
        String id= "101";
        //ACT
        Bicicleta bici = new Bicicleta(101);
        String representacionIdBici =bici.toString();
        //ASSERT
        assertEquals(representacionIdBici, "101");
    }
}
