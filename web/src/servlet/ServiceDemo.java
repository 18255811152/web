package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*　HTTP请求中的常用消息头
　　accept:浏览器通过这个头告诉服务器，它所支持的数据类型
　　Accept-Charset: 浏览器通过这个头告诉服务器，它支持哪种字符集
　　Accept-Encoding：浏览器通过这个头告诉服务器，支持的压缩格式
　　Accept-Language：浏览器通过这个头告诉服务器，它的语言环境
　　Host：浏览器通过这个头告诉服务器，想访问哪台主机
　　If-Modified-Since: 浏览器通过这个头告诉服务器，缓存数据的时间
　　Referer：浏览器通过这个头告诉服务器，客户机是哪个页面来的  防盗链
　　Connection：浏览器通过这个头告诉服务器，请求完后是断开链接还是何持链接*/


/*HTTP响应中的常用响应头(消息头)
　　Location: 服务器通过这个头，来告诉浏览器跳到哪里
　　Server：服务器通过这个头，告诉浏览器服务器的型号
　　Content-Encoding：服务器通过这个头，告诉浏览器，数据的压缩格式
　　Content-Length: 服务器通过这个头，告诉浏览器回送数据的长度
　　Content-Language: 服务器通过这个头，告诉浏览器语言环境
　　Content-Type：服务器通过这个头，告诉浏览器回送数据的类型
　　Refresh：服务器通过这个头，告诉浏览器定时刷新
　　Content-Disposition: 服务器通过这个头，告诉浏览器以下载方式打数据
　　Transfer-Encoding：服务器通过这个头，告诉浏览器数据是以分块方式回送的
　　Expires: -1  控制浏览器不要缓存
　　Cache-Control: no-cache
　　Pragma: no-cache*/
public class ServiceDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("sssssssssss");
        resp.setStatus(302);
        resp.setHeader("Location","/web/302.jsp");
        PrintWriter out=resp.getWriter(); //准备输出
        out.println("<html>");
        out.println("<head><title>WEB开发</title></head>");
        out.println("<body>");
        out.println("<h1>Hello World</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();//关闭输出
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       super.doPost(req, resp);
//        resp.setStatus(302);
//        resp.setHeader("Location","/web/302.jsp");
    }
}
