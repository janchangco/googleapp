package com.google.appengine;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GoogletestappServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Woooooooooooo it's working! -Jan");
	}
}
