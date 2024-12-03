package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

public class SearchEmployeeSteps extends CommonMethods {


    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        //WebElement PimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        click(searchEmployeePage.PimOption);
    }

    @When("user cliks on employee list option")
    public void user_cliks_on_employee_list_option() {
        //WebElement EmployeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        click(searchEmployeePage.EmployeeList);
    }

}