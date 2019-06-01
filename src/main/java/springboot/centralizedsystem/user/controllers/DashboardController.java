package springboot.centralizedsystem.user.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import springboot.centralizedsystem.user.domains.User;
import springboot.centralizedsystem.user.resources.RequestsPath;
import springboot.centralizedsystem.user.resources.Views;
import springboot.centralizedsystem.user.utils.SessionUtils;

@Controller
public class DashboardController extends BaseController {

    @GetMapping(RequestsPath.DASHBOARD)
    public String dashboardGET(Model model, HttpSession session, RedirectAttributes redirect) {
        User user = SessionUtils.getAdmin(session);
        if (user == null) {
            return unauthorized(redirect);
        }

        model.addAttribute("title", "Dashboard");
        return Views.DASHBOARD;
    }
}
