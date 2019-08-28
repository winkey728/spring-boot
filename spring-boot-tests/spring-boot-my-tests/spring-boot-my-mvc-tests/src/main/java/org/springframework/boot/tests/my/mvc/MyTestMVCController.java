package org.springframework.boot.tests.my.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyTestMVCController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
