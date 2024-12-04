package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddDependentsPage extends CommonMethods {

    @FindBy(xpath="//a[text()='EssUpdate S']")
    public WebElement IDnumber;

    @FindBy(xpath="//a[text()='Dependents']")
    public WebElement Dependents;

    @FindBy(id="btnAddDependent")
    public WebElement Addoption;

    @FindBy(id="dependent_name")
    public WebElement firstName;


    @FindBy(id="dependent_dateOfBirth")
    public WebElement Dateofbirth;

    @FindBy(xpath="//select[@class='ui-datepicker-month']")
    public WebElement monthlocator;


    @FindBy(xpath="//select[@class='ui-datepicker-year']")
    public WebElement yearlocator;

    @FindBy(xpath="//a[@class='ui-state-default ui-state-active']")
    public WebElement day;

    @FindBy(id = "btnSaveDependent")
    public WebElement saveButton;

    @FindBy(xpath = "//span[text()='Required']")
    public WebElement required;


    @FindBy(xpath="//input[@value='1']")
    public WebElement box;

    @FindBy(id = "delDependentBtn")
    public WebElement delete;




    public AddDependentsPage(){
        PageFactory.initElements(driver, this);
    }


}
