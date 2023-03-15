package com.anjana.interviewprep.design_patterns.logging_framework;

public class Driver {

    public static void main(String[] args) {
        /*
        Part 1:
        First create a singleton Logger class and add Chain of Abstract loggers to it.
        we have 3 types of loggers
        1. INFO (level :1)
        2. ERROR(level :2)
        3. DEBUG(level :3)

        if you select a level, all the levels less than that will also be notified

        for eg, if you go log.error(....) then log.info(...) will also be called.

        Part 2:
        Now, it's time to log on to some sink (for eg, File, console etc..)
         For that, we can use Observer pattern.

         Subject
         Observers(Logging medium like File, console etc..)

         reference : https://www.youtube.com/watch?v=RljSBrZeJ3w

         Further read, Distributed Logging : https://www.youtube.com/watch?v=WzHgOl3xvu4

         */
        Logger logger = Logger.getInstance();
        Subject subject = new Subject();
//        logger.error("This is error!");
        logger.debug("This is debug!");
//        logger.info("This is info!");

    }
}
