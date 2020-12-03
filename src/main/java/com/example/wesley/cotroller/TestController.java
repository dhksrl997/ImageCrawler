/*
 * COPYRIGHT (c) ADOP 2020
 * This software is the proprietary of ADOP
 *
 * @author <a href=“mailto:wesley@adop.cc“>wesley</a>
 * @since 2020/11/25
 */
package com.example.wesley.cotroller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.*;

/**
 * create on 2020/11/25.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author wesley
 * @version 1.0
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
@Controller
public class TestController {
    @GetMapping("/index")
    public String hello() {
        return "index";
    }

    @GetMapping("/getimg")
    public String get() {
        return "getimg";
    }

    @PostMapping("/gather")
    @ResponseBody
    public List<String> getIMG(String url) throws IOException {
        List<String> list = new ArrayList<>();
//        Map<String, Object> map = new HashMap<>();
        Document doc = Jsoup.connect(url).get();
        Elements img = doc.getElementsByTag("img");

        for (Element e : img)
            list.add(e.attr("src"));


        return list;

    }

}