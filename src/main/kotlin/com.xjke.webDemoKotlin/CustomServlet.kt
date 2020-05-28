package com.xjke.webDemoKotlin

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/")
class CustomServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        resp!!.setHeader("content-type", "text/html;charset=utf-8")
        resp.run {
            writer.println("测试下哦......")
            writer.close()
        }
    }
}