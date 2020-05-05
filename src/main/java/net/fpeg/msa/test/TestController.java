package net.fpeg.msa.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {
    @GetMapping("/mytest")
    Object test(){
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        class TestObject{
            String time;
            String value;
        }
        return new TestObject(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),"asdasd");
    }
}
