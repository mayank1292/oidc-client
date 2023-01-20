package com.amadeus.cam.oidcclient;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CallbackController {
	
	 @RequestMapping("/callback")
	  public ModelAndView  helloWorld(@RequestParam Map<String,String> allRequestParams, ModelMap model){
		 ModelAndView modelAndView = new ModelAndView();    
		 modelAndView.setViewName("callback");        
		 modelAndView.addObject("requestparams", allRequestParams);      
		 
		 System.out.println("---------MAYANK-----------");
		 for(Entry<String, String> entry : allRequestParams.entrySet()) {
			 System.out.println(entry.getKey() + ":" + entry.getValue());
		 }
		 
		 return modelAndView;    
	  }

}
