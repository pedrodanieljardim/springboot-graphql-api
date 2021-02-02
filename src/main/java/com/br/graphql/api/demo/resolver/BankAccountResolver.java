package com.br.graphql.api.demo.resolver;

import com.br.graphql.api.demo.domain.BankAccount;
import com.br.graphql.api.demo.enums.Currency;
import graphql.kickstart.tools.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver{
    public BankAccount BackAccount(UUID id){
      log.info("Receiving bankAccount id: {}", id);
      return BankAccount.builder().id(id).currency(Currency.USD).name("Pedro").build();
    }
}
