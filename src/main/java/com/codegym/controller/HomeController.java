package com.codegym.controller;

import com.codegym.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "smartphones")
public class HomeController {

    @Autowired
    private SmartphoneService smartphoneService;

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }


//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//    public ModelAndView createSmartphonePage() {
//        ModelAndView mav = new ModelAndView("phones/new-phone");
//        mav.addObject("sPhone", new Smartphone());
//        return mav;
//    }
//
//    @RequestMapping(value = "/createnewPhone", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//
//    @ResponseBody
//    public Smartphone createSmartphone(@RequestBody Smartphone smartphone) {
//        return smartphoneService.save(smartphone);
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public Iterable<Smartphone> allPhones(){
//        return smartphoneService.findALl();
//    }
//
//    @GetMapping("")
//    public ModelAndView allPhonesPage() {
//        ModelAndView modelAndView = new ModelAndView("phones/all-phones");
//
//        modelAndView.addObject("allphones", allPhones());
//        return modelAndView;
//    }

}
