import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customerdetail?id=1")
public class customerdetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String id = req.getParameter("1");
        resp.getWriter().println("<h2> Chi tiết khách hàng 1</h2>");
        resp.getWriter().println("Họ và tên: Phạm Văn Thanh, Tuổi: 22");

    }
}
