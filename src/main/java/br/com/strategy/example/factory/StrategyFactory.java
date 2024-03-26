package br.com.strategy.example.factory;

import br.com.strategy.example.service.StrategyBase;
import br.com.strategy.example.type.StrategyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Set;

@Component
public class StrategyFactory {


    EnumMap<StrategyType, StrategyBase> strategyServices = new EnumMap<>(StrategyType.class);

    @Autowired
    public StrategyFactory(Set<StrategyBase> strategyBasesAdpters) {
        createStrategy(strategyBasesAdpters);
    }

    private void createStrategy(Set<StrategyBase> strategyBasesAdpters){
        strategyBasesAdpters.forEach(str -> strategyServices.put(str.getType(), str));
    }

    public StrategyBase getStrategy(StrategyType strategyType){
        return strategyServices.get(strategyType);
    }
}
