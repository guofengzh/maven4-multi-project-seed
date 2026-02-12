## Maven 4 Java Seed Project

This project is a seed project for building Java projects using Maven 4.

## Usage 

To build the project, run
```shell
mvnw clean install
```
To use this project in IntelliJ IDEA, you need to configure IntelliJ IDEA to use Maven 4. Please follow these steps:
- Download Maven 4 from https://maven.apache.org/download.cgi and extract it to a directory, for example, C:\apache-maven-4.0.0-rc-5.
- Select "File" → "Settings" → "Build, Execute, Deploy" → "Build Tools" → "Maven," and then set the Maven home directory path to the root directory of Maven 4, for example, `C:\apache-maven-4.0.0-rc-5`.

## Major Changes Compared to Maven 3

1. Use POM model version 4.1.0. The schema is changed to use 4.1.0 too.
2. Multi-module "auto-discovery" - no longer maintaining the `<modules>` list
3. Submodules do not need to hardcode the parent version—`<parent><version>` can be omitted.
4. Version variables can be used in the root pom.xml of the project: `<version>${revision}</version>`
    - Specify the version variable `<revision>1.0.0-SNAPSHOT</revision>` in `properties`; or
    - Inject using the command-line parameter `-Drevision=1.0.0-SNAPSHOT` (we define it in `.mvn/maven.config`).
