package com.monocept.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private String folderName;
	private List<IStorageItem> childern = new ArrayList<>();
	
	public Folder(String folderName) {
		this.folderName =folderName;
	}

	public String getFolderName() {
		return folderName;
	}

	public List<IStorageItem> getChildern() {
		return childern;
	}
	
	public void addChild(IStorageItem item) {
		childern.add(item);
	}

	@Override
	public String displays(int depth) {
		StringBuilder builder = new StringBuilder();
	    for (int i = 0; i < depth; i++) {
	      builder.append("\t");
	    }
	    builder.append("-->" + this.getFolderName());
	    builder.append("\n");
	    for (IStorageItem child : childern) {
	      builder.append(child.displays(depth + 1));
	    }
	    return builder.toString();
	}


}


