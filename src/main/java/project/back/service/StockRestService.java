package project.back.service;

import org.springframework.stereotype.Service;
import project.back.dto.StockAddRequest;
import project.back.dto.StockAddResponse;
import project.back.entity.Stock;
import project.back.repository.StockRepository;

import java.util.Optional;

@Service
public class StockRestService {

    private final StockRepository stockRepository;

    public StockRestService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public StockAddResponse getfind(Long id){
        Optional<Stock> optstock = stockRepository.findById(id);
        Stock stock = optstock.get();
        StockAddResponse stockDto = Stock.of2(stock);

        return stockDto;
    }

    public StockAddResponse add(StockAddRequest dto){
        Stock stock = dto.toEntity();
        Stock savedStock = stockRepository.save(stock);
        return new StockAddResponse(savedStock.getId(), savedStock.getItem(), savedStock.getMkp(),
                savedStock.getHipr(), savedStock.getLopr());
    }
}