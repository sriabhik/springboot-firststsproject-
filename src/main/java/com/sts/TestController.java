package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody//this is used because we want to use /test directly w/o creating views as in we do in spring mvc
	public String firstHandler() {
		return "This is sts ";
	}
}
