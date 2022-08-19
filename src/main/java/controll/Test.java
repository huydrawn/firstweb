package controll;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class Test {
	@RequestMapping("/quanghuy")
	public String display(HttpServletRequest req, Model model) {
		String file = req.getParameter("file");
		String name = req.getParameter("name");
		if (file.equals("hello")) {
			String message = "hello " + name;
			Map<String, String> map = new HashMap<String, String>();
			map.put("huy", message);
			map.put("tuyen", message);
			model.addAllAttributes(map);
			return "hello";

		} else {
			String message = "wellcome " + name;
			model.addAttribute("answer", message);
			return "wellcome";
		}

	}

}
