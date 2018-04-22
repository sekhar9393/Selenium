package week4day4.testng.dependongroups;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/report.html");
	html.setAppendExisting(true);
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(html);
	ExtentTest test = extent.createTest("CreatelEad", "create lead test case");
	test.assignAuthor("sekhar");
	test.assignCategory("sanity");
	test.pass("Demo salesmanger clicked successfukyy",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
	extent.flush();

}
}