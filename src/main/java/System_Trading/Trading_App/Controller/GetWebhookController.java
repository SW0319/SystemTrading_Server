package System_Trading.Trading_App.Controller;


import System_Trading.Trading_App.Entity.Entity_ReceiveData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Objects;

@Controller
public class GetWebhookController {


    @PostMapping("webhook")
    public String getWebHook(@RequestBody Entity_ReceiveData data)
    {
        System.out.println("position : " + data.getPosition());
        System.out.println("coinname : " + data.getCoin_name());
        System.out.println("TP : " + data.getTake_profit());
        System.out.println("SL : " + data.getStop_loss());

        return "";
    }

    @PostMapping("webhook2")
    public String getWebHook2(@RequestBody HashMap<String, Object> data)
    {
        System.out.println("position : " + data);

        return "";
    }

}
