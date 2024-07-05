package kr.sparta.movieinfo.security;

import kr.sparta.movieinfo.security.model.SignupRequestDto;
import kr.sparta.movieinfo.security.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/signup")
    public User signupPage(@RequestBody SignupRequestDto requestDto) {
        return userService.signup(requestDto);
    }
}