package io.summerx.sso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 请在这里添加类说明.
 * </p>
 *
 * @author summerx
 * @Date 2016-07-20 3:40 PM
 */
@Controller
@RequestMapping
public class WelcomeController {

    /**
     * 欢迎页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/welcome", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("auth/welcome");
    }
}
