# Contents

- [Development process support tools](#development-process-support-tools)
- [Tools managed in this repository](#tools-managed-in-this-repository)
- [Tools managed outside this repository](#tools-managed-outside-this-repository)

# Development process support tools

These tools provide support for Nablarch’s development process. 
For tools that do not have a manual, instructions have been provided in the Excel download file. 

When using development process support tools that use design documents for input/output, 
make sure to use the development process support tools and design documents bundled with the same version of Nablarch. 

# Tools managed in this repository

## Batch development assistance

* Automatic shell script generation tool  
Automatically generates files containing shell script and environment dependency items. These are launched from the job scheduler.  

## Creation of registration data

* Data output tool for code table registration  
Automatically generates CSV files for inserting tables of master data registered to code tables from the code design specifications.  


* Data creation tool for message table registration  
Automatically generates CSV files for inserting tables of master data registered to message tables from the message design specifications.  

* Data creation tool for request table registration  
Automatically generates CSV files for inserting tables of master data registered to request tables from the request ID list.  

## External interface design

* Automatic generation tool for format definition files  
Automatically generates format definition files to be used by the framework from the external interface design specifications.  

## Database design

* Consistency check tool for table definitions and domain definitions  
Checks that domains indicated in the table definitions are defined according to the domain definitions, and checks the consistency of the length and data type.  

* Table definition output instructions  
This document explains how to output table definitions using the report output function of the ObjectBrowser.  


* Automatic generation tool for main exclusive control key classes  
Automatically generates main exclusive control key classes based on the table definitions.  
[Physical/Java object mapping definitions](DB-Design/Physical_Type_Java_Object_Mapping_Definition.xls) are required to use this tool.


* Automatic generation tool for domain classes  
Automatically generates domain setting Java class files based on the domain definitions.  

## Tools managed outside this repository

### Tools managed in the Maven repository

* JSP static analysis tool (Bundled with [Nablarch Testing](https://mvnrepository.com/artifact/com.nablarch.framework/nablarch-testing))  
[Tool guide](https://nablarch.github.io/docs/LATEST/doc/en/development_tools/toolbox/JspStaticAnalysis/index.html)
  

* gsp-dba-maven-plugin ([coastland/gsp-dba-maven-plugin](https://github.com/coastland/gsp-dba-maven-plugin))  
This tool automates DBA routine work so that programmers can concentrating on the main data modeling work.  


### Tools managed in GitHub

* Nablarch sql-executor ([nablarch/sql-executor](https://github.com/nablarch/sql-executor))  
 This tool interactively executes SQL files containing Nablarch’s special syntax.    
[Tool guide](https://nablarch.github.io/docs/LATEST/doc/en/development_tools/toolbox/SqlExecutor/SqlExecutor.html)
  
* Business screen JSP verification tool ([nablarch/nablarch-toolbox](https://github.com/nablarch/nablarch-toolbox))  
This tool verifies business screen JSP.    
[Tool guide](https://nablarch.github.io/docs/LATEST/doc/en/development_tools/toolbox/JspVerifier/JspVerifier.html)



## Licensing
This document is provided under Apache License 2.0. 
Refer to [LICENSE.txt](./LICENSE.txt) for details on Apache License 2.0.
