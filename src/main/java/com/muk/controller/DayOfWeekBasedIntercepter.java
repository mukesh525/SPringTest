package com.muk.controller;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class DayOfWeekBasedIntercepter extends HandlerInterceptorAdapter{


      @Override
    public boolean preHandle(HttpServletRequest request, 
            HttpServletResponse response, Object handler)
        throws Exception {

         Calendar cal = Calendar.getInstance();
        int daysofweek = cal.get(cal.DAY_OF_WEEK);
        if (daysofweek == 2) {

            response.getWriter().write("<h1><b>This website is closed on sunday please try accesing"
                    + " it except sunday</b> <h1>");
            return false;

        } else {
            
            return true;
            
            
        }}
    }


