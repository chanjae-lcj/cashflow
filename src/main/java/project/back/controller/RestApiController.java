package project.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestApiController {

    @GetMapping("/api/hello")
    public String data() {
        return "스프링 부트에서 가져온 데이터.";
    }

//    @GetMapping("/api/data/stocks/1")
//    public Map<String, Object> getStocks() {
//        Map<String, Object> stockData = new HashMap<>();
//        stockData.put("item", "삼성전자");
//        stockData.put("mkp", "45000");
//        stockData.put("hipr", "80000");
//        stockData.put("lopr", "10000");
//        return stockData;
//    }

    @PostMapping("/api/data/stocks/1")
    public Map<String, Object> postStocks() {
        Map<String, Object> stockData = new HashMap<>();
        stockData.put("item", "삼성전자");
        stockData.put("mkp", "45000");
        stockData.put("hipr", "80000");
        stockData.put("lopr", "10000");
        return stockData;
    }
}