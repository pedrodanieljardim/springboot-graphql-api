package com.br.graphql.api.demo.domain;

import com.br.graphql.api.demo.enums.Currency;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BankAccount {
    UUID id;
    String name;
    Currency currency;
}
