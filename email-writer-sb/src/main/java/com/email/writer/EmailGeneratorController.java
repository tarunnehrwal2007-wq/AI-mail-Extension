package com.email.writer;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGeneratorController {

    private final EmailGeneratorService emailgeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailgeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }

}
