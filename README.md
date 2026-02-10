## Maven 4 Java Seed Project

This project is a seed project for building Java projects using Maven 4.

## Usage 

```shell
mvnw clean install
```
## Major Changes Compared to Maven 3

1. Use POM model version 4.1.0. The schema is changed to use 4.1.0 too.
2. Multi-module "auto-discovery" - no longer maintaining the `<modules>` list
3. Submodules do not need to hardcode the parent version—`<parent><version>` can be omitted.
4. Version variables can be used in the root pom.xml of the project: `<version>${revision}</version>`
    - Specify the version variable `<revision>1.0.0-SNAPSHOT</revision>` in `properties`; or
    - Inject using the command-line parameter `-Drevision=1.0.0-SNAPSHOT` (we define it in `.mvn/maven.config`).
