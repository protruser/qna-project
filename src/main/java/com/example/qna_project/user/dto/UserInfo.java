package com.example.qna_project.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserInfo {

    private Long id;

    private String email;

    private String password;

    private String username;
}
