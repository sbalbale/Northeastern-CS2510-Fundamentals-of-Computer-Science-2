#Create a new project#

Open your Command Prompt (Windows)/Terminal (Mac). Navigate to the folder you're organizing all your Fundies 2 projects in using the following command:
```
cd [path to your folder]
```
cd stands for "Change Directory". This command will navigate your terminal over to the specified path. Any commands you run that create files will organize the files into the specified directory. 

Paste and run the following command in your command line (Command Prompt for Windows, Terminal for Mac):
```
mvn archetype:generate -DarchetypeArtifactId=homework-quickstart -DarchetypeGroupId=org.atp-fivt -DarchetypeVersion=1.09 -Djavaversion=21
```

When prompted, enter the following:
```
groupId: uk.ac.nulondon
artifactId (aka the name of this project): lab01
version: press Enter (default value '1.0-SNAPSHOT' is ok) 
package: press Enter (default value 'uk.ac.london' is ok)
```