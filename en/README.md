# Contents

- [Development process support tools](#development-process-support-tools)
- [Tools managed in this repository](#tools-managed-in-this-repository)
- [Tools managed outside this repository](#tools-managed-outside-this-repository)

# Development process support tools

These tools provide support for Nablarch's development process. 
For tools that do not have a manual, instructions have been provided in the Excel download file. 

When using development process support tools that use design documents for input/output, 
make sure to use the development process support tools and design documents bundled with the same version of Nablarch. 

# Tools managed in this repository

## Batch development assistance

* [Automatic shell script generation tool](Batch-Development-Assistance/Shell_Script_Automatic_Generation_Tool.xlsm)  
Automatically generates files containing shell script and environment dependency items. These are launched from the job scheduler.  

## Creation of registration data

* [Data output tool for code table registration](Creating-data-for-registration/Data_Output_Tool_for_Code_Table_Registration.xlsm)  
Automatically generates CSV files for inserting tables of master data registered to code tables from the code design specifications.  


* [Data creation tool for message table registration](Creating-data-for-registration/Data_Creation_Tool_for_Message_Table_Registration.xlsm)  
Automatically generates CSV files for inserting tables of master data registered to message tables from the message design specifications.  

* [Data creation tool for request table registration](Creating-data-for-registration/Data_Creation_Tool_for_Request_Table_Registration.xlsm)  
Automatically generates CSV files for inserting tables of master data registered to request tables from the request ID list.  

## External interface design

* [Automatic generation tool for format definition files](External-Interface-Design/Automatic_Format_Definition_File_Generation_Tool.xlsm)  
Automatically generates format definition files to be used by the framework from the external interface design specifications.  

## Database design

* [Consistency check tool for table definitions and domain definitions](DB-Design/Table_Definition_Domain_Definition_Consistency_Check_Tool.xlsm)  
Checks that domains indicated in the table definitions are defined according to the domain definitions, and checks the consistency of the length and data type.  

* [Table definition output instructions](DB-Design/Table_Definition_Document_Output_Procedure.xls)  
This document explains how to output table definitions using the report output function of the ObjectBrowser.  


* [Automatic generation tool for exclusive control primary key class.](DB-Design/Exclusive_Control_Primary_Key_Class_Auto_Generation_Tool.xlsm)  
Automatically generates exclusive control primary key class based on the table definitions.  
[Physical/Java object mapping definitions](DB-Design/Physical_Type_Java_Object_Mapping_Definition.xls) are required to use this tool.


* [Automatic generation tool for domain classes](DB-Design/Domain_Class_Creation_Tool.xlsm)  
Automatically generates domain setting Java class files based on the domain definitions.  

## Tools managed outside this repository

### Tools managed in the Maven repository

* Jakarta Server Pages static analysis tool (Bundled with [Nablarch Testing](https://mvnrepository.com/artifact/com.nablarch.framework/nablarch-testing))  
[Tool guide](https://nablarch.github.io/docs/LATEST/doc/en/development_tools/toolbox/JspStaticAnalysis/index.html)
  

* gsp-dba-maven-plugin ([coastland/gsp-dba-maven-plugin](https://github.com/coastland/gsp-dba-maven-plugin/tree/master/en))  
This tool automates DBA routine work so that programmers can concentrating on the main data modeling work.  


### Tools managed in GitHub

* Nablarch sql-executor ([nablarch/sql-executor](https://github.com/nablarch/sql-executor/tree/master/en))  
 This tool interactively executes SQL files containing Nablarch's special syntax.    
[Tool guide](https://nablarch.github.io/docs/LATEST/doc/en/development_tools/toolbox/SqlExecutor/SqlExecutor.html)
  


## Licensing
This document is provided under Apache License 2.0. 
Refer to [LICENSE.txt](./LICENSE.txt) for details on Apache License 2.0.
