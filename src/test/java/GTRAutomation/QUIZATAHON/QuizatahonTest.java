
package GTRAutomation.QUIZATAHON;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import MyFunctions.quizatahonUserDefinedFunctions;

import java.awt.AWTException;
import java.awt.Robot;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 
public class QuizatahonTest extends quizatahonUserDefinedFunctions
{
	static QuizatahonPageSteps quizatahonPageSteps = new QuizatahonPageSteps();
	@Test(priority=1,dataProvider="getValues")
	public static void test_05(String fullName,String email,String permEmail,String organization,String city,String contactNumber,String linkedIn,String Question1,String Question2,String Question3,String Question4,String Question5, String Question6,String Question7,String Question8,String Question9,String Question10,String image) throws InterruptedException, AWTException
	{
		quizatahonPageSteps.clickOnQuizatahonTab();
		quizatahonPageSteps.tapClickHere();
		quizatahonPageSteps.bookNow();
		quizatahonPageSteps.addBookings();
		quizatahonPageSteps.fullName(fullName);
		quizatahonPageSteps.email(email);
  		quizatahonPageSteps.permanentEmailAddress(permEmail);
		quizatahonPageSteps.organization(organization);
		quizatahonPageSteps.city(city);
		quizatahonPageSteps.contactNumber(contactNumber);
		quizatahonPageSteps.linkedinProfile(linkedIn);
		quizatahonPageSteps.Question1(Question1);
		quizatahonPageSteps.Question2(Question2);
		quizatahonPageSteps.Question3(Question3);
		quizatahonPageSteps.Question4(Question4);
		quizatahonPageSteps.Question5(Question5);
		quizatahonPageSteps.Question6(Question6);
		quizatahonPageSteps.Question7(Question7);
		quizatahonPageSteps.Question8(Question8);
		quizatahonPageSteps.Question9(Question9);
		quizatahonPageSteps.Question10(Question10);
	    quizatahonPageSteps.uploadImage(image);
	    quizatahonPageSteps.submitAndRegisterNow();
        quizatahonPageSteps.downloadTicket();
	    
	}
  
}


