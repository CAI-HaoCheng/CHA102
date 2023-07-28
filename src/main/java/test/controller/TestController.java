package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class TestController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var xxx = req.getParameter("xxx");//getParameter取得參數
		req.setAttribute("nickname",xxx);//取得參數後帶入nickname屬性
		System.out.println();
		System.out.println();
		req.getRequestDispatcher("/index.jsp").forward(req, resp);//請求 URL 的路徑資訊，轉跳頁面
	}
}
