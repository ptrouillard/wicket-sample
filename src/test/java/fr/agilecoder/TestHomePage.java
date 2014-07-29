package fr.agilecoder;

import fr.agilecoder.pages.home.HomePage;
import org.apache.wicket.util.tester.WicketTester;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
	private WicketTester tester;

	@BeforeMethod
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
        //start and render the test page
        tester.startPage(HomePage.class);
	}

	@Test
	public void homepageRendersSuccessfully()
	{
		//assert rendered page class
		tester.assertRenderedPage(HomePage.class);
	}

    @Test(enabled = false)
    public void switchLabelTest(){
        //assert rendered page class
        tester.assertRenderedPage(HomePage.class);
        //assert rendered label
        tester.assertLabel("label", "First label");
        //simulate a click on "reload" button
        tester.clickLink("reload");
        //assert rendered label
        tester.assertLabel("label", "Second label");
    }
}
