package com.ajwa.calci;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalciController {

	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addhome")
	public String addhome() {
		return "add.jsp";
	}

	@RequestMapping("/subtracthome")
	public String subhome() {
		return "sub.jsp";
	}

	@RequestMapping("/multiplyhome")
	public String multihome() {
		return "mul.jsp";
	}

	@RequestMapping("/dividehome")
	public String dividehome() {
		return "div.jsp";
	}

	@RequestMapping("add")
	public String add(@RequestParam("t1") Double t1, @RequestParam("t2") Double t2, Model model) {
		Double t3 = (t1 + t2);
		String ret = Double.toString(t3);
		model.addAttribute("ret", ret);
		return "ans.jsp";
	}

	@RequestMapping("subtract")
	public String subtract(@RequestParam("t1") Double t1, @RequestParam("t2") Double t2, Model model) {
		Double t3 = (t1 - t2);
		String ret = Double.toString(t3);
		model.addAttribute("ret", ret);
		return "ans.jsp";
	}

	@RequestMapping("multiply")
	public String multiply(@RequestParam("t1") Double t1, @RequestParam("t2") Double t2, Model model) {
		Double t3 = (t1 * t2);
		String ret = Double.toString(t3);
		model.addAttribute("ret", ret);
		return "ans.jsp";
	}

	@RequestMapping("divide")
	public String divide(@RequestParam("t1") double t1, @RequestParam("t2") double t2, Model model) {
		double t3 = (t1 / t2);
		String ret = Double.toString(t3);
		model.addAttribute("ret", ret);
		return "ans.jsp";
	}
}
