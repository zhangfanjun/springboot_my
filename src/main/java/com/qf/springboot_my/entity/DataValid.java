package com.qf.springboot_my.entity;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class DataValid {
    @NonNull
    private int id;
    @NotBlank
    private String name;
    @Email(message = "邮箱有误")
    private String email;
    @Min(18)
    private int age;
    @Pattern(regexp = "^1(3|8)\\d{9}$" ,message="手机号码不符合要求")
    private String phone;
}
