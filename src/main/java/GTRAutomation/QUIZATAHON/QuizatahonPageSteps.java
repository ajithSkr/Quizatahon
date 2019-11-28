package GTRAutomation.QUIZATAHON;
import java.awt.AWTException;
import java.awt.print.Pageable;
import java.lang.StackWalker.Option;
import java.util.ArrayList;import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.testng.annotations.Test;

import MyFunctions.quizatahonUserDefinedFunctions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.*;


import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class QuizatahonPageSteps extends quizatahonUserDefinedFunctions   
{
	@Step("Click on Quizatahon tab")
	public void clickOnQuizatahonTab() throws InterruptedException
	{
		clickElementByXpath(QuizatahonPageobject.quizatahon);
		waitUntilTheElementIsVisible(QuizatahonPageobject.quizatahon);
	}
	@Step("Tap Click here")
	public void tapClickHere() throws InterruptedException
	{
		scrollDown();
		waitUntilTheElementIsClickable(QuizatahonPageobject.clickHere);
		clickElementByXpath(QuizatahonPageobject.clickHere);
	}
	@Step("Book now")
	public void bookNow() throws InterruptedException
	{  
		
		newTab(1);
		Thread.sleep(4000);
		scrollDown();
		waitUntilTheElementIsVisible(QuizatahonPageobject.bookNowButton);
		clickElementByXpath(QuizatahonPageobject.bookNowButton);
	}
	@Step("Add bookings")
	public void addBookings() throws InterruptedException
	{
		waitUntilTheElementIsClickable(QuizatahonPageobject.addBooking);
		clickElementByXpath(QuizatahonPageobject.addBooking);
		waitUntilTheElementIsClickable(QuizatahonPageobject.proceedButton);
		clickElementByXpath(QuizatahonPageobject.proceedButton);
		
		
	}
	@Step("Full Name")
	public void fullName(String fullName) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.fullName);
		refreshElement(QuizatahonPageobject.fullName);
		typeByXpath(QuizatahonPageobject.fullName,fullName);
		
	}
	@Step("Email address")
	public void email(String email) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.email);
		refreshElement(QuizatahonPageobject.email);
		typeByXpath(QuizatahonPageobject.email,email);
		
	}
	@Step("Permanent Email Address")
	public void permanentEmailAddress(String permanentMail) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.permanentEmailAddress);
		refreshElement(QuizatahonPageobject.permanentEmailAddress);
		typeByXpath(QuizatahonPageobject.permanentEmailAddress,permanentMail);
		
	}
	@Step("Organization")
	public void organization(String organization) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.organization);
		refreshElement(QuizatahonPageobject.organization);
		typeByXpath(QuizatahonPageobject.organization,organization);
		
	}
	@Step("City")
	public void city(String city) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.city);
		refreshElement(QuizatahonPageobject.city);
		typeByXpath(QuizatahonPageobject.city,city);
		
	}
	@Step("Contact Number")
	public void contactNumber(String contactNumber) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.contactNumber);
		refreshElement(QuizatahonPageobject.contactNumber);
		typeByXpath(QuizatahonPageobject.contactNumber,contactNumber);
		
	}
	@Step("Linked Profile")
	public void linkedinProfile(String LinkedIn) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.linkedInProfile);
		refreshElement(QuizatahonPageobject.linkedInProfile);
		typeByXpath(QuizatahonPageobject.linkedInProfile,LinkedIn);
		
	}
	@Step("Question 1")
	public void Question1(String Question1) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu1);
		dropDownOption(QuizatahonPageobject.dropDownMenu1, Question1);
		
	}
	@Step("Question 2")
	public void Question2(String Question2) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu2);
		dropDownOption(QuizatahonPageobject.dropDownMenu2, Question2);
		
	}
	@Step("Question 3")
	public void Question3(String Question3) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu3);
		dropDownOption(QuizatahonPageobject.dropDownMenu3,Question3);
		
	}
	@Step("Question 4")
	public void Question4(String Question4) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu4);
		dropDownOption(QuizatahonPageobject.dropDownMenu4, Question4);
		
	}
	@Step("Question 5")
	public void Question5(String Question5) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu5);
		dropDownOption(QuizatahonPageobject.dropDownMenu5, Question5);
		
	}
	@Step("Question 6")
	public void Question6(String Question6) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu6);
		dropDownOption(QuizatahonPageobject.dropDownMenu6, Question6);
		
	}
	@Step("Question 7")
	public void Question7(String Question7) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu7);
		dropDownOption(QuizatahonPageobject.dropDownMenu7, Question7);
		
	}
	@Step("Question 8")
	public void Question8(String Question8) throws InterruptedException
	{
		waitForParticularTime();
		scrollUsingElement(QuizatahonPageobject.dropDownMenu8);
		dropDownOption(QuizatahonPageobject.dropDownMenu8, Question8);
		
	}
	@Step("Question 9")
	public void Question9(String Question9) throws InterruptedException
	{
		
		scrollUsingElement(QuizatahonPageobject.dropDownMenu9);
		dropDownOption(QuizatahonPageobject.dropDownMenu9, Question9);
		Thread.sleep(3000);
	}
	@Step("Question 10")
	public void Question10(String Question10) throws InterruptedException
	{
		scrollUsingElement(QuizatahonPageobject.dropDownMenu10);
		dropDownOption(QuizatahonPageobject.dropDownMenu10, Question10);
		Thread.sleep(3000);

	}
	@Step("Upload Image")
	public void uploadImage(String image) throws InterruptedException, AWTException
	{

		Thread.sleep(2000);
		scrollUsingElement(QuizatahonPageobject.uploadImage);
		clickElementByXpath(QuizatahonPageobject.uploadImage);
		Thread.sleep(3000);
		robotKey(image);


	}
	@Step("Submit and Register Now")
	public void submitAndRegisterNow() throws InterruptedException
	{
		
		waitUntilTheElementIsVisible(QuizatahonPageobject.continueButton);
		clickElementByXpath(QuizatahonPageobject.continueButton);
		waitUntilTheElementIsVisible(QuizatahonPageobject.registerNowButton);
		clickElementByXpath(QuizatahonPageobject.registerNowButton);
		
	}
	@Step("Download ticket")
	public void downloadTicket() throws InterruptedException
	{
		waitUntilTheElementIsClickable(QuizatahonPageobject.downloadTicket);
		clickElementByXpath(QuizatahonPageobject.downloadTicket);
	
		
	}

}
