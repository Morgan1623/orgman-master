package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserFactoryTest {
    Date userDate = new Date();

    @Test
    public void buildUser()
    {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("209135816@mycput.ac.za"

                ,"App Developer","ccy55f","t673wfe4",userDate);



        Assert.assertNotNull(userDemography);


    }
}