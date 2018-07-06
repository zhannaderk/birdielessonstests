package co.inventorsoft.birdietests.tests;


import co.inventorsoft.birdietests.pages.InvitationsPage;
import co.inventorsoft.birdietests.pages.LeftSideBar;
import co.inventorsoft.birdietests.utils.AuthenticatedBaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class InvitationSending extends AuthenticatedBaseTest {

    private InvitationsPage invitations;
    private LeftSideBar leftSideBar;

    @BeforeClass
    public void init() {
        this.leftSideBar = new LeftSideBar(driver);
        this.invitations = new InvitationsPage(driver, this.leftSideBar);
    }

    @Test
    public void checkTestInvitation() {
        this.leftSideBar.clickInvitations();
        this.invitations.waitForInvitations();
        this.invitations.clickSelectTemplate();
        Assert.assertTrue(this.invitations.invitationModalIsDisplayed(), "Invitation modal is not displayed");

    }

}
