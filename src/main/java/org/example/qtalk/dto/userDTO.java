package org.example.qtalk.dto;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class userDTO {
    private Long id;
    private String userName;
    private String userPassword;
    private String userPhone;
}