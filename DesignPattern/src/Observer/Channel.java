package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Subscriber> list_subscriber=new ArrayList<>();
    public String vedioTitle;

    public void addObsever(Subscriber subscriber){
        this.list_subscriber.add(subscriber);
    }
    public void removeObsever(Subscriber Subscriber ){
        this.list_subscriber.remove(Subscriber);
    }
    public void notifySubscriber(){
        for(Subscriber subscriber:list_subscriber){
            subscriber.update();
        }
    }

    public void uploadVedio(String vedioTitle){
        this.vedioTitle=vedioTitle;
        this.notifySubscriber();
    }

}


