# Selenium
## Selenium Components
- **Selenium WebDriver : It is used to automate web application testing.** 
- **Selenium IDE : It record and playback test cases It is a extension for web browsers**
- **Selenium Grid : It helps to run our test scripts parllel on multiple systems and multiple browsers**

### Selenium WebDriver
- It is used to automate web application testing.
- It helps to locate and interact with web elements like buttons, input fields, links, etc.
- It works by controlling the browser through commands.

**Project SetUp**
- create a maven Project
- add dependency(selenium and WebdriverManager) in pom.xml
  
**Connecting Selenium with Browser**
- To run Selenium scripts, we need a browser driver (like ChromeDriver for Chrome).
- Instead of manually downloading drivers, we use WebDriverManager dependency to manage them automatically.
- We create a driver object using the WebDriver interface to perform actions on the browser.
  
  ```
  WebDriverManager.chromedriver.setup();
  WebDriver driver= new ChromeDriver();
  ```

  ### Locators
 -  **Locators help to locate the web elements on the web Page**
 -  **We can perform Actions on web elements like click ,sendKeys..etc**
 -  We have different type of locators
    - id
    - className
    - xpath
    - css Selector
    - link text
    - partial link text
    - TagName

- Most Important {somewhat complex haha }one among them is Xpath and CSS Selector
- XPath is used when elements cannot be uniquely identified using basic locators.
- Basic syntax of Xpath is
  ```
  "//tagname[@attribute='value']"
  ```
  - **Types of Xpath**
     - Absolute
     - Relative
  - Absolute XPath starts from the root , while Relative XPath is flexible, shorter, and preferred in automation.
  - **Functions we use Xpath**
      - conatins() : when attribute value is partially known
      ```
      //tagname[contains(@attribute ,'value')]
      ```
      - starts-with() : When attribute value is starts with
      ```
      //tagname[starts-with(@attribute , 'value')]
      ```
      - text() : use to exact visible text
      ```
      //tagname[text='value']
      ```
      - using "and" and "or"
      ```
      //tagname[@attribute1='value' and @attribute2='value']
      //tagname[@attribute1='value' or @attribute2='value']
      //tagname[contains(@attribute1,'value') and @aatribute2='value']
      ```
     

  
  
  
   


  
