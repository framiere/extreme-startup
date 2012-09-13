package fr.ramiere.async;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class ChatController {
	@RequestMapping(value = "/echo/{echo}", method = RequestMethod.GET)
	@ResponseBody
	public String echo(@PathVariable String echo) {
		return echo;
	}
}
