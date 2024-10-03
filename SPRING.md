## to create project on vscode

- type in search : "> Spring Initializr : Generate Maven Project"
- Choose Springboot version
- enter project name
- Select java
- Select java version (17)
- Select Dependencies (Spring Web, Lombok, Spring DevTools)
- enter this on the main class

```java
package com.example.demoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoexampleApplication {

    @GetMapping("/hello")
    public String check() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoexampleApplication.class, args);
    }

}
```