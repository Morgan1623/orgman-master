package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {
    Date DemoDate = new Date();
    @Test

    public void buildUserDemography()
    {


        UserDemography userDemography = UserDemographyFactory
                .buildUserDemography("xyzconglo.co.za" ,"App Developer","346r65f","6th658",DemoDate);
        Assert.assertNotNull(userDemography);


    }
}