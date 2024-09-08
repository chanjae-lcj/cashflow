package project.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.back.dto.StockAddResponse;

@Entity
//@Table(name = "stocks")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item;

    private String mkp;
    private String hipr;
    private String lopr;

    public Stock(String item, String mkp, String hipr, String lopr) {
        this.item = item;
        this.mkp = mkp;
        this.hipr = hipr;
        this.lopr = lopr;
    }

    // StockEntity를 StockAddResponse DTO로 만들어주는 부분
    public static StockAddResponse of2(Stock stock) {
        return new StockAddResponse(stock.getId(),
                stock.getItem(), stock.getMkp(), stock.getHipr(), stock.getLopr());
    }
}