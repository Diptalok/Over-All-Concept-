package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	
	public pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	private WebElement fn;
	
	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
	private WebElement ln;
	
	@FindBy (xpath="//textarea[@rows=\"3\"]")
	private WebElement add;
	
	@FindBy (xpath="//input[@type=\"email\"]")
	private WebElement em;
	
	@FindBy (xpath="//input[@type=\"tel\"]")
	private WebElement ph;
	
	@FindBy (xpath="//input[@id=\"firstpassword\"]")
	private WebElement fp;
	
	@FindBy (xpath="//input[@id=\"secondpassword\"]")
	public WebElement sp;
	
	@FindBy (xpath = "(//input[@type=\"radio\"])[1]")
	private WebElement rd;
	
	@FindBy (xpath = "(//input[@type=\"checkbox\"])[1]")
	private WebElement cb;
	
	@FindBy (xpath = "(//select[@type=\"text\"])[1]")
	private WebElement dp;
	
	@FindBy (xpath = "//div[@id=\"msdd\"]")
	private WebElement sel;
	
	@FindBy (xpath = "//a[.=\"Hindi\"]")
	public WebElement lan;
	
	@FindBy (xpath = "//span[@role=\"combobox\"]")
	private WebElement con;
	
	@FindBy (xpath = "//input[@role=\"textbox\"]")
	private WebElement Ind;
	

	public WebElement getInd() {
		return Ind;
	}

	public void setInd(WebElement ind) {
		Ind = ind;
	}

	public WebElement getCon() {
		return con;
	}

	public void setCon(WebElement con) {
		this.con = con;
	}

	public WebElement getLan() {
		return lan;
	}

	public void setLan(WebElement lan) {
		this.lan = lan;
	}

	public WebElement getSel() {
		return sel;
	}

	public void setSel(WebElement sel) {
		this.sel = sel;
	}

	public WebElement getDp() {
		return dp;
	}

	public void setDp(WebElement dp) {
		this.dp = dp;
	}

	public WebElement getCb() {
		return cb;
	}

	public void setCb(WebElement cb) {
		this.cb = cb;
	}

	public WebElement getRd() {
		return rd;
	}

	public void setRd(WebElement rd) {
		this.rd = rd;
	}

	public WebElement getFp() {
		return fp;
	}

	public void setFp(WebElement fp) {
		this.fp = fp;
	}

	public WebElement getSp() {
		return sp;
	}

	public void setSp(WebElement sp) {
		this.sp = sp;
	}

	public WebElement getFn() {
		return fn;
	}

	public void setFn(WebElement fn) {
		this.fn = fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public void setLn(WebElement ln) {
		this.ln = ln;
	}

	public WebElement getAdd() {
		return add;
	}

	public void setAdd(WebElement add) {
		this.add = add;
	}

	public WebElement getEm() {
		return em;
	}

	public void setEm(WebElement em) {
		this.em = em;
	}

	public WebElement getPh() {
		return ph;
	}

	public void setPh(WebElement ph) {
		this.ph = ph;
	}

}
