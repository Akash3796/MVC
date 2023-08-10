package Layer.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.protobuf.Service;

import Layer.Entities.Entities;
import Layer.Service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService es;

	@RequestMapping("/")
	public String Home() {

		return "login";
	};

	@RequestMapping("/form")
	public String RegForm() {

		return "regForm";
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute Entities e, Model m, HttpServletRequest hsr) {
					
			String user = (String) hsr.getSession().getAttribute("user");
			
		boolean isAdded = es.register(e,user);

		m.addAttribute("emp", e);

		if (isAdded) {

			m.addAttribute("msgSucc", "Employee Added SuccessFully..");
		} else {
			m.addAttribute("err", "Employee Not Added!");
		}

		return "display";

	};

	// -----------Update Employee Controller--------------------//

	@RequestMapping("/updateForm")
	public String UpdateForm() {

		return "update";
	}

	@RequestMapping("/update")
	public String update(@ModelAttribute Entities e, Model m) {

		boolean isUpdated = es.update(e);

		m.addAttribute("emp", e);

		if (isUpdated) {

			m.addAttribute("msgSucc", "Employee Updated SuccessFully..");
		} else {
			m.addAttribute("err", "Employee Not Updated!");
		}

		return "display";

	};

	// -----------Delete Employee Controller--------------------//

	@RequestMapping("/deleteEmpForm")
	public String DeleteForm() {

		return "delete";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {

		Entities e = es.delete(id);

		return "display";

	};

	// -----------Select Employee Controller--------------------//

	@RequestMapping("/selectEmpForm")
	public String selectForm() {

		return "select";

	}


	@RequestMapping("/select")
	public String select(@RequestParam int id, Model m) {

		Entities e = es.select(id);

		m.addAttribute("emp", e);

		return "display";
	};
	
				// --------------SelectAll Employee Controller--------------------//
	
	@RequestMapping("/selectAllEmpForm")
	public String selectAll(Model m,HttpServletRequest hsr) {

			String user = (String) hsr.getSession().getAttribute("user");
		
			List<Entities> list = es.selectAll(user);
			
			m.addAttribute("emp", list);

		return "displayAll";
	};
	
	
}
