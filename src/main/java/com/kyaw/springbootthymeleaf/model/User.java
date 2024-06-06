/**
 * @Author : Kyaw Zaw Htet
 * @Date : 6/6/2024
 * @Time : 11:42 AM
 * @Project_Name : spring-boot-thymeleaf
 */
package com.kyaw.springbootthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private String role;
    private String gender;
}
