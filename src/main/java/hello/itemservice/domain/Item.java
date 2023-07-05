package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "item") 클래스명이랑 테이블명이랑 같으면 생략 가능.
public class Item {

    // @Id는 pk를 의미. generatedValue는 시퀀스같은거 말하는거임. 시퀀스는 아님!!(ex) MySQL auto increment같은거)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
