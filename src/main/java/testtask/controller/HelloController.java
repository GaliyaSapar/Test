package testtask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import testtask.bean.HelloWorld;
import testtask.service.HelloService;
import javax.annotation.Resource;

/**
 * Created by Galiya on 13.05.2017.
 */
@Controller
public class HelloController {

    @Resource
    private HelloService service;

    @RequestMapping("/")
    public ModelAndView execute() {
        ModelAndView mav = new ModelAndView("/WEB-INF/index.jsp");
        HelloWorld helloWorld = service.selectHello(1);
        mav.addObject("hello", helloWorld);
        return mav;
    }

}
