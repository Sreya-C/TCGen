# TCGen
An application for automated test case generation for unit testing. 

## Steps to follow 

- Clone the above repository in any folder. Download the TCGen Application. 

Before running the application, make sure you do the following - 

#### 1. ANT_HOME should be set as an environment variable; the path should be the path to which you cloned the repository. 
- If the TC Gen folder is cloned into ```C:/Sample``` then make sure to set ANT_HOME variable to ```C:/Sample/TCGen```

#### 2. Save the program you will run in the src folder with a .java extension. If there are multiple classes, save them as different files. (See more in FAQ)

#### 3. Ensure to follow the instructions displayed when you open the application.

#
Application

![without text](https://github.com/Sreya-C/TCGen/assets/98732604/c606caaf-b0af-4269-b580-53cd7dc49f04)

After giving the required details(API Key, Java Program, Required location of generated test cases)

![with text](https://github.com/Sreya-C/TCGen/assets/98732604/f444c9a6-3270-447a-9ced-c472151ddb61)

Code Coverage Report

![coverage report](https://github.com/Sreya-C/TCGen/assets/98732604/52da443e-3f04-4fa2-a325-528e7bea87d0)

# 

### FAQ

  Q. If the class you give as input depends on other classes?

  A. Save all the classes it depends on as separate java files as <classname>.java in the src folder. And in the input box, give all the classes the class to be tested depends on, along with the class to be tested and the required import statements.

  Q. Don't see your program in the Code Coverage report?

  A. There might have been some problem saving the program in the 'src' directory. Please save each class INDIVIDUALLY in the 'src' directory. If your program uses two classes, say class Hello{} and class World{}, save them as two separate '.java' files in the 'src' directory. 
If the above is ensured, then make sure there are no errors in your given code. 

  Q. An error in generating code coverage?

  A. There might have been a problem in the import statements; all the required libraries might not have been imported. So, manually update the test file with the required libraries and open terminal on the main folder setup, and run the command ```ant``` to generate code coverage report. 


### Sources

  https://ant.apache.org/bindownload.cgi
  https://jar-download.com/artifact-search/org.jacoco.ant
  
