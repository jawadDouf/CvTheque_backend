package com.example.cvthequebackend.responses;


import com.example.cvthequebackend.entities.Cmi;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope("singleton")
public class CmeResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private String phone;

    private String image;

    public CmeResponse to_response(Cmi cmi){
        return CmeResponse.builder()
                .firstName(cmi.getFirstName())
                .lastName(cmi.getLastName())
                .email(cmi.getEmail())
                .phone(cmi.getPhone())
                .image(cmi.getImage())
                .build();
    }

}
