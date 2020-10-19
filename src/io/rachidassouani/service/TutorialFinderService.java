package io.rachidassouani.service;

public class TutorialFinderService {
	
	public String getBestTutorialSite(String lang) {
		if (lang.equals("java")) {
			return "Java Rachid";
		} else {
			return "tuto service ..";	
		}
	}
}
