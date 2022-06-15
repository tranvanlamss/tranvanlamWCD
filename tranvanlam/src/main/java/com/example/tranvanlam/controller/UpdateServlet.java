package com.example.tranvanlam.controller;

import com.example.tranvanlam.dao.phoneDAO;
import com.example.tranvanlam.model.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateServlet", value = "/update")
public class UpdateServlet extends HttpServlet {
    phoneDAO dao = new phoneDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        String price = request.getParameter("price");
        String description = request.getParameter("description");

        Phone phone = new Phone();
        phone.setName(name);
        phone.setBrand(brand);
        phone.setPrice(Integer.parseInt(price));
        phone.setDescription(description);

        dao.updatePhone(phone);
        response.sendRedirect("list");
    }
}
