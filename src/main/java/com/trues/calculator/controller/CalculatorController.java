package com.trues.calculator.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.trues.calculator.model.Application;

import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num1 = Integer.parseInt(req.getParameter("num1"));
        String operator = req.getParameter("operator");
        int num2 = Integer.parseInt(req.getParameter("num2"));

        System.out.println("num2 = " + num2);
        System.out.println("operator = " + operator);
        System.out.println("num1 = " + num1);

        Application app = new Application();
        int result = app.calc(num1, operator, num2);
    }
}
