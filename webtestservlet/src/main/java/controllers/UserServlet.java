package controllers;

import com.google.gson.Gson;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServlet extends HttpServlet {
    List<User> userList = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Hello from servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        BufferedReader reader = req.getReader();
//        StringBuffer bodyFromClient = new StringBuffer("");
//        String buf = "";
//        while ((buf = reader.readLine()) != null) {
//            bodyFromClient.append(buf);
//        }
//
//        Gson gson = new Gson();
//        User user = gson.fromJson(bodyFromClient.toString(), User.class);
//        userList.add(user);
//        PrintWriter writer = resp.getWriter();
//        writer.println(userList.stream().map(usr -> usr.getName()).collect(Collectors.toList()));
//        resp.setStatus(200);

        String name = req.getParameter("name");
        User user = new User(name);
        userList.add(user);
        req.setAttribute("usersList", userList);
        req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }
}
