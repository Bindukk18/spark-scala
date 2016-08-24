# spark-scala

This maven project is for running a word count example in Scala IDE using spark scala libraries.  
To setup this project in Scala IDE I referred to this video : https://www.youtube.com/watch?v=aB4-RD_MMf0

Please following steps to setup your project.

1. git checkout this project in some directory.
2. Maven import it from scala ide.
3. Maven update the project. It will take few minutes to download the jars.
4. Maven install the project and see if build is success.
5. Right click on project and click on configure and change the nature to scala. Soon there will be a lot of errors on the problem view.
6. To get rid of those errors go in property and click on Scala Compiler - tick Use Project Settings and then select Fixed Scala installation 2.10.5 because spark is build with 2.10.
7. Now remove the scala libraries. right click on project -> configure build path -> libraries -> remove scala libraries.
8. Now go on source tab and make sure <prj>/src/main/scala folder is added in there, so that it take source files from this folder.
9. Now run the WrodCount.scala file and the output should be generated in food.count.txt directory project root folder. To view it refresh the project folder.
