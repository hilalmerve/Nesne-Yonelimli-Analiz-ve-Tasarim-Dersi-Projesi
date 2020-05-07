
package SogutucuDenetleyicisiSistemi;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hilal Merve
 */
public class Publisher implements ISubject{
    private List<IObserver> observers = new ArrayList<>();
    
    @Override
    public void attach(IObserver observer){observers.add(observer);}
    
    @Override
    public void detach(IObserver observer){observers.remove(observer);}
    
    @Override
    public void notify(String uyari){
        for(IObserver observer: observers){
            observer.update(uyari);
        }
    }
}
