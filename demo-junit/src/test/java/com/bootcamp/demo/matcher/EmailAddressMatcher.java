package com.bootcamp.demo.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class EmailAddressMatcher extends TypeSafeMatcher<String> {
    
    @Override
    protected boolean matchesSafely(String item){
        return item.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"); 
        // [中括]後面跟{有多個RULE},{2,}=最少2個charactor , $= end, ^bebin of String, \\話俾compiler知後面粒. 係String 唔係code
    }

    @Override
    public void describeTo(Description errorMsg) {
        errorMsg.appendText("Invalid Email Address Format.");
    }

    public static EmailAddressMatcher of(){
        return new EmailAddressMatcher();
    }
}
