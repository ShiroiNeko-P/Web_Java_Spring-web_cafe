package cafe.drink.webcafe.Controller;

import cafe.drink.webcafe.repo.sanphamrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @Autowired
    private sanphamrepo repo;

    @RequestMapping("/")
    public String index(){
        return "home";
    }

    @RequestMapping("tich_diem")
    public String hello(Model model){
        model.addAttribute("sp", repo.findAll());
        return "tich_diem";
    }

}
