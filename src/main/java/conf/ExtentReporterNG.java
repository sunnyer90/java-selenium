package conf;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;

	public static ExtentReports getReportObject() {
		
		String path = ".//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Reports");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sunny Mittal");
		return extent;
		
	}
}
