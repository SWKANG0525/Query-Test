package deu.cse.parkslab.querytest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
    @PrimaryKey
    private UUID id;
    private String productName;
    private String productPrice;



}