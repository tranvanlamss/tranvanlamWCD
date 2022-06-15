package com.example.tranvanlam.controller;

import com.example.tranvanlam.dao.phoneDAO;
import com.example.tranvanlam.model.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListPhoneServlet", value = "/list")
public class ListPhoneServlet extends HttpServlet {
    phoneDAO dao = new phoneDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("phones", getPhone());
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected List<Phone> getPhone(){
        List<Phone> list = dao.getPhone();
        return list;
    }

}
