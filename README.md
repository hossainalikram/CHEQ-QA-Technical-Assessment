# QA Technical Assessment for CHEQ by Cantaloupe
This repository has been created to showcase the QA Technical Assessment as part of the recruitment procedure for CHEQ by Cantaloupe

## Overview
This project is designed to automate web testing using Selenium with Maven and TestNG. It includes structured directories for source code, tests, test reports, and screenshots.

## Project Structure
- **src/**: Contains the Java source code for the project.
- **test-output/**: Stores output from TestNG tests.
- **reports/**: Directory for generated reports post test executions.
- **screenshots/**: Screenshots captured during tests are stored here.
- **pom.xml**: Maven configuration file for managing dependencies and project build configuration.
- **testng.xml**: Configuration file for TestNG to manage test suites and test execution.

## Setup
1. Ensure Java and Maven are installed on your system.
2. Clone this repository or download the project folder.
3. Navigate to the project directory and run `mvn clean install` to install dependencies and build the project.

## Running Tests
- Run tests using the command `mvn test`.
- Specific test classes can be run by configuring `testng.xml`.

## Viewing Reports
- Test execution results can be viewed in the `test-output/` directory.
- Additional reports generated (if configured) can be found in the `reports/` directory.

## Logs
- Application logs and test execution details can be found in `logging.txt`.

## Contribution
Contributions are welcome. Please fork the project, make your changes, and submit a pull request.
