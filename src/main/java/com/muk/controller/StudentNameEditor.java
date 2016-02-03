package com.muk.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (!text.equals("")) {

            if (text.contains("Mr.") || text.contains("Ms.")) {

                setValue(text);
            } else {
                text = "Mr." + text;
                setValue(text);
            }

        }
        setValue(text);
    }

}
