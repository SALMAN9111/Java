package com.moncept.Service;

import java.util.HashMap;
import java.util.Map;

public class SecurityService {
	Map<String, String> user = new HashMap<String, String>();

	public SecurityService() {
		user.put("sayed", "sayed");
	}

	public boolean userAuth(String username, String password) {
		for (Map.Entry m : user.entrySet()) {
			if (m.getKey().equals(username) && m.getValue().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
