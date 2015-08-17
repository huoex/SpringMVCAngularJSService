package com.javahonk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringMVCController {
	
	private static final Logger logger = Logger.getLogger(SpringMVCController.class);
	
	@RequestMapping(value = "/getPaginationDataPage")
	public String getPaginationDataPage() {
		
		logger.info("Log4j info is working");
        logger.warn("Log4j warn is working");       
        logger.debug("Log4j debug is working");
        logger.error("Log4j error is working");
        System.out.println("System out is working");
		return "angularJSngGridPagination";		
	}
	
	@RequestMapping(value = "/getPaginationData/{pageSize}/{page}")
	public @ResponseBody List<Map<String, Object>> getPaginationData(@PathVariable String pageSize, @PathVariable String page) {		

		List<Map<String, Object>> activeTeamMap = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < 1000; i++) {
			Map<String, Object> dropDownData = new HashMap<String, Object>();
			dropDownData.put("Name", "Java Honk");
			dropDownData.put("Positon", "Architect");
			dropDownData.put("Salary", "$200,800");
			dropDownData.put("Office", "NY");
			dropDownData.put("Start_Date", "05/05/2010");
			activeTeamMap.add(dropDownData);
			
			dropDownData = new HashMap<String, Object>();
			dropDownData.put("Name", "Igor Vornovitsky");
			dropDownData.put("Positon", "Sr. Architect");
			dropDownData.put("Salary", "$200,800");
			dropDownData.put("Office", "NY");
			dropDownData.put("Start_Date", "05/05/2011");
			activeTeamMap.add(dropDownData);
			
			dropDownData = new HashMap<String, Object>();
			dropDownData.put("Name", "Ramesh Arrepu");
			dropDownData.put("Positon", "Architect");
			dropDownData.put("Salary", "$200,400");
			dropDownData.put("Office", "NY");
			dropDownData.put("Start_Date", "05/05/2009");
			activeTeamMap.add(dropDownData);
		}
		
		return activeTeamMap;	
	}
	

}
