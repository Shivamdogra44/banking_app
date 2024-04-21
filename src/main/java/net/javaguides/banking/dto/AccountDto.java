package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDto {


    private Long id;
    private String accountHolderName;
    private double balance;
}
