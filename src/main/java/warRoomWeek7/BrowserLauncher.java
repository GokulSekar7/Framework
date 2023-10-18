package warRoomWeek7;

public class BrowserLauncher {
	
	public static void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome launched successfully");
		}else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("Edge launched successfully");
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Firefox launced successfully");
		}else if(browser.equalsIgnoreCase("ie")) {
			System.out.println("Internet explorer launched successfully");
		}else if(browser.equalsIgnoreCase("safari")) {
			System.out.println("Safari launched successfully");
		}
	}
	
	
	public static void main(String[] args) {
		launchBrowser("chrome");
		launchBrowser("edge");
		launchBrowser("firefox");
		launchBrowser("ie");
		launchBrowser("safari");
	}
}

