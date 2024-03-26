package br.com.strategy.example.controller;

import br.com.strategy.example.factory.StrategyFactory;
import br.com.strategy.example.type.StrategyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/strategy")
public class StrategyController {
    StrategyFactory strategyFactory;

    @Autowired
    public StrategyController(StrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    @PostMapping("/{str}")
    public void execute(@PathVariable("str") StrategyType type) {
        strategyFactory.getStrategy(type).execute();
    }
}
