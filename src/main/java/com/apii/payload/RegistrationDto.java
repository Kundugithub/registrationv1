package com.apii.payload;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class RegistrationDto {
    @NotEmpty
    @Size(min=2,message = "Min should be 2 letters")
   private String name;
   @Email
    private String email;

   @Size(min=10,max=10, message ="Should be 10 digits")
    private String mobile;

}