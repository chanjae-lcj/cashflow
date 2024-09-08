package project.back.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StockAddResponse {
    private Long id;
    private String item;
    private String mkp;
    private String hipr;
    private String lopr;
}


