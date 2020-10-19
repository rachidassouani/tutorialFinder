package io.rachidassouani.action;

import io.rachidassouani.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language;

	public String execute() {
		TutorialFinderService finderService = new TutorialFinderService();
		bestTutorialSite = finderService.getBestTutorialSite(language);
		//setBestTutorialSite(bestTutorialSite);
		System.out.println(language);
		return "success";
	}

	
	public String getTutorial() {
		System.out.println("getting tuto");
		return "success";
	}
	
	public String addTutorial() {
		System.out.println("adding tuto");
		return "success";
	}
	
	
	
	
	
	
	
	
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	

}























