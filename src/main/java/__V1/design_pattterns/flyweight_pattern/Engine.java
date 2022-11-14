package __V1.design_pattterns.flyweight_pattern;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
@NoArgsConstructor
public class Engine {
    private Double weight;
    private Color color;
    private String manufacturer;
}
