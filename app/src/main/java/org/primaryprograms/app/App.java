package org.primaryprograms.app;

import org.example.list.LinkedList;

import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;
import static org.primaryprograms.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class.getName());
    
    public static void main(String[] args) {      
        LinkedList tokens;
        tokens = split(getMessage());
        String result = WordUtils.capitalize(join(tokens));
		logger.log(Level.TRACE,"{0}", result); 
    }
}
