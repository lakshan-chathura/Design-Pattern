package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println(this.name+" "+this.channel.vedioTitle);
    }

    public void subscribeChannel(Channel channel){
        this.channel=channel;
    }

}
