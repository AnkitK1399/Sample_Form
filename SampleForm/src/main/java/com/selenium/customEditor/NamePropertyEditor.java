package com.selenium.customEditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String newName = text.toUpperCase();
		setValue(newName);
	}
	
	

}
