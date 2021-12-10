package com.monocept.composite.pattern;

public class File implements IStorageItem {
	private String fileName;
	private float size;
	private String type;
	private Folder folder;

	public File(String fileName, float size, String type) {
		this.fileName = fileName;
		this.size = size;
		this.type = type;
	}


	public String getSubFolderName() {
		return folder.getFolderName();
		
	}
	public String getFileName() {
		return fileName;
	}

	public float getSize() {
		return size;
	}

	public String getType() {
		return type;
	}


	
	
	@Override
	 public String displays(int depth) {
	    StringBuilder builder = new StringBuilder();
	    for (int i = 0; i < depth; i++) {
	      builder.append("\t");
	    }
	    builder.append("---"+this.fileName + this.getSize() + "MB " + this.getType());
	    builder.append("\n");

	    return builder.toString();
	  }
	
}

