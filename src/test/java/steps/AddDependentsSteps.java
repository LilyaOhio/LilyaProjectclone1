package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AddDependentsPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.util.List;

public class AddDependentsSteps extends CommonMethods {
    //AddDependentsPage addDependentsPage=new AddDependentsPage();


    @When("user enter emplyee ID {string}")
    public void user_enter_emplyee_id(String string) {

        //WebElement empID = driver.findElement(By.id("empsearch_id"));
        //empID.sendKeys(string);
        sendText(string,searchEmployeePage.empID);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //WebElement search = driver.findElement(By.id("searchBtn"));
        click(searchEmployeePage.search);
    }



@Then("user is albe to see employee")
    public void user_is_albe_to_see_employee() {
        System.out.println("passed");
    }


    @When("user clicks on ID number")
    public void user_clicks_on_id_number() {
        //WebElement IDnumber = driver.findElement(By.xpath("//a[text()='EssUpdate S']"));
        //IDnumber.click();
        click(addDependentsPage.IDnumber);
    }

    @When("user clicks on Dependents option")
    public void user_clicks_on_dependents_option() {
        //WebElement Dependents = driver.findElement(By.xpath("//a[text()='Dependents']"));
        //Dependents.click();
        click(addDependentsPage.Dependents);
    }

    @When("user clicks on Add option")
    public void user_clicks_on_add_option() {
        WebElement Addoption = driver.findElement(By.id("btnAddDependent"));
        click(addDependentsPage.Addoption);
    }

    @Then("user enter firstname {string}")
    public void user_enter_firstname(String string) {
        //WebElement firstName = driver.findElement(By.id("dependent_name"));
        //firstName.sendKeys(string);
        sendText(string, addDependentsPage.firstName);
    }


    @When("user select relationship")
    public void user_select_relationship() {
        WebElement Relationship = driver.findElement(By.xpath("//select[@id='dependent_relationshipType']"));
        Select sel = new Select(Relationship);
        sel.selectByIndex(1);




    }

    @Then("user enters Date of Birth")
    public void user_enters_date_of_birth() {
        WebElement Dateofbirth = driver.findElement(By.id("dependent_dateOfBirth"));
        Dateofbirth.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(month);
        sel.selectByValue("2");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1 = new Select(year);
        sel1.selectByValue("2014");

        List<WebElement> Alldate = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
        for (WebElement date : Alldate) {
            if (date.getText().equals("3")) {
                date.click();

            }
        }
    }
    @Then("dependets saved successfully")
    public void dependets_saved_successfully () {
        //WebElement saveButton = driver.findElement(By.id("btnSaveDependent"));
        //saveButton.click();
        click(addDependentsPage.saveButton);

    }
    @Then("Error messages should be clear, easily visible {string}")
    public void error_messages_should_be_clear_easily_visible(String text) {
WebElement required= driver.findElement(By.xpath("//span[text()='Required']"));
sendText(text,addDependentsPage.required);
    }


}


