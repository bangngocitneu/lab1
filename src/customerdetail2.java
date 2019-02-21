import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customerdetail?id=2")
public class customerdetail2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String id = req.getParameter("2");
        resp.getWriter().println("<h2> Chi tiết khách hàng 2</h2>");
        resp.getWriter().println("Họ và tên: Trần Văn Đạt, Tuổi: 19");

    }
}
