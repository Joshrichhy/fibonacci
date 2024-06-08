package com.semicolon.fibonacci.controller;

import com.semicolon.fibonacci.dto.UserRequest;
import com.semicolon.fibonacci.dto.UserResponse;
import com.semicolon.fibonacci.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/User")
@Tag(name = "Example Controller", description = "Example controller description")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @Operation(summary = "Example API", description = "Description of the example API")
    public ResponseEntity<?> register(@RequestBody UserRequest userRequest) {
        try {
            UserResponse response = userService.register(userRequest);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }

}
