# Canonical Documentation

**Overview:**
Welcome to the Project Name documentation. This root repository is a modified version of [original repository link](https://github.com/bezkoder/spring-boot-h2-database-crud) for the application of the TFSD course.


## Getting Started

**Installation:**
To install and set up the project, follow these steps:

```bash
# Example command for installation
git clone https://github.com/Kim-Tchoy/spring-boot-h2-database-crud.git
cd your-repository
mvn clean install
```


## Modifications to the Project

This section outlines the modifications made to the project since the initial phase. Please find a summary of changes below:

- **Logger Implementation:** Added Log4j for comprehensive logging at different levels.
  - Implemented a test class `TestLog4j` to demonstrate logging functionality.

- **Unit Tests:** Added JUnit tests to ensure the correctness of individual units of code.
  - Created `TestJUnit` for basic unit testing.
  
- **Integration Tests:** Implemented integration tests to validate the interactions between different components.
  - Added `TestIntegration` for comprehensive integration testing.

- **Canonical Documentation:** Introduced a `docs` folder with essential documentation files.
  - Included sections such as `Getting Started`, `Usage`, `Contributing`, `License`, and more.
  
- **README Update:** Modified the README file to provide a concise overview of the project.
  - Updated project details and structure, including links to documentation.

- **Added FOSS License:** Included a Free and Open Source Software (FOSS) license to define the terms under which the project is distributed.

- **Static Code Analysis:** Configured Checkstyle and Error Prone for static code analysis.
  - Ensured adherence to coding standards and identified potential issues during compilation.
