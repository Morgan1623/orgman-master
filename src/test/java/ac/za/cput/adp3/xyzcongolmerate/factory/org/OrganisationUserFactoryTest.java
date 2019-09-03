package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser()
    {
        OrganisationUser organisationUser = OrganisationUserFactory
                .buildOrganisationUser("xyzconglo", "zyxconglo@xyzconglo.co.za");
        Assert.assertNotNull(organisationUser);


    }
}