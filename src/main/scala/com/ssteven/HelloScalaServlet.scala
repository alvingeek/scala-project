package com.ssteven

import javax.servlet.annotation.WebServlet
import javax.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSResp}

/**
  * Created by qinwen on 2017/2/24.
  */
@WebServlet(Array("/A", "/B", "C"))
class HelloScalaServlet extends HttpServlet {
  override def doGet(req: HSReq, resp: HSResp): Unit = {
    val s = "Hell, this is a servlet write by scala!"
    resp.getWriter.print(s)
  }
}