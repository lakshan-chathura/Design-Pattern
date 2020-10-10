package Observer;

import javax.swing.event.ChangeEvent;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Channel channel=new Channel();

        Subscriber subscriber1=new Subscriber("lakshan chathura");
        Subscriber subscriber2=new Subscriber("poorni lakmali");
        Subscriber subscriber3=new Subscriber("asoka bulegoda");
        Subscriber subscriber4=new Subscriber("dan kane");
        Subscriber subscriber5=new Subscriber("sammera danu");


        channel.addObsever(subscriber1);
        channel.addObsever(subscriber2);
        channel.addObsever(subscriber3);
        channel.addObsever(subscriber4);
        channel.addObsever(subscriber5);

        

        subscriber1.subscribeChannel(channel);
        subscriber2.subscribeChannel(channel);
        subscriber3.subscribeChannel(channel);
        subscriber4.subscribeChannel(channel);
        subscriber5.subscribeChannel(channel);

        channel.uploadVedio("How to Learn JavaScript");





    }
}
