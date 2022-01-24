Feature: login feature
Background: user sucessfully logged in
Given user open "chrome" browser with exe "E:\\Automation Support\\chromedriver.exe"
Given user open url as "http://primusbank.qedgetech.com/"

Scenario: user login into application
When user use implicit wait
When user enter username as "Admin"
When user enter password as "Admin"
When user click on login button
When user click on branches button
When user click on country dropdown
When user select country as "INDIA"
When user click on state dropdown
When user select state as "MAHARASTRA"
When user click on city dropdown
When user select city as "MUMBAI"
When user click on search button
Then validate if user is login successful 
