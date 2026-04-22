# Selenium WebDriver
- It is used to automate web application testing.
- It helps to locate and interact with web elements like buttons, input fields, links, etc.
- It works by controlling the browser through commands.
  
**Connecting Selenium with Browser**
- To run Selenium scripts, we need a browser driver (like ChromeDriver for Chrome).
- Instead of manually downloading drivers, we use WebDriverManager dependency to manage them automatically.
- We create a driver object using the WebDriver interface to perform actions on the browser.
  
  ```
  WebDriverManager.chromedriver.setup();
  WebDriver driver= new ChromeDriver();
  ```
