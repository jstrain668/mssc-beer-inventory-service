package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.events.BeerDto;
import guru.sfg.brewery.model.events.BeerEvent;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
