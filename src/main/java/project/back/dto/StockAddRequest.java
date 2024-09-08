package project.back.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import project.back.entity.Stock;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class StockAddRequest {
    private String item;

    private String mkp;
    private String hipr;
    private String lopr;

    // 사용자에게 값을 입력받아 Entity로 변환함
    // 이때 생성자 대신 Builder를 통해 좀 더 확실히 맵핑하여 데이터 전송함
    public Stock toEntity(){
        Stock stock = Stock.builder()
                .item(this.item)
                .mkp(this.mkp)
                .hipr(this.hipr)
                .lopr(this.lopr)
                .build();

        return stock;
    }
}