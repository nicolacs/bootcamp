package com.bootcamp.demo.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class PasswordMatcher extends TypeSafeMatcher<String> {
    @Override
    protected boolean matchesSafely(String item) {
        // 8 - 16 characters
        // contains at least one Capital letter
        // contains at least one small letter
        // contains at least one number
        // contains at least one speical character !@#$
        return item.matches(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[a-zA-Z0-9!@#$]{8,16}$"); //
    } // !!! ?= 是否有 .* 一個或以上, 成句4個符號 "?=.*" 即是 "必須包含一個或以上"

    @Override
    public void describeTo(Description errorMsg) {
        errorMsg.appendText("Invalid Password Format.");
    }

    public static PasswordMatcher create() {
        return new PasswordMatcher();
    }

}
