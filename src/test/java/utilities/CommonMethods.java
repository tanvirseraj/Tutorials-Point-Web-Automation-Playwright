package utilities;
import java.io.IOException;
import com.microsoft.playwright.Locator;
import basedriver.BaseDriver;
public class CommonMethods {
	public void fillField(Locator field, String value) throws IOException {
		field.fill(value);
	}

}
