package com.muk.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        if (text.contains("Mr.") || text.contains("Ms.")) {

            setValue(text);
        } else {
            text = "Ms." + text;
            setValue(text);
        }

    }

}
