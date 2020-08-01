Feature: User must able to submit comment at open cms page 
				
Scenario: User is able to navigate at opencms - Login page 
	When user landed into opencms page 
	And user click over "Log in" link 
	Then user landed into "Log In ‹ opensourcecms — WordPress" page 


Scenario Outline: 
	User is able to navigate at opencms - Hello World page and submit his details 
	When user landed into opencms page 
	And user click over "Hello world!" link 
	Then user landed into "Hello world! – opensourcecms" page 
	Then user must able to fill form and submit his details - <comment> , <name> , <email> and <website> 
	Examples: 
		|comment    |name   |email            | website              |
		|"Hi Jyotir"|"test1"|"test@gmail.com" |"http://www.test.com" |
		|"Weldonee" |"test2"|"test1@gmail.com"|"http://www.test1.com"|
	
	
	
	
	
	
	
	
