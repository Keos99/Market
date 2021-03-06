package pet.bazaar.controller;

import pet.bazaar.model.CreateTable;
import pet.bazaar.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class AppController {
    @Autowired
    @Value("Barsik")
    private Message message;

    @Autowired
    private CreateTable createTable;

    // http://localhost:8080/
    @RequestMapping("/")
    public String javaPageHello() {
        return "menu";
    }

    // http://localhost:8080/goods001
    @RequestMapping("/goods001")
    public String javaPageGoods() {
        return "goods001";
    }

    @RequestMapping("/hello-world")
    public String javaPageHelloWorld() {
        return "hello-world";
    }

    @RequestMapping("/create")
    public String createTable(Model model) {
        model.addAttribute("status", createTable.createStatus());
        // hello.jsp
        return "table";
    }

    @RequestMapping("/admin")
    public String getAdminInfo(Model model) {
        model.addAttribute("secure", "It's very secure page!");
        return "admin";
    }

    @RequestMapping(value = {"/password/{password}"}, method = RequestMethod.GET)
    public ModelAndView passwordEncode(@PathVariable("password") String password) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("password");
        modelAndView.addObject("crypt", new BCryptPasswordEncoder().encode(password));
        return modelAndView;
    }
}
