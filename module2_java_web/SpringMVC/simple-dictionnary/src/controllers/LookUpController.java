package controllers;

import models.DictionaryDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LookUpController {
    @GetMapping("/")
    public String display(){
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam String en_word, Model model){
        String result = DictionaryDao.findById(en_word);
        if(result != null){
            model.addAttribute("result",result);
            return "home";
        }else{
            model.addAttribute("result","Not found your word");
            return "home";
        }
    }
}
