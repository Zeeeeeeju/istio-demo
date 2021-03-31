package zejuistio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zejuistio.demo.entity.Result;
import zejuistio.demo.entity.User;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${zeju.api}")
    private String url;

    @GetMapping
    public Result get() {
        User[] res = restTemplate.getForObject(url, User[].class);

        Result result = new Result();
        result.setVersion("V2");
        result.setDesc("Zeju said this is version 2 api");
        result.setUsers(res == null ? new ArrayList<>() : Arrays.asList(res));

        return result;
    }

}
