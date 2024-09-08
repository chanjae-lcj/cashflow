package project.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.back.dto.StockAddRequest;
import project.back.dto.StockAddResponse;
import project.back.service.StockRestService;

@RestController
@RequestMapping("/api/data/stocks")
public class StockRestController {

    private final StockRestService stockRestService;

    public StockRestController(StockRestService stockRestService) {
        this.stockRestService = stockRestService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockAddResponse> getfind(@PathVariable Long id){
        return ResponseEntity.ok().body(stockRestService.getfind(id));
    }

    @PostMapping
    public ResponseEntity<StockAddResponse> addArticle(@RequestBody StockAddRequest dto) {
        // @RequestBody를 통해 json 형식으로 받음
        StockAddResponse response = stockRestService.add(dto);
        return ResponseEntity.ok().body(response);
    }
}