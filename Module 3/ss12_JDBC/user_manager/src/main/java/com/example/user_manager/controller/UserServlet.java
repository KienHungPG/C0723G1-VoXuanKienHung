package com.example.user_manager.controller;

import com.example.user_manager.model.User;
import com.example.user_manager.service.impl.IUserService;
import com.example.user_manager.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet",value = "/user-servlet")
public class UserServlet extends HttpServlet {
    private final IUserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(req,resp);
                break;
            case "edit":
                showEditForm(req,resp);
                break;
            case "view":
                displayUser(req,resp);
                break;
            case "delete":
                showDeleteForm(req,resp);
                break;
            case "search":
                searchByCountryForm(req,resp);
                break;
            default:
                listUser(req,resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                insertUser(req,resp);
                break;
            case "edit":
                editUser(req,resp);
                break;
            case "delete":
                deleteUser(req,resp);
                break;
            case "search":
                searchByCountryForm(req,resp);
                break;
            default:
                listUser(req,resp);
        }
    }
    private void showEditForm(HttpServletRequest req, HttpServletResponse resq)
            throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        RequestDispatcher requestDispatcher = null;
        User user = userService.findById(id);
        if (user == null) {
            requestDispatcher = req.getRequestDispatcher("view/error-404.jsp");
        } else {
            req.setAttribute("user", user);
            requestDispatcher = req.getRequestDispatcher("view/edit.jsp");
        }
        requestDispatcher.forward(req, resq);

    }
    private void showCreateForm(HttpServletRequest req, HttpServletResponse resq) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/add.jsp");
        requestDispatcher.forward(req, resq);
    }
    private void listUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = userService.selectAllUsers();
        String msg = req.getParameter("msg");
        req.setAttribute("msg", msg);
        req.setAttribute("userList", userList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view/list.jsp");
        dispatcher.forward(req, resp);
    }
    private void displayUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userService.findById(id);
        req.setAttribute("user", user);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/view.jsp");
        requestDispatcher.forward(req, resp);
    }
    private void searchByCountryForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country = req.getParameter("country");
        List<User> userList = userService.findByCountry(country);
        req.setAttribute("userList", userList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/list.jsp");
        requestDispatcher.forward(req, resp);
    }
    private void showDeleteForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userService.findById(id);
        RequestDispatcher dispatcher;
        if (user == null) {
            dispatcher = req.getRequestDispatcher("view/error-404.jsp");
        } else {
            req.setAttribute("user", user);
            dispatcher = req.getRequestDispatcher("/view/delete.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void insertUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(name, email, country);
        userService.insertUser(user);
        resp.sendRedirect("user-servlet");
    }
    private void editUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = userService.findById(id);
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
        userService.updateUser(user);
        resp.sendRedirect("user-servlet");
    }
    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userService.findById(id);
        RequestDispatcher dispatcher;
        if (user == null) {
            dispatcher = req.getRequestDispatcher("view/error-404.jsp");
            try {
                dispatcher.forward(req,resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            userService.deleteUser(id);
            try {
                resp.sendRedirect("user-servlet");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
