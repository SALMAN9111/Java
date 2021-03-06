package com.monocept.guitar1;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS;

	public String toString() {
		switch (this) {
		case FENDER:
			return "fender";
		case MARTIN:
			return "martin";
		case GIBSON:
			return "gibson";
		case COLLINGS:
			return "collings";
		case OLSON:
			return "olson";
		case RYAN:
			return "ryan";
		case PRS:
			return "prs";

		default:
			return "not specified";
		}
	}
}
