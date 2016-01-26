package com.muk.controller;

import java.util.Calendar;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class DayOfWeekBasedIntercepter extends HandlerInterceptorAdapter{

@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Calendar cal = Calendar.getInstance();
        int daysofweek = cal.get(cal.DAY_OF_MONTH);
        if (daysofweek == 3) {

            response.getWriter().write("This website is closed on sunday please try accesing"
                    + " it except sunday ");
            return false;

        } else {
            return true;
            
            
        }}
    }
    

