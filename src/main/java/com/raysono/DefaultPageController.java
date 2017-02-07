package com.raysono;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andreassch on 07.02.2017.
 */
@Controller
public class DefaultPageController {
	@RequestMapping("/")
	public String defaultPage() {
		return "default";
	}
}
