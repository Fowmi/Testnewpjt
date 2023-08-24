import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestEmp {
    @Test(priority = 2)
    public void hjj()
    {
        System.out.println("gghh");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 1)
    public void aa() {
        System.out.println("klm");
    }
}
