## Why Playwright
Based on the specific scope of my web application, Playwright has proven to be the most suitable choice. The selection between Playwright and Cypress depends on the system's requirements, considering factors such as browser support and the complexity of testing scenarios. Playwright's versatility and comprehensive browser compatibility make it ideal for diverse testing needs, while Cypress offers simplicity and ease of use for straightforward scenarios. It is crucial to evaluate these frameworks in relation to your project's unique demands to make an informed decision.
### Table of Contents

1. [Overview](#Overview)
2. [Getting Started](#Getting-Started)

    - [Prerequisites](#prerequisites)
    - [Installation](#installation)

      - [Java JDK](#java-jdk)
      - [IDE](#ide)
      - [Apache Maven](#apache-maven)

    - [Setting Up Java JDK](#setting-up-java-jdk)
    - [Setting Up Spring Tools](#setting-up-spring-tools)
    - [Installing Apache Maven](#installing-apache-maven)

11. [Built With](#built-with)


### Overview
This repository serves as a comprehensive guide to working with Selenium WebDriver using Java. Whether you're a beginner looking to get started with Selenium for automated testing or an experienced developer seeking advanced browser handling techniques, this repository has something for everyone.

### Getting Started
Follow these steps to set up your development environment and start using Selenium with Java

### Prerequisites

1. [Java JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)
2. Choose one of the following IDE:
    - [Eclipse](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
    - [Spring Tools](https://spring.io/tools)
3. [Apache Maven](https://maven.apache.org/download.cgi)

### Installation

1. Java JDK
    - Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) page.
    - Run the installer and set up the JDK.
2. IDE
    - Download and install your preferred IDE.
3. Apache Maven
    - Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
    - Follow installation instructions.
  
### Setting Up Java JDK

1. Download the JDK installer from Oracle.
2. Run the installer and select your installation folder.
3. Set up JAVA_HOME and PATH environment variables:
         - Open System Properties.
         - Navigate to Environment Variables.
         - Add JAVA_HOME with the JDK installation path.
         - Update the PATH variable to include %JAVA_HOME%\bin.
4. Verify Java installation by running java --version in a terminal.

### Setting Up Spring Tools

1. Download Spring Tools from the [official website](https://spring.io/tools).
2. Run the installer and select the package to install.
3. Choose your installation folder and complete the setup.
4. Launch Spring Tools to start using it.

### Installing Apache Maven

1. Check if you have Java installed by running java --version.
2. Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
3. Extract the archive to your desired location.
4. Set up M2_HOME and MAVEN_HOME environment variables:
    - Create M2_HOME and point it to the Maven installation directory.
    - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal.

### Built With

1. [Java JDK](https://www.oracle.com/java/) - Java Development Kit
2. [Spring Tools](https://spring.io/tools/) - IDE for Spring applications
3. [Apache Maven](https://maven.apache.org/) - Dependency Management

##### Maven Dependencies

###### Selenium TestNG Webdriver Manager

```xml
<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.13.0</version>
		</dependency>
		<!--
		https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.5.3</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.8.0</version>
			<scope>test</scope>
		</dependency>
		
	</dependencies>
```
## Extent Report
![image](https://github.com/tanvirseraj/Tutorials-Point-Web-Automation-Playwright/assets/85784149/6a2aaa10-29c2-495c-9e18-03a5f49638a1)
![image](https://github.com/tanvirseraj/Tutorials-Point-Web-Automation-Playwright/assets/85784149/28bfe025-4b67-445c-9944-a5e3697796b4)
![image](https://github.com/tanvirseraj/Tutorials-Point-Web-Automation-Playwright/assets/85784149/1439ded2-674a-42aa-8138-bd55f1f8f818)
![image](https://github.com/tanvirseraj/Tutorials-Point-Web-Automation-Playwright/assets/85784149/8a0f5db8-7519-4225-bf4a-54c4518f456e)
![image](https://github.com/tanvirseraj/Tutorials-Point-Web-Automation-Playwright/assets/85784149/68a341da-4be9-41df-9835-1359f5c43458)





