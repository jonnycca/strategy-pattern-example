package br.com.strategy.example.service;

import br.com.strategy.example.type.StrategyType;
import org.springframework.stereotype.Service;

@Service
public class StrategyTipo1 implements StrategyBase{

    @Override
    public void execute() {
        System.out.println("Estou executando o algoritimo 1");
    }

    @Override
    public StrategyType getType() {
        return StrategyType.TIPO_1;
    }
}
