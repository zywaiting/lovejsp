package com.zy.lovejsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String toIndex(HttpServletRequest request){
        request.setAttribute("test","王倩");
        return "index";
    }

    @RequestMapping("/index/{id}")
    public String toTest1(HttpServletRequest request,@PathVariable Integer id){
        request.setAttribute("test","王倩");
        System.out.println(id);
        return "index";
    }

    @RequestMapping("/test/{test}")
    public String toTest(HttpServletRequest request,@PathVariable String test){
        request.setAttribute("test1","朱瑶爱王倩");
        request.setAttribute("cont","<div class=\"container animate-box fadeInUp animated\">\n" +
                "<div class=\"row\">\n" +
                "<form method=\"post\" action=\"http://h5.hunlipic.com/result.php\">\n" +
                "<div class=\"col-md-12\">\n" +
                "<div class=\"form-group\">\n" +
                "<input type=\"button\" class=\"btn btn-outline btn-block\" onclick=\"shuru()\" value=\"使用默认文字\">\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"col-md-12\">\n" +
                "<div class=\"form-group\">\n" +
                "<input id=\"con1\" name=\"con1\" type=\"text\" class=\"form-control\" placeholder=\"请输入网页标题\">\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"col-md-12\">\n" +
                "<div class=\"form-group\">\n" +
                "<input id=\"con2\" name=\"con2\" type=\"text\" class=\"form-control\" placeholder=\"请输入粒子内容\">\n" +
                "<span class=\"help-block text-center\">（注意：每页内容请使用：\"|\" 符号隔开，建议直接复制符号，避免出错。）</span>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"col-md-12\">\n" +
                "<div class=\"form-group\">\n" +
                "<input id=\"con3\" name=\"con3\" type=\"text\" class=\"form-control\" placeholder=\"请输入背景音乐url地址\">\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"col-md-12\">\n" +
                "<div class=\"form-group\">\n" +
                "<input type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" value=\"立即制作\">\n" +
                "</div>\n" +
                "</div>\n" +
                "</form>\n" +
                "</div>\n" +
                "</div>");
        request.setAttribute("context","function shuru(){\n" +
                "            var con1=document.getElementById('con1');\n" +
                "            var con2=document.getElementById('con2');\n" +
                "            var con3=document.getElementById('con3');\n" +
                "            con1.value='魔幻粒子表白网页';\n" +
                "            con2.value='亲爱的王倩|老婆大人|你即将成为|全世界|最幸福|的妻子。：';\n" +
                "\t\t\tcon3.value='http://t.hunlipic.com/?rzdx';\n" +
                "        }");
        System.out.println(test);
        return test;
    }
    @RequestMapping("/lovetest/{test}")
    public String toLoveTest(HttpServletRequest request,@PathVariable String test){
        request.setAttribute("test1","王倩|老婆大人|你即将成为|全世界|最幸福|女朋友。");

        System.out.println(test);
        return test;
    }

}
