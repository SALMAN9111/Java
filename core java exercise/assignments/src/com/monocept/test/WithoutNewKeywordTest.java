package com.monocept.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WithoutNewKeywordTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DisplayName d = DisplayName.class.newInstance();
        d.displayName();
        
        System.out.println();
        
        Constructor<DisplayName> constructor = DisplayName.class.getConstructor();
        DisplayName displays = constructor.newInstance();
        displays.displayName();
        
        
	}

}
