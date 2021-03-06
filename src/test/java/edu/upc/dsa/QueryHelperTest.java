package edu.upc.dsa;

import edu.upc.dsa.models.*;
import edu.upc.dsa.util.QueryHelper;
import org.junit.Assert;
import org.junit.Test;

public class QueryHelperTest {


    @Test
    public void testQueryINSERT() {
        Assert.assertEquals("INSERT INTO UserAUX (ID,name,password,mail) VALUES (?,?,?,?)",
                QueryHelper.createQueryINSERT(new UserAUX("Juan", "lopez", "333333")));
    }

    @Test
    public void testQueryINSERT2() {
        Assert.assertEquals("INSERT INTO Deparment (ID,name,description) VALUES (?,?,?)",
                QueryHelper.createQueryINSERT(new Items("ENTEL", "ENGINYERIA TELEMÀTICA")));
    }

    @Test
    public void testQuerySELECT() {

        Assert.assertEquals("SELECT * FROM Employee WHERE ID = ?",
               QueryHelper.createQuerySELECT(new User("Juan", "lopez", "333333")));
    }

    @Test
    public void testQuerySELECT2() {
        Assert.assertEquals("SELECT * FROM Deparment WHERE ID = ?",
                QueryHelper.createQuerySELECT(new Items("ENTEL", "ENGINYERIA TELEMÀTICA")));
    }

    @Test
    public void testQueryDELETE() {

        Assert.assertEquals("DELETE * FROM Employee WHERE ID = ?",
                QueryHelper.createQueryDELETE(new User("Juan","lopez", "333333")));
    }

    @Test
    public void testQueryUPDATE() {
       /* Assert.assertEquals("UPDATE Employee SET (ID,name,surname,salary) WHERE ID = ?",
         QueryHelper.createQueryUPDATE(new Employee("Juan", "lopez", 1000000)));

        */
        Assert.assertEquals("UPDATE Employee SET salary = ? WHERE ID = ?",
                QueryHelper.createQueryUPDATE( new User("Juan", "lopez", "100")));

    }
}
