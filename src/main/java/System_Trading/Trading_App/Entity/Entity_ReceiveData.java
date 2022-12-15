package System_Trading.Trading_App.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Entity_ReceiveData {

    @Id @GeneratedValue
    int id;
    private String position;
    private float take_profit;
    private float stop_loss;
    private String exchange;
    private String coin_name;

}
