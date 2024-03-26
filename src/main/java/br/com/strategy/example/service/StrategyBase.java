package br.com.strategy.example.service;

import br.com.strategy.example.type.StrategyType;

public interface StrategyBase {

    void execute();

    StrategyType getType();
}
